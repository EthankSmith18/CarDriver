class Driver extends Car {
  
  public void drive() {
    System.out.println("Driving");
    this.setGas(getGas() - 1);
    System.out.println(getGas());
  }

  public void boost() {
    System.out.println("Boosting %n");
    this.setGas(getGas() -3);
    System.out.println(getGas());      
    }
  
  public void refuel() {
    System.out.println("Refueling %n");
    this.setGas(getGas() + 2);
    System.out.println(getGas());
    
  }

}
