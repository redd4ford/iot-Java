package ua.lviv.iot.constructiongoods.model;

public class Oven extends AbstractStove {

  private Integer volumeInLitres;
  private boolean hasBacklight;
  private boolean hasDisplay;
  private Integer numberOfPrograms;

  public Oven() {
    super();
  }

  public Oven(String producerName, double priceInUah, String color, Integer weightInKilograms,
              double lengthInCentimeters, double widthInCentimeters, State state,
              StoveType stoveType, Integer volumeInLitres, boolean hasBacklight,
              boolean hasDisplay, Integer numberOfPrograms) {
    super(producerName, priceInUah, color, weightInKilograms, lengthInCentimeters,
          widthInCentimeters, state, stoveType);
    this.volumeInLitres = volumeInLitres;
    this.hasBacklight = hasBacklight;
    this.hasDisplay = hasDisplay;
    this.numberOfPrograms = numberOfPrograms;
  }

  public String getHeaders() {
    return super.getHeaders() + "," + "volumeInLitres" + "," + "hasBacklight" + "," + "hasDisplay"
                              + "," + "numberOfPrograms";
  }

  public String toCsv() {
    return super.toCsv() + "," + getVolumeInLitres() + "," + hasBacklight() + "," + hasDisplay()
                         + "," + getNumberOfPrograms();
  }

  public Integer getVolumeInLitres() {
    return volumeInLitres;
  }

  public void setVolumeInLitres(Integer volumeInLitres) {
    this.volumeInLitres = volumeInLitres;
  }

  public boolean hasBacklight() {
    return hasBacklight;
  }

  public void setBacklight(boolean hasBacklight) {
    this.hasBacklight = hasBacklight;
  }

  public boolean hasDisplay() {
    return hasDisplay;
  }

  public void setDisplay(boolean hasDisplay) {
    this.hasDisplay = hasDisplay;
  }

  public Integer getNumberOfPrograms() {
    return numberOfPrograms;
  }

  public void setNumberOfPrograms(Integer numberOfPrograms) {
    this.numberOfPrograms = numberOfPrograms;
  }

}