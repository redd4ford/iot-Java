package ua.lviv.iot.constructiongoods.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.constructiongoods.model.BathModel;
import ua.lviv.iot.constructiongoods.rest.business.BathModelService;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RequestMapping("/bathmodels")
@RestController
public class BathModelController {
  private AtomicInteger bathModelIdCounter = new AtomicInteger();
  @Autowired
  private BathModelService bathModelService;

  @GetMapping
  public List<BathModel> getBathModels() {
    return bathModelService.getAll();
  }

  @GetMapping(path = "/{id}")
  public ResponseEntity<BathModel> getBathModelById(@PathVariable("id") Integer bathModelId) {
    if (bathModelService.getById(bathModelId) != null) {
      return new ResponseEntity<>(bathModelService.getById(bathModelId), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
  public BathModel createBathModel(final @RequestBody BathModel bathModel) {
    bathModel.setId(bathModelIdCounter.incrementAndGet());
    bathModelService.create(bathModel);

    return bathModel;
  }

  @PutMapping(path = "/{id}")
  public ResponseEntity<BathModel> updateBathModel(final @PathVariable("id") Integer bathModelId,
                                                   final @RequestBody BathModel bathModel) {
    if (bathModelService.getById(bathModelId) != null) {
      bathModel.setId(bathModelId);
      return new ResponseEntity<>(bathModelService.update(bathModelId, bathModel),
                                  HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @DeleteMapping(path = "/{id}")
  public ResponseEntity<BathModel> deleteBathModel(@PathVariable("id") Integer bathModelId) {
    if (bathModelService.getById(bathModelId) != null) {
      bathModelService.deleteById(bathModelId);
      return new ResponseEntity<>(HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

}