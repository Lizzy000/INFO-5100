public class User {
  String name;
  int age;
  String address;
  int phoneNumber;
  int bankAccountNumber;
  
  User(String name, int age, String address, int phoneNumber, int bankAccountNumber) {
    this.name = name;
    this.age = age;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.bankAccountNumber = bankAccountNumber;
  }
}

public class ATM {
  int availableAmountInMachine;
  int transactionFee;
  Map<Object, String> userData = new HashMap<>();
  
  ATM(int availableAmountInMachine, int transactionFee) {
    this.availableAmountInMachine = availableAmountInMachine;
    this.transactionFee = transactionFee;
  }
}
