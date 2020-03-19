package ua.lviv.iot.constructiongoods.model;

public class Sink extends AbstractPlumbing {

  private double depthInCentimeters;
  private double heightInCentimeters;
  private boolean hasMixerHole;
  private Form form;

  public Sink() {
    super();
  }

  public Sink(String producerName, double priceInUah, String color, Integer weightInKilograms,
              double lengthInCentimeters, double widthInCentimeters, State state,
              Material material, double depthInCentimeters, double heightInCentimeters,
              boolean hasMixerHole, Form form) {
    super(producerName, priceInUah, color, weightInKilograms, lengthInCentimeters,
          widthInCentimeters, state, material);
    this.depthInCentimeters = depthInCentimeters;
    this.heightInCentimeters = heightInCentimeters;
    this.hasMixerHole = hasMixerHole;
    this.form = form;
  }

  public String getHeaders() {
    return super.getHeaders() + "," + "depthInCentimetres" + "," + "heightInCentimeters" + ","
                              + "hasMixerHole" + "," + "form";
  }

  public String toCsv() {
    return super.toCsv() + "," + getDepthInCentimeters() + "," + getHeightInCentimeters() + ","
                         + hasMixerHole() + "," + getForm();
  }

  public double getDepthInCentimeters() {
    return depthInCentimeters;
  }

  public void setDepthInCentimeters(double depthInCentimeters) {
    this.depthInCentimeters = depthInCentimeters;
  }

  public double getHeightInCentimeters() {
    return heightInCentimeters;
  }

  public void setHeightInCentimeters(double heightInCentimeters) {
    this.heightInCentimeters = heightInCentimeters;
  }

  public boolean hasMixerHole() {
    return hasMixerHole;
  }

  public void setHasMixerHole(boolean hasMixerHole) {
    this.hasMixerHole = hasMixerHole;
  }

  public Form getForm() {
    return form;
  }

  public void setForm(Form form) {
    this.form = form;
  }

}