package creational.builder.before;

class House {
  public House(int floors,
               int sqft,
               int rooms,
               String garage,
               String swimPool,
               String garden,
               String balcony) {
  }

  public House(int floors,
               int sqrt,
               int rooms,
               String pool) {
    this(floors, sqrt, rooms, null, pool, null, null);
  }
  public House(int floors) {
    this(floors, 1000, 1, null, null, null, null);
  }
}

public class BuilderBefore {

  public static void main(String[] args) {
    House h1 = new House(2, 1000, 4, null, null, null, "big");
    House h2 = new House(1, 700, 3, "nice", null, null, null);
    House h3 = new House(5);
    House h4 = new House(2, 5, 3, null);
  }
}
