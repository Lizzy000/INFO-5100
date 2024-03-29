package Assignment2;

/**
 * Submit it on or before 22nd September 2019 , 12:00 pm
 */
public class Assignment2 {
    /*
        This method should return the sum of salaries of employees having salary greater than 5000
        Note: Employee array is passed, not employee
     */
    public double salaryGreaterThanFiveThousand(Employee[] employees) {

        double sum = 0;
        for(int i = 0, i < employees.Length, i++) {
            if(employees[i].getSalary() > 5000)
                sum = sum + employees[i].getSalary();                           
            }
        }
        return sum;
    }

    
    /*
        This method should print either "Fizz", "Buzz" or "FizzBuzz"
        "Fizz" - if id of employee is divisible by 3
        "Buzz" - if id of employee is divisible by 5
        "FizzBuzz" - if id of employee is divisible by both 3 and 5
     */
    public void fizzBuzz(Employee employee) {
      
        if(employee.getSalary() % 3 == 0)
            System.out.print("Fizz");
        if(employees.getSalary() % 5 == 0)
            System.out.print("Buzz");
 
    }

    
    /*
        This method should calculate tax for an employee in dollars
        If salary of employee is less than or equal to 2500, tax should be 10%
        If salary of employee is greater than 2500 but less than or equal to 5000, tax should be 25%
        If salary of employee is greater than 5000, tax should be 35%
    */

    public double calculateTax(Employee employee) {
       
        double tax;
        double i = employee.getSalary();
        if(i <= 2500)
            tax = 0.1 * i;
        if(i > 2500 && i <= 5000)
            tax = 0.25 * i;
        if(i > 5000)
            tax = 0.35 * i;
        return tax;
    }
    
    
    /*
        We are given two employee objects.
        Implement this method to swap salaries of employees
    */
    public void swap(Employee firstEmployee, Employee secondEmployee) {
        double temp;
        temp = firstEmployee.getSalary();
        firstEmployee.setSalary(secondEmployee.getSalary());
        secondEmployee.setSalary(temp);
    }

    
    /*
        Return number of employees whose age is greater than 50
        Note: Employee array is passed, not employee
     */
    public int employeesAgeGreaterThan50(Employee[] employees) {
        int count = 0;
        for(int i = 0, i <employees.Length, i++) {
            if(employees[i].getAge() > 50)
                count++;
        }
        return count;
    }

    
    /*
        Implement this method to reverse firstName of employee.
        Ex. Before: employee.getFirstName() -> "John"
        After : employee.getFirstName() -> "nhoJ"
     */
    public void reverseFirstName(Employee employee) {
        // @TODO
        String reverse = "";
        String firstName = employee.getFirstName();
        for(int i = 0, i < employee.getFirstName().length, i++) {
            reverse = firstName.charAt(i) + reverse;
        }
        employee.setFirstName(reverse);
        
    }

    
    /*
        Print "true" if employee's first name contain one or more digits
        Print "false" if employee's first name doesn't contain any digit
        Ex: employee.getFirstName() -> "ha8l" == true
        employee.getFirstName() -> "hail" == false
     */
    public void isContainDigit(Employee employee) {
        
        String firstName = employee.getFirstName();
        for(int i = 0, i <10, i++) {
            if(firstName.contains("i"))
                returen false;
        return true;
         
                
        }
    }

    
     /*
        Write a method to raise an employee's salary to three times of his/her original salary.
        Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
        DO NOT change the input in this method.
        Try to add a new method in Employee class: public void raiseSalary(double byPercent) 
        Call this new method.
     */
    public void tripleSalary(Employee employee) {
        double rate = 3.00;
        employee.raiseSalary(rate);
        //raiseSalary method has been added into Employee class.
    }
    
    
    //Additional question for extra credit
    /*
        Implement this method to convert String[] to employees array.
        Ex: String[] employees = new String[]{"1,John,24,7500", "2,Hail,28,7899.90"};
        This String array of length 2 contains 2 employees in form of string, where
        id = 1
        firstName=John
        age=24
        salary=7500
        convert each string to employee object.
        Hint: Use String methods. Refer : https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     */
    public Employee[] createEmployees(String[] employeesStr) {
        Employee[] employees = new Employee[employeesStr.length];
        // @TODO
        for(int i = 0, i < employeeStr.length, i++) {
            String[] temp = employeesStr[i].split(",");
            int id = Integer.parseInt(temp[0]);
            String firstName = temp[1];
            int age = Integer.parseInt(temp[2]);
            float salary = Float.parseFloat(temp[3]);
            employees[i].setId(id);
            employees[i].setFirstName(firstname);
            employees[i].setAge(age);
            employees[i].setSalary(salary);
        }
        return employees;
        
        
        
        
        
        
        
        //below is my original solution, but I found it very complicated and maybe contain bugs, so I comment it.
       /* 
        for(int i = 0, i < employeesStr.length, i++) {
            int j;
            for(j = 0, j < employeesStr[i].length(), j++) {
                if(employeesStr[i].charAt(j) == ",") {
                    int id = Integer.parseInt(employeesStr[i].substring(0,j));
                    employees[i].setId(id);
                    break;
                }
            }
            
            int m;
            for(m = j+1, m < employeesStr[i].length(), m++) {  
                if(employeesStr[i].charAt(m) == ",") {
                    firstName = employeesStr[i].substring(j+1,m);
                    employees[i].setFirstName(firstName);
                    break;
                }
            }
            int n;
            for(n = m+1, n < employeesStr[i].length(), n++) { 
                if(employeesStr[i].charAt(n) == ",") {
                    int age = Integer.parseInt(employeesStr[i].substring(m+1,n));
                    employees[i].setAge(age);
                    break;
                }
            }
            int o;
            for(o = n+1, o < employeesStr[i].length(), o++) { 
                if(employeesStr[i].charAt(o) == ",") {
                    float salary = Float.parseFloat(employeesStr[i].substring(m+1,n));
                    employees[i].setSalary(salary);
                    break;
                }
            }
        }
                      
        return employees;
        */
    }
}
