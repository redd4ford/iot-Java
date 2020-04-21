package ua.lviv.iot.constructiongoods.rest.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.constructiongoods.model.Bath;
import ua.lviv.iot.constructiongoods.rest.dataaccess.BathRepository;

@Service
public class BathService extends AbstractService<Bath> {
  @Autowired
  private BathRepository bathRepository;

  @Override
  protected JpaRepository<Bath, Integer> getRepository() {
    return bathRepository;
  }

}

