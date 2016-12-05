package ee.ellytr.xmelly.parser;

import ee.ellytr.xmelly.Parser;

public class LongParser implements Parser<Long> {

  @Override
  public Long parse(String input) {
    try {
      return Long.parseLong(input);
    } catch (NumberFormatException e) {
      return null;
    }
  }

}