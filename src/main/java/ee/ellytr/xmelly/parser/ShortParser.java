package ee.ellytr.xmelly.parser;

import ee.ellytr.xmelly.Parser;

public class ShortParser implements Parser<Short> {

  @Override
  public Short parse(String input) {
    try {
      return Short.parseShort(input);
    } catch (NumberFormatException e) {
      return null;
    }
  }

}
