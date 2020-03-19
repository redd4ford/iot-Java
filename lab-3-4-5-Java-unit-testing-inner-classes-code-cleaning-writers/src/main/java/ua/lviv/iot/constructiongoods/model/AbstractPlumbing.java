package ua.lviv.iot.constructiongoods.model;

public abstract class AbstractPlumbing extends AbstractConstructionGoods {

  protected Material material;

  public AbstractPlumbing() {
    super();
  }

  public AbstractPlumbing(String producerName, double priceInUah, String color,
                          Integer weightInKilograms, double lengthInCentimeters,
                          double widthInCentimeters, State state, Material material) {
    super(producerName, priceInUah, color, weightInKilograms, lengthInCentimeters,
              widthInCentimeters, state);
    this.material = material;
  }

  public String getHeaders() {
    return super.getHeaders() + "," + "material";
  }

  public String toCsv() {
    return super.toCsv() + "," + getMaterial();
  }

  public Material getMaterial() {
    return material;
  }

  public void setMaterial(Material material) {
    this.material = material;
  }

}