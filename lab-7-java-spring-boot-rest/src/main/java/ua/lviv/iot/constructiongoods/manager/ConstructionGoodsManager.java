package ua.lviv.iot.constructiongoods.manager;

import java.util.LinkedList;
import java.util.List;
import ua.lviv.iot.constructiongoods.model.AbstractConstructionGoods;

public class ConstructionGoodsManager {

  public ConstructionGoodsManager() {
  }

  public List<AbstractConstructionGoods> findGoodsCheaperThan(double price,
                                                            List<AbstractConstructionGoods> goods) {
    List<AbstractConstructionGoods> result = new LinkedList<>();
    for (int goodFromTheList = 0; goodFromTheList < goods.size(); goodFromTheList++) {
      if (goods.get(goodFromTheList).getPriceInUah() < price) {
        result.add(goods.get(goodFromTheList));
        System.out.println("Found good #" + (goodFromTheList + 1) + " matching the criteria"
                       + " with price " + goods.get(goodFromTheList).getPriceInUah());
      } else {
        System.out.println("Good #" + (goodFromTheList + 1) + " does not match the criteria");
      }
    }
    return result;
  }

}
