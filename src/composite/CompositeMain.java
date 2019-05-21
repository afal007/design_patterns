package composite;

import composite.example.*;
import composite.structure.Composite;
import composite.structure.CompositeConcrete;
import composite.structure.CompositeConcreteAnother;
import composite.structure.CompositeContainer;

public class CompositeMain {
  public static void main(String[] args) {
    Composite composite = new CompositeContainer(
      new CompositeConcrete(),
      new CompositeConcreteAnother()
    );

    composite.action();

    Part part = new Container(
      new CentralProcessingUnit(),
      new GraphicalProcessingUnit(),
      new Container(
        new HardDrive(),
        new HardDrive()
      )
    );

    System.out.println(part.cost());
  }
}
