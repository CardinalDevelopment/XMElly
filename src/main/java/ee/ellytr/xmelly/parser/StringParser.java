package ee.ellytr.xmelly.parser;

import ee.ellytr.xmelly.Parser;

public class StringParser implements Parser<String> {

  @Override
  public String parse(String input) {
    return input;
  }

}
