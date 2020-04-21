package ua.lviv.iot.constructiongoods.managerTest;

import org.junit.jupiter.api.BeforeEach;
import java.util.LinkedList;
import java.util.List;
import ua.lviv.iot.constructiongoods.model.*;

public class BaseConstructionGoodsManagerTest {
  protected List<AbstractConstructionGoods> goods;

  @BeforeEach
  void setUp() {
    this.goods = new LinkedList<AbstractConstructionGoods>();
    this.goods.add(new Bath("China", 50.25, "white", 320, 200, 100, State.NEW, Material.QUARYL,
                   InstallationMethod.BUILTIN, Form.CORNER));
    this.goods.add(new Toilet("Ukraine", 20.20, "black", 100, 50, 50, State.NEW,
                   Material.ACRYLIC, true, true, DrainType.VERTICAL));
    this.goods.add(new Oven("USA", 70.75, "black", 80, 50, 50, State.SECONDHAND,
                   StoveType.ELECTRIC, 30, true, false, 5));
  }

}