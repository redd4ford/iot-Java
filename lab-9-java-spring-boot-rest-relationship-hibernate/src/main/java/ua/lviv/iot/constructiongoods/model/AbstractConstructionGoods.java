package ua.lviv.iot.constructiongoods.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractConstructionGoods {

  protected String producerName;
  protected double priceInUah;
  protected String color;
  protected Integer weightInKilograms;
  protected double lengthInCentimeters;
  protected double widthInCentimeters;
  protected State state;

  public AbstractConstructionGoods() {
  }

  public AbstractConstructionGoods(String producerName, double priceInUah, String color,
                                     Integer weightInKilograms, double lengthInCentimeters,
                                     double widthInCentimeters, State state) {
    this.producerName = producerName;
    this.priceInUah = priceInUah;
    this.color = color;
    this.weightInKilograms = weightInKilograms;
    this.lengthInCentimeters = lengthInCentimeters;
    this.widthInCentimeters = widthInCentimeters;
    this.state = state;
  }

  public String getHeaders() {
    return "producerName" + "," + "priceInUah" + "," + "color" + "," + "weightInKilograms" + ","
            + "lengthInCentimeters" + "," + "widthInCentimeters" + "," + "state";
  }

  public String toCsv() {
    return getProducerName() + "," + getPriceInUah() + "," + getColor() + ","
            + getWeightInKilograms() + "," + getLengthInCentimeters() + ","
            + getWidthInCentimeters() + "," + getState();
  }

  public String getProducerName() {
    return producerName;
  }

  public void setProducerName(String producerName) {
    this.producerName = producerName;
  }

  public double getPriceInUah() {
    return priceInUah;
  }

  public void setPriceInUah(double priceInUah) {
    this.priceInUah = priceInUah;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Integer getWeightInKilograms() {
    return weightInKilograms;
  }

  public void setWeightInKilograms(Integer weightInKilograms) {
    this.weightInKilograms = weightInKilograms;
  }

  public double getLengthInCentimeters() {
    return lengthInCentimeters;
  }

  public void setLengthInCentimeters(double lengthInCentimeters) {
    this.lengthInCentimeters = lengthInCentimeters;
  }

  public double getWidthInCentimeters() {
    return widthInCentimeters;
  }

  public void setWidthInCentimeters(double widthInCentimeters) {
    this.widthInCentimeters = widthInCentimeters;
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

}