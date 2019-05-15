package composite.example;

import java.util.Arrays;
import java.util.List;

public class Container implements Part {

  private List<Part> partList;

  public Container(Part... parts) {
    this.partList = Arrays.asList(parts);
  }

  public Container add(Part part) {
    this.partList.add(part);
    return this;
  }

  @Override
  public int cost() {
    return partList.stream()
      .map(Part::cost)
      .reduce((l, r) -> l + r)
      .orElse(0);
  }
}
