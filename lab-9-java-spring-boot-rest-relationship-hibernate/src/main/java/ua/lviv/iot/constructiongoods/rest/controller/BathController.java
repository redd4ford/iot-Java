package ua.lviv.iot.constructiongoods.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.constructiongoods.model.Bath;
import ua.lviv.iot.constructiongoods.rest.business.BathService;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


@RequestMapping("/baths")
@RestController
public class BathController {
  private AtomicInteger bathIdCounter = new AtomicInteger();
  @Autowired
  private BathService bathService;

  @GetMapping
  public List<Bath> getBaths() {
    return bathService.getAll();
  }

  @GetMapping(path = "/{id}")
  public ResponseEntity<Bath> getBathById(@PathVariable("id") Integer bathId) {
    if (bathService.getById(bathId) != null) {
      return new ResponseEntity<>(bathService.getById(bathId), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
  public Bath createBath(final @RequestBody Bath bath) {
    bath.setId(bathIdCounter.incrementAndGet());
    bathService.create(bath);

    return bath;
  }

  @PutMapping(path = "/{id}")
  public ResponseEntity<Bath> updateBath(final @PathVariable("id") Integer bathId,
                                         final @RequestBody Bath bath) {
    if (bathService.getById(bathId) != null) {
      bath.setId(bathId);
      return new ResponseEntity<>(bathService.update(bathId, bath),
          HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @DeleteMapping(path = "/{id}")
  public ResponseEntity<Bath> deleteBath(@PathVariable("id") Integer bathId) {
    if (bathService.getById(bathId) != null) {
      bathService.deleteById(bathId);
      return new ResponseEntity<>(HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

}
