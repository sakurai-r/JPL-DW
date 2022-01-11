package practice;

public class Vehicle {
  public int speed;
  public int direction;
  public String ownerName;
  public static int nextId = 0;
  public int id;

  Vehicle() {
    id = nextId;
    nextId++;
  }

  Vehicle(String ownerName) {
    this();
    this.ownerName = ownerName;
  }

  public static void main(String[] args) {
    Vehicle car = new Vehicle("sakurai");
    car.speed = 60;
    car.direction = 100;

    Vehicle train = new Vehicle("rikuto");
    train.speed = 200;

    Vehicle bike = new Vehicle("ryo");

    System.out.println(train.speed);
    System.out.println(returnMaxId());
    System.out.println(car);
  }

  public static int returnMaxId() {
    return Vehicle.nextId - 1;
  }

  @Override
  public String toString() {
    return "Vehicle[speed=" + speed + ", direction=" + direction + ", ownerName=" + ownerName + ", id=" + id + "]";
  }
}