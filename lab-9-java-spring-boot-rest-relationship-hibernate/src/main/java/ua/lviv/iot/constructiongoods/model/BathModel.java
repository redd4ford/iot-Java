package ua.lviv.iot.constructiongoods.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.util.Set;

@Entity
public class BathModel {

  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  private Integer id;

  @Column
  private String name;
  @Column
  private String vendorCode;
  @Column
  private Integer yearOfManufacture;

  @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @JsonIgnoreProperties("model")
  public Set<Bath> baths;

  public BathModel() {
  }

  public BathModel(String name, String vendorCode, Integer yearOfManufacture) {
    this.name = name;
    this.vendorCode = vendorCode;
    this.yearOfManufacture = yearOfManufacture;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getVendorCode() {
    return vendorCode;
  }

  public void setVendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
  }

  public Integer getYearOfManufacture() {
    return yearOfManufacture;
  }

  public void setYearOfManufacture(Integer yearOfManufacture) {
    this.yearOfManufacture = yearOfManufacture;
  }

  public Set<Bath> getBaths() {
    return baths;
  }

  public void setBaths(Set<Bath> baths) {
    this.baths = baths;
  }
}
