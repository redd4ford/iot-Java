package ua.lviv.iot.constructiongoods.writerTest;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.constructiongoods.managerTest.ConstructionGoodsManagerTest;
import ua.lviv.iot.constructiongoods.writer.*;

public class ConstructionGoodsWriterTest extends ConstructionGoodsManagerTest {
    ConstructionGoodsWriter goodsWriter = new ConstructionGoodsWriter();

    @Test
    void writeToFileTest() throws IOException {
        Writer csvWriter = new FileWriter("ConstructionGoodsWriter.csv");
        goodsWriter.setCsvWriter(csvWriter);
        goodsWriter.writeToFile(goods);
    }

}