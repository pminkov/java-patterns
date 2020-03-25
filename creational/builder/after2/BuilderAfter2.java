package creational.builder.after2;

class Service {
  String name;
  int instances;

  public Service(String name, int instances) {
    this.name = name;
    this.instances = instances;
  }
}

class Director {
  void buildService(String type) {
    if (type == "scaled") {


    } else {

    }
  }
}

public class BuilderAfter2 {
  public static void main(String[] args) {
    System.out.println("heee");
  }
}
