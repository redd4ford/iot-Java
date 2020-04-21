package ua.lviv.iot.constructiongoods.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Bath extends AbstractPlumbing {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  protected Integer id;

  @Column
  private InstallationMethod installationMethod;
  @Column
  private Form form;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name="bath_model_id")
  @JsonIgnoreProperties("baths")
  private BathModel model;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(name = "baths_customers",
             joinColumns = {@JoinColumn(name = "bath_id", nullable = false)},
             inverseJoinColumns = {@JoinColumn(name = "customer_id", nullable = true)})
  @JsonIgnoreProperties("baths")
  private Set<Customer> customers;

  public Bath() {
    super();
  }

  public Bath(String producerName, double priceInUah, String color, Integer weightInKilograms,
              double lengthInCentimeters, double widthInCentimeters, State state,
              Material material, InstallationMethod installationMethod, Form form) {
    super(producerName, priceInUah, color, weightInKilograms, lengthInCentimeters,
          widthInCentimeters, state, material);
    this.installationMethod = installationMethod;
    this.form = form;
  }

  public String getHeaders() {
    return super.getHeaders() + "," + "installationMethod" + "," + "form";
  }

  public String toCsv() {
    return super.toCsv() + "," + getInstallationMethod() + "," + getForm();
  }

  public InstallationMethod getInstallationMethod() {
    return installationMethod;
  }

  public void setInstallationMethod(InstallationMethod installationMethod) {
    this.installationMethod = installationMethod;
  }

  public Form getForm() {
    return form;
  }

  public void setForm(Form form) {
    this.form = form;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public BathModel getModel() {
    return model;
  }

  public void setModel(BathModel model) {
    this.model = model;
  }

  public Set<Customer> getCustomers() {
    return customers;
  }

  public void setCustomers(Set<Customer> customers) {
    this.customers = customers;
  }

}