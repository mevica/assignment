package questin2;

import java.util.ArrayList;

public class Employeedetails {


    public static void main(String[] args) {
        ArrayList<Employee> details;
        details=new ArrayList<>();

        Employee detaila1=new Employee("MERCY NDANU","MEVICA@GNMAI.COM","2years",0714562524,60500);
        Employee detaila2=new Employee("JANE KAWIRA","JANE@GNMAI.COM","4years",0714452562,70000);
        Employee detaila3=new Employee("JAMES MUTANU","JAMES@GNMAI.COM","2MONTHS",0745624545,60500);
        Employee detaila4=new Employee("ALECKY MAWIA","MAWIA@GNMAI.COM","6WEEKS",0712454456,15000);
        Employee detaila5=new Employee("JULIUS JOHN","JOHN@GNMAI.COM","4years",0725644562,45000);
        Employee detaila6=new Employee("CALEB MATEI","MATEI@GNMAI.COM","1years",0715624562,8500);
        Employee detaila7=new Employee("ROSE ANNE","ROSE@GNMAI.COM","2years",0715645262,10000);
        Employee detaila8=new Employee("KAREN WAMBUA","KAREN@GNMAI.COM","8MONTHS",0721455462,8000);
        Employee detaila9=new Employee("CHEGE MOEN","MOEN@GNMAI.COM","1years",0735154562,60162);
        Employee detaila10=new Employee("JOY MUTANU","JOY@GNMAI.COM","2years",0714564562,68450);

        details.add(detaila1);
        details.add(detaila2);
        details.add(detaila3);
        details.add(detaila4);
        details.add(detaila5);
        details.add(detaila6);
        details.add(detaila7);
        details.add(detaila8);
        details.add(detaila9);
        details.add(detaila10);

        System.out.print(details.toString());
    }
}
