package ee.ellytr.xmelly.component;

import ee.ellytr.xmelly.Component;
import ee.ellytr.xmelly.ParserRegistry;
import lombok.Getter;
import org.jdom2.Element;

import java.lang.reflect.ParameterizedType;

public class Attribute<T> implements Component<T> {

  @Getter private final Element element;
  @Getter private final String attribute;

  @Getter private final T value;
  @Getter private final String input;

  @SuppressWarnings("unchecked")
  public Attribute(Element element, String attribute) {
    this.element = element;
    this.attribute = attribute;

    input = element.getAttributeValue(attribute);
    value = ParserRegistry.getRegistry().getHandler().parse(
        input,
        (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]
    );
  }

}
