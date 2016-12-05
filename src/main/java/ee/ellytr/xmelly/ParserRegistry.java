package ee.ellytr.xmelly;

import ee.ellytr.xmelly.parser.BooleanParser;
import ee.ellytr.xmelly.parser.ByteParser;
import ee.ellytr.xmelly.parser.CharacterParser;
import ee.ellytr.xmelly.parser.DoubleParser;
import ee.ellytr.xmelly.parser.FloatParser;
import ee.ellytr.xmelly.parser.IntegerParser;
import ee.ellytr.xmelly.parser.LongParser;
import ee.ellytr.xmelly.parser.ShortParser;
import ee.ellytr.xmelly.parser.StringParser;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class ParserRegistry {

  @Getter private static ParserRegistry registry;

  @Getter private final Map<Class, Parser> parsers = new HashMap<>();
  @Getter private final ParseHandler handler = new ParseHandler(this);

  public ParserRegistry() {
    registry = this;
  }

  public <T> void register(Class<T> clazz, Parser<T> parser) {
    parsers.put(clazz, parser);
  }

  public void unregister(Class clazz) {
    parsers.remove(clazz);
  }

  private void registerDefaultParsers() {
    parsers.put(Boolean.class, new BooleanParser());
    parsers.put(Byte.class, new ByteParser());
    parsers.put(Character.class, new CharacterParser());
    parsers.put(Double.class, new DoubleParser());
    parsers.put(Float.class, new FloatParser());
    parsers.put(Integer.class, new IntegerParser());
    parsers.put(Long.class, new LongParser());
    parsers.put(Short.class, new ShortParser());
    parsers.put(String.class, new StringParser());
  }

}
