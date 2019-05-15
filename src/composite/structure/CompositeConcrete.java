package composite.structure;

/**
 * The Leaf is a basic element of a tree that doesn’t have sub-elements.
 *
 * Usually, leaf components end up doing most of the real work, since they don’t have anyone to delegate the work to.
 */
public class CompositeConcrete implements Composite {
  @Override
  public void action() {
    System.out.println("I am concrete!");
  }
}
