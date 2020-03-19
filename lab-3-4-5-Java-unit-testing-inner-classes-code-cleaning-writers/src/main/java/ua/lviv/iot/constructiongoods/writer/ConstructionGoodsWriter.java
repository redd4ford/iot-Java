package ua.lviv.iot.constructiongoods.writer;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;
import ua.lviv.iot.constructiongoods.model.AbstractConstructionGoods;

public class ConstructionGoodsWriter {
  public Writer csvWriter = new StringWriter();

  public Writer getCsvWriter() {
    return csvWriter;
  }

  public void setCsvWriter(Writer csvWriter) {
    this.csvWriter = csvWriter;
  }

  @Override
  public String toString() {
    return csvWriter.toString();
  }

  public void writeToFile(List<AbstractConstructionGoods> goods) throws IOException {
    csvWriter.write(goods.get(0).getHeaders());
    csvWriter.write("\n");
    for (AbstractConstructionGoods good : goods) {
      csvWriter.write(good.toCsv());
      csvWriter.write("\n");
    }
    csvWriter.flush();
  }

}
