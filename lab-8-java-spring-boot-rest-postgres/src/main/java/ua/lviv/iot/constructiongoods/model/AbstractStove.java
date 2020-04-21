package ua.lviv.iot.constructiongoods.model;

public abstract class AbstractStove extends AbstractConstructionGoods {

  protected StoveType stoveType;

  public AbstractStove() {
    super();
  }

  public AbstractStove(String producerName, double priceInUah, String color,
                       Integer weightInKilograms, double lengthInCentimeters,
                       double widthInCentimeters, State state, StoveType stoveType) {
    super(producerName, priceInUah, color, weightInKilograms, lengthInCentimeters,
          widthInCentimeters, state);
    this.stoveType = stoveType;
  }

  public String getHeaders() {
    return super.getHeaders() + "," + "stoveType";
  }

  public String toCsv() {
    return super.toCsv() + "," + getStoveType();
  }

  public StoveType getStoveType() {
    return stoveType;
  }

  public void setStoveType(StoveType stoveType) {
    this.stoveType = stoveType;
  }

}