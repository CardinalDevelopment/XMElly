package ee.ellytr.xmelly.parser;

import ee.ellytr.xmelly.Parser;

public class FloatParser implements Parser<Float> {

  @Override
  public Float parse(String input) {
    try {
      return Float.parseFloat(input);
    } catch (NumberFormatException e) {
      return null;
    }
  }

}
