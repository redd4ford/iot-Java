package ua.lviv.iot.constructiongoods.rest.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.constructiongoods.model.Customer;
import ua.lviv.iot.constructiongoods.rest.dataaccess.CustomerRepository;

@Service
public class CustomerService extends AbstractService<Customer> {
  @Autowired
  private CustomerRepository customerRepository;

  @Override
  protected JpaRepository<Customer, Integer> getRepository() {
    return customerRepository;
  }

}
