package creational.builder.after;

public class BuilderAfter {
  public static void main(String[] args) {
    HouseBuilder hb1 = new HouseBuilder();
    House h1 = hb1.setBalcony("big").setFloors(5).setSqft(1000).createHouse();
  }
}
