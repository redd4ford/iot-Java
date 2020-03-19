package ua.lviv.iot.constructiongoods.managerTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import ua.lviv.iot.constructiongoods.manager.ConstructionGoodsManager;
import ua.lviv.iot.constructiongoods.model.AbstractConstructionGoods;

public class ConstructionGoodsManagerTest extends BaseConstructionGoodsManagerTest {

  @Test
  public void testFindGoodsCheaperThan() {
    ConstructionGoodsManager manager = new ConstructionGoodsManager();
    double testPriceInUah = 60.50;
    List<AbstractConstructionGoods> result = manager.findGoodsCheaperThan(testPriceInUah, goods);

    assertEquals(50.25, goods.get(0).getPriceInUah());
    assertEquals(20.20, goods.get(1).getPriceInUah());
    assertEquals(70.75, goods.get(2).getPriceInUah());
  }

}