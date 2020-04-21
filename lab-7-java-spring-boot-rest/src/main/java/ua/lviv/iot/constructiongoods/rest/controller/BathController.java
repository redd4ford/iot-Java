package ua.lviv.iot.constructiongoods.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.constructiongoods.model.Bath;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RequestMapping("/baths")
@RestController
public class BathController {
  private Map<Integer, Bath> baths = new HashMap();
  private AtomicInteger idCounter = new AtomicInteger();

  @GetMapping
  public List<Bath> getBaths() {
    return new LinkedList<Bath>(baths.values());
  }

  @GetMapping(path = "/{id}")
  public Bath getBath(@PathVariable("id") Integer bathId) {
    return baths.get(bathId);
  }

  @PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
  public Bath createGood(final @RequestBody Bath bath) {
    bath.setId(idCounter.incrementAndGet());
    baths.put(bath.getId(), bath);

    return bath;
  }

  @DeleteMapping(path = "/{id}")
  public ResponseEntity<Bath> deleteBath(@PathVariable("id") Integer bathId) {
    HttpStatus status = baths.remove(bathId) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;

    return ResponseEntity.status(status).build();
  }

  @PutMapping(path = "/{id}")
  public ResponseEntity<Bath> updateGood(final @PathVariable("id") Integer bathId,
                                         final @RequestBody Bath bath) {
    bath.setId(bathId);
    HttpStatus status = baths.put(bathId, bath) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
    return ResponseEntity.status(status).build();
  }

}
