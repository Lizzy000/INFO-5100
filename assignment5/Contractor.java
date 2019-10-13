class Contractor extends Employee {
  private int workingHours;
  
  public Contractor(String name, int paymentPerHour, int workingHours) {
    super(String name, int paymentPerHour);
    this.workingHours = workingHours;
  }
  
  public int calculateSalary() {
    int salary = this.workingHours * this.paymentPerHour;
    return salary;
  }
}
