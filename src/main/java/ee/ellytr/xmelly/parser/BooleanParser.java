package ee.ellytr.xmelly.parser;

import ee.ellytr.xmelly.Parser;

public class BooleanParser implements Parser<Boolean> {

  @Override
  public Boolean parse(String input) {
    return Boolean.parseBoolean(input);
  }

}
