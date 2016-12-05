package ee.ellytr.xmelly.component;

import ee.ellytr.xmelly.Component;
import ee.ellytr.xmelly.ParserRegistry;
import lombok.Getter;
import org.jdom2.Element;

import java.lang.reflect.ParameterizedType;

public class Text<T> implements Component<T> {

  @Getter private final Element element;

  @Getter private final T value;
  @Getter private final String input;

  @SuppressWarnings("unchecked")
  public Text(Element element) {
    this.element = element;

    input = element.getText();
    value = ParserRegistry.getRegistry().getHandler().parse(
        input,
        (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]
    );
  }

}
