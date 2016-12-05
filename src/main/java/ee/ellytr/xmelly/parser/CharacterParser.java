package ee.ellytr.xmelly.parser;

import ee.ellytr.xmelly.Parser;

public class CharacterParser implements Parser<Character> {
  @Override
  public Character parse(String input) {
    if (input.length() == 1) {
      return input.charAt(0);
    } else {
      return null;
    }
  }
}
