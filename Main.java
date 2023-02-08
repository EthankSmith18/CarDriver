public class Main {
  public static void main(String[] args) {
    Driver driver1 = new Driver();
    System.out.println(driver1.getGas());
    driver1.drive();
    driver1.boost();
    driver1.refuel();
  }
}