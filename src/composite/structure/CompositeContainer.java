package composite.structure;

import java.util.Arrays;
import java.util.List;

/**
 * The Container (aka composite) is an element that has sub-elements: leaves or other containers.
 * A container doesn’t know the concrete classes of its children.
 * It works with all sub-elements only via the component interface.
 *
 * Upon receiving a request, a container delegates the work to its sub-elements,
 * processes intermediate results and then returns the final result to the client.
 */
public class CompositeContainer implements Composite {
  private List<Composite> compositeList;

  public CompositeContainer(Composite... composites) {
    this.compositeList = Arrays.asList(composites);
  }

  public void add(Composite composite) {
    compositeList.add(composite);
  }

  @Override
  public void action() {
    for (Composite composite : compositeList) {
      composite.action();
    }
  }
}
