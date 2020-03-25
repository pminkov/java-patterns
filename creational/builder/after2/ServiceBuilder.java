package creational.builder.after2;

public class ServiceBuilder {
  private String name;
  private int instances;

  public ServiceBuilder setName(String name) {
    this.name = name;
    return this;
  }

  public ServiceBuilder setInstances(int instances) {
    this.instances = instances;
    return this;
  }

  public Service createService() {
    return new Service(name, instances);
  }
}
