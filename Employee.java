package questin2;

public class Employee {
    String names,email,time;
    int phoneno,salary;

    public Employee(String names, String email, String time, int phoneno, int salary) {
        this.names = names;
        this.email = email;
        this.time = time;
        this.phoneno = phoneno;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employeedetails{" +
                "names='" + names + '\'' +
                ", email='" + email + '\'' +
                ", time='" + time + '\'' +
                ", phoneno=" + phoneno +
                ", salary=" + salary +
                '}';
    }

}

