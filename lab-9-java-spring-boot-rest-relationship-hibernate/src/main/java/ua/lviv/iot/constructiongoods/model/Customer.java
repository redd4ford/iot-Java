package ua.lviv.iot.constructiongoods.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  private Integer id;

  @Column
  private String fullName;
  @Column
  private Integer ageInFullYears;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "baths_customers",
             joinColumns = {@JoinColumn(name = "customer_id", nullable = false)},
             inverseJoinColumns = {@JoinColumn(name = "bath_id", nullable = false)})
  @JsonIgnoreProperties("customers")
  private Set<Bath> baths;

  public Customer() {
  }

  public Customer(String fullName, Integer ageInFullYears) {
    this.fullName = fullName;
    this.ageInFullYears = ageInFullYears;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Integer getAgeInFullYears() {
    return ageInFullYears;
  }

  public void setAgeInFullYears(Integer ageInFullYears) {
    this.ageInFullYears = ageInFullYears;
  }

  public Set<Bath> getBaths() {
    return baths;
  }

  public void setBaths(Set<Bath> baths) {
    this.baths = baths;
  }

}
