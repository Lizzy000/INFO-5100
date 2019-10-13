class Contractor extends Employee {
  private int workingHours;
  
  public Contractor(String name, int paymentPerHour, int workingHours) {
    super(name, paymentPerHour);
    this.workingHours = workingHours;
  }
  
  public int calculateSalary() {
    int salary = this.workingHours * getPaymentPerHour();
    return salary;
  }
}
