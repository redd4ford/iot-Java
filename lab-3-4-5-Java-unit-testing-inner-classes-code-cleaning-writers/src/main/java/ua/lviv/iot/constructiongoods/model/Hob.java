package ua.lviv.iot.constructiongoods.model;

public class Hob extends AbstractStove {

  private BurnerType burnerType;
  private Integer numberOfBurners;

  public Hob() {
    super();
  }

  public Hob(String producerName, double priceInUah, String color, Integer weightInKilograms,
            double lengthInCentimeters, double widthInCentimeters, State state,
            StoveType stoveType, BurnerType burnerType, Integer numberOfBurners) {
    super(producerName, priceInUah, color, weightInKilograms, lengthInCentimeters,
         widthInCentimeters, state, stoveType);
    this.burnerType = burnerType;
    this.numberOfBurners = numberOfBurners;
  }

  public String getHeaders() {
    return super.getHeaders() + "," + "burnerType" + "," + "numberOfBurners";
  }

  public String toCsv() {
    return super.toCsv() + "," + getBurnerType() + "," + getNumberOfBurners();
  }

  public BurnerType getBurnerType() {
    return burnerType;
  }

  public void setBurnerType(BurnerType burnerType) {
    this.burnerType = burnerType;
  }

  public Integer getNumberOfBurners() {
    return numberOfBurners;
  }

  public void setNumberOfBurners(Integer numberOfBurners) {
    this.numberOfBurners = numberOfBurners;
  }

}