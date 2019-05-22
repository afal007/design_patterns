package decorator.structure;

public class ConcreteDecoratorOne extends BaseDecorator {
  public ConcreteDecoratorOne(Executable executableImpl) {
    super(executableImpl);
  }

  @Override
  public void execute() {
    super.execute();
    System.out.println("ConcreteDecoratorOne");
  }
}
