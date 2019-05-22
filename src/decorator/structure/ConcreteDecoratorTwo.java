package decorator.structure;

public class ConcreteDecoratorTwo extends BaseDecorator {
  public ConcreteDecoratorTwo(Executable executableImpl) {
    super(executableImpl);
  }

  @Override
  public void execute() {
    super.execute();
    System.out.println("ConcreteDecoratorTwo");
  }
}
