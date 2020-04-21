package ua.lviv.iot.constructiongoods.manager;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.constructiongoods.model.AbstractConstructionGoods;

public class ConstructionGoodsManagerUtils {

  //static inner class
  static class ConstructionGoodsSorterByWeight implements Comparator<AbstractConstructionGoods>,
          Serializable {
    @Override
    public int compare(AbstractConstructionGoods firstGood,
                       AbstractConstructionGoods secondGood) {
      return firstGood.getWeightInKilograms() - secondGood.getWeightInKilograms();
    }
  }

  private static final ConstructionGoodsSorterByWeight CONSTRUCTION_GOODS_SORTER_BY_WEIGHT =
            new ConstructionGoodsSorterByWeight();

  //sort using static inner class
  public static void sortByWeight(List<AbstractConstructionGoods> goods, SortType sortType) {
    goods.sort(sortType == SortType.ASCENDING ? CONSTRUCTION_GOODS_SORTER_BY_WEIGHT :
                CONSTRUCTION_GOODS_SORTER_BY_WEIGHT.reversed());
  }

  //inner class
  class ConstructionGoodsSorterByWidth implements Comparator<AbstractConstructionGoods> {
    @Override
    public int compare(AbstractConstructionGoods firstGood, AbstractConstructionGoods secondGood) {
      if (Double.compare(firstGood.getWidthInCentimeters(),
              secondGood.getWidthInCentimeters()) < 0) {
        return -1;
      }
      if (Double.compare(firstGood.getWidthInCentimeters(),
              secondGood.getWidthInCentimeters()) > 0) {
        return 1;
      }
      return 0;
    }
  }

  //sort using inner class
  public static void sortByWidth(List<AbstractConstructionGoods> goods, SortType sortType) {
    ConstructionGoodsManagerUtils manager = new ConstructionGoodsManagerUtils();
    ConstructionGoodsSorterByWidth sorterByWidth = manager.new ConstructionGoodsSorterByWidth();
    goods.sort(sortType == SortType.ASCENDING ? sorterByWidth : sorterByWidth.reversed());
  }

  //sort using anonymous class
  public static void sortByProducerName(List<AbstractConstructionGoods> goods, SortType sortType) {
    Comparator<AbstractConstructionGoods> comparator = new Comparator<AbstractConstructionGoods>() {
      @Override
      public int compare(AbstractConstructionGoods firstGood,
                         AbstractConstructionGoods secondGood) {
        return firstGood.getProducerName().compareTo(secondGood.getProducerName());
        }
    };
    goods.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());
  }

  //sort using lambda
  public static void sortByColor(List<AbstractConstructionGoods> goods, SortType sortType) {
    Comparator<AbstractConstructionGoods> comparator =
        (firstGood, secondGood) -> firstGood.getColor().compareTo(secondGood.getColor());
    goods.sort(sortType == sortType.DESCENDING ? comparator : comparator.reversed());
  }

}