package ee.ellytr.xmelly.parser;

import ee.ellytr.xmelly.Parser;

public class DoubleParser implements Parser<Double> {

  @Override
  public Double parse(String input) {
    try {
      return Double.parseDouble(input);
    } catch (NumberFormatException e) {
      return null;
    }
  }

}
