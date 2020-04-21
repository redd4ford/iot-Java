package ua.lviv.iot.constructiongoods.rest.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.constructiongoods.model.BathModel;
import ua.lviv.iot.constructiongoods.rest.dataaccess.BathModelRepository;

@Service
public class BathModelService extends AbstractService<BathModel> {
  @Autowired
  private BathModelRepository bathModelRepository;

  @Override
  protected JpaRepository<BathModel, Integer> getRepository() {
    return bathModelRepository;
  }

}
