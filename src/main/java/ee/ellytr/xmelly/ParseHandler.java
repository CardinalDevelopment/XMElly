package ee.ellytr.xmelly;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ParseHandler {

  private final ParserRegistry registry;

  @SuppressWarnings("unchecked")
  public <T> T parse(String input, Class<T> clazz) {
    return (T) registry.getParsers().get(clazz).parse(input);
  }

}
