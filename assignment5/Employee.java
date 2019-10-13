abstract class Employee {
  private String name;
  private int paymentPerHour;
  
  public Employee(String name, int paymentPerHour) {
    this.name = name;
    this.paymentPerHour = paymentPerHour;
  }
  
  public abstract int calculateSalary();
  public String getName() {
    String name = this.name;
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getPaymentPerHour() {
    int paymentPerHour = this.paymentPerHour;
    return paymentPerHour;
  }
  public void setPaymentPerHour(int paymentPerHour) {
    this.paymentPerHour = paymentPerHour;
  }
}
