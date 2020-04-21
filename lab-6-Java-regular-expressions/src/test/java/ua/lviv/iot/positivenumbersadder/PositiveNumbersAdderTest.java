package ua.lviv.iot.positivenumbersadder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;

public class PositiveNumbersAdderTest {

  private PositiveNumbersAdder adder = new PositiveNumbersAdder();

  private static String textToProcess = "-4 9u1ck 6r0wn fox jump-5 ov30r th3 14zy dog";

  public static String getTextToProcess() {
    Scanner scanner = new Scanner(System.in);
    textToProcess = scanner.nextLine();
    return textToProcess;
  }

  @Test
  public void positiveNumbersSumCounterTest() {
    if (textToProcess == null) {
      getTextToProcess();
    } else {
      adder.positiveNumbersSumCounter(textToProcess);
      System.out.println("Sum == " + adder.getSumOfPositiveNumbers());

      assertEquals(63, adder.getSumOfPositiveNumbers());
    }
  }
}
