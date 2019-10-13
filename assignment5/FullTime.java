class FullTime extends Employee {
  public FullTime(String name, int paymentPerHour) {
    super(name, paymentPerHour);
  }
  public int calculateSalary() {
    int salary = 8 * this.paymentPerHour;
    return salary;
  }
}
