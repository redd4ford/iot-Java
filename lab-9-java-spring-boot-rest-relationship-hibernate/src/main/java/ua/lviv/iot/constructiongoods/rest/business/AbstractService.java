package ua.lviv.iot.constructiongoods.rest.business;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractService<T> {
  protected abstract JpaRepository<T, Integer> getRepository();

  public List<T> getAll() {
    return getRepository().findAll();
  }

  public T getById(Integer id) {
    return getRepository().getOne(id);
  }

  public T create(T newObject) {
    return getRepository().save(newObject);
  }

  public T update(Integer id, T object) {
    if (getRepository().findById(id).isPresent()) {
      return getRepository().save(object);
    } else {
      return null;
    }
  }

  public void deleteById(Integer id) {
    if (getRepository().findById(id).isPresent()) {
      getRepository().deleteById(id);
    }
  }

}