package ua.lviv.iot.positivenumbersadder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PositiveNumbersAdder {
  private String regexForPositiveInteger = "(?<!-)(?<!\\d)[1-9][0-9]*";
  private int sumOfPositiveNumbers = 0;

  public int getSumOfPositiveNumbers() {
    return sumOfPositiveNumbers;
  }

  public void positiveNumbersSumCounter(String text) {
    final Pattern pattern = Pattern.compile(regexForPositiveInteger);
    final Matcher matcher = pattern.matcher(text);

    System.out.println("Found positive numbers: ");
    while (matcher.find()) {
      System.out.println(matcher.group(0));
      sumOfPositiveNumbers += Integer.parseInt(matcher.group(0));
    }
  }

}
