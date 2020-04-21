package ua.lviv.iot.constructiongoods.model;

public class Toilet extends AbstractPlumbing {

  private boolean hasTank;
  private boolean hasSit;
  private DrainType drainType;

  public Toilet() {
    super();
  }

  public Toilet(String producerName, double priceInUah, String color, Integer weightInKilograms,
                double lengthInCentimeters, double widthInCentimeters, State state,
                Material material, boolean hasTank, boolean hasSit, DrainType drainType) {
    super(producerName, priceInUah, color, weightInKilograms, lengthInCentimeters,
          widthInCentimeters, state, material);
    this.hasTank = hasTank;
    this.hasSit = hasSit;
    this.drainType = drainType;
  }

  public String getHeaders() {
    return super.getHeaders() + "," + "hasTank" + "," + "hasSit" + "," + "drainType";
  }

  public String toCsv() {
    return super.toCsv() + "," + hasTank() + "," + hasSit() + "," + getDrainType();
  }

  public boolean hasTank() {
    return hasTank;
  }

  public void setTank(boolean hasTank) {
    this.hasTank = hasTank;
  }

  public boolean hasSit() {
    return hasSit;
  }

  public void setSit(boolean hasSit) {
    this.hasSit = hasSit;
  }

  public DrainType getDrainType() {
    return drainType;
  }

  public void setDrainType(DrainType drainType) {
    this.drainType = drainType;
  }

}