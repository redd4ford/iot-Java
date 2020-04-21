package ua.lviv.iot.constructiongoods.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.constructiongoods.model.Bath;
import ua.lviv.iot.constructiongoods.rest.business.BathService;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


@RequestMapping("/baths")
@RestController
public class BathController {
  private AtomicInteger idCounter = new AtomicInteger();
  @Autowired
  private BathService bathService;

  @GetMapping
  public List<Bath> getBaths() {
    return bathService.getBaths();
  }

  @GetMapping(path = "/{id}")
  public ResponseEntity<Bath> getBath(@PathVariable("id") Integer bathId) {
    return bathService.getBathById(bathId);
  }

  @PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
  public Bath createBath(final @RequestBody Bath bath) {
    bath.setId(idCounter.incrementAndGet());
    bathService.createBath(bath);
    return bath;
  }

  @PutMapping(path = "/{id}")
  public ResponseEntity<Bath> updateBath(final @PathVariable("id") Integer bathId,
                                         final @RequestBody Bath bath) {
    bath.setId(bathId);
    return bathService.updateBath(bathId, bath);
  }

  @DeleteMapping(path = "/{id}")
  public ResponseEntity<Bath> deleteBath(@PathVariable("id") Integer bathId) {
    return bathService.deleteBath(bathId);
  }

}
