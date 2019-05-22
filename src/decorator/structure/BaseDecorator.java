package decorator.structure;

public abstract class BaseDecorator implements Executable {
  private Executable wrappee;

  public BaseDecorator(Executable executableImpl) {
    this.wrappee = executableImpl;
  }

  @Override
  public void execute() {
    wrappee.execute();
  }
}
