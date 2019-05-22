package decorator;

import decorator.structure.ConcreteDecoratorOne;
import decorator.structure.ConcreteDecoratorTwo;
import decorator.structure.ExecutableImpl;

public class DecoratorMain {
  public static void main(String[] args) {
    new ConcreteDecoratorOne(
      new ConcreteDecoratorTwo(
        new ConcreteDecoratorOne(
          new ExecutableImpl()
        )
      )
    ).execute();
  }
}
