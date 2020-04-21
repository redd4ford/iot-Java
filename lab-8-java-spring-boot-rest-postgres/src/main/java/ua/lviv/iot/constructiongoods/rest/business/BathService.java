package ua.lviv.iot.constructiongoods.rest.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ua.lviv.iot.constructiongoods.rest.dataaccess.BathRepository;
import ua.lviv.iot.constructiongoods.model.Bath;
import java.util.List;

@Service
public class BathService {
  @Autowired
  private BathRepository bathRepository;

  public List<Bath> getBaths() {
    return bathRepository.findAll();
  }

  public ResponseEntity<Bath> getBathById(Integer bathId) {
    if (bathRepository.findById(bathId).isPresent()) {
      return new ResponseEntity<>(bathRepository.getOne(bathId), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  public Bath createBath(Bath bath) {
    return bathRepository.save(bath);
  }

  public ResponseEntity<Bath> updateBath(Integer bathId, Bath updatedBath) {
    if (bathRepository.findById(bathId).isPresent()) {
      Bath bath = bathRepository.getOne(bathId);
      bath = updatedBath;
      bathRepository.save(bath);

      return new ResponseEntity<>(bath, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  public ResponseEntity<Bath> deleteBath(Integer bathId) {
    if (bathRepository.findById(bathId).isPresent()) {
      bathRepository.deleteById(bathId);
      return new ResponseEntity<>(HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

}
