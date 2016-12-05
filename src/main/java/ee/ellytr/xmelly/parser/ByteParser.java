package ee.ellytr.xmelly.parser;

import ee.ellytr.xmelly.Parser;

public class ByteParser implements Parser<Byte> {

  @Override
  public Byte parse(String input) {
    try {
      return Byte.parseByte(input);
    } catch (NumberFormatException e) {
      return null;
    }
  }

}
