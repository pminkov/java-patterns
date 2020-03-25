package creational.builder.after;

public class HouseBuilder {
  int floors;
   int sqft;
   int rooms;
   String garage;
   String swimPool;
   String garden;
   String balcony;

  public HouseBuilder setFloors(int floors) {
    this.floors = floors;
    return this;
  }

  public HouseBuilder setSqft(int sqft) {
    this.sqft = sqft;
    return this;
  }

  public HouseBuilder setRooms(int rooms) {
    this.rooms = rooms;
    return this;
  }

  public HouseBuilder setGarage(String garage) {
    this.garage = garage;
    return this;
  }

  public HouseBuilder setSwimPool(String swimPool) {
    this.swimPool = swimPool;
    return this;
  }

  public HouseBuilder setGarden(String garden) {
    this.garden = garden;
    return this;
  }

  public HouseBuilder setBalcony(String balcony) {
    this.balcony = balcony;
    return this;
  }

  public House createHouse() {
    return new House(floors, sqft, rooms, garage, swimPool, garden, balcony);
  }
}
