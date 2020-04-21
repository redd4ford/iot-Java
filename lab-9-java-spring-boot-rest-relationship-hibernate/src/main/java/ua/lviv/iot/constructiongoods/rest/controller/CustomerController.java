package ua.lviv.iot.constructiongoods.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.constructiongoods.model.Customer;
import ua.lviv.iot.constructiongoods.rest.business.CustomerService;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RequestMapping("/customers")
@RestController
public class CustomerController {
  private AtomicInteger customerIdCounter = new AtomicInteger();
  @Autowired
  private CustomerService customerService;


  @GetMapping
  public List<Customer> getCustomers() {
    return customerService.getAll();
  }

  @GetMapping(path = "/{id}")
  public ResponseEntity<Customer> getCustomerById(@PathVariable("id") Integer customerId) {
    if (customerService.getById(customerId) != null) {
      return new ResponseEntity<>(customerService.getById(customerId), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
  public Customer createCustomer(final @RequestBody Customer customer) {
    customer.setId(customerIdCounter.incrementAndGet());
    customerService.create(customer);

    return customer;
  }

  @PutMapping(path = "/{id}")
  public ResponseEntity<Customer> updateCustomer(final @PathVariable("id") Integer customerId,
                                                 final @RequestBody Customer customer) {
    if (customerService.getById(customerId) != null) {
      customer.setId(customerId);
      return new ResponseEntity<>(customerService.update(customerId, customer),
                                  HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @DeleteMapping(path = "/{id}")
  public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") Integer customerId) {
    if (customerService.getById(customerId) != null) {
      customerService.deleteById(customerId);
      return new ResponseEntity<>(HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

}