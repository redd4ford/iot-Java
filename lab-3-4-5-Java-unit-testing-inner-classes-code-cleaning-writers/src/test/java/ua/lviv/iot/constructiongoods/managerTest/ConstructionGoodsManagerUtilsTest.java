package ua.lviv.iot.constructiongoods.managerTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import ua.lviv.iot.constructiongoods.manager.ConstructionGoodsManagerUtils;
import ua.lviv.iot.constructiongoods.manager.SortType;

public class ConstructionGoodsManagerUtilsTest extends BaseConstructionGoodsManagerTest {

  @Test
  public void testSortByWeight() {
    ConstructionGoodsManagerUtils.sortByWeight(goods, SortType.ASCENDING);
    assertEquals(80, goods.get(0).getWeightInKilograms());
    assertEquals(100, goods.get(1).getWeightInKilograms());
    assertEquals(320, goods.get(2).getWeightInKilograms());
  }

  @Test
  public void testSortByWidth() {
    ConstructionGoodsManagerUtils.sortByWidth(goods, SortType.DESCENDING);
    assertEquals(100, goods.get(0).getWidthInCentimeters());
    assertEquals(50, goods.get(1).getWidthInCentimeters());
    assertEquals(50, goods.get(2).getWidthInCentimeters());
  }

  @Test
  public void testSortByProducerName() {
    ConstructionGoodsManagerUtils.sortByProducerName(goods, SortType.ASCENDING);
    assertEquals("China", goods.get(0).getProducerName());
    assertEquals("USA", goods.get(1).getProducerName());
    assertEquals("Ukraine", goods.get(2).getProducerName());
  }

  @Test
  public void testSortByColor() {
    ConstructionGoodsManagerUtils.sortByColor(goods, SortType.DESCENDING);
    assertEquals("black", goods.get(0).getColor());
    assertEquals("black", goods.get(1).getColor());
    assertEquals("white", goods.get(2).getColor());
  }

}