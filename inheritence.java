import java.util.Scanner;

public class Employee {
    String empName, address, mailId, designation;
    int empId;
    long mobileNo;
    double basicPay;

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Mail ID: ");
        mailId = sc.nextLine();

        System.out.print("Enter Mobile No: ");
        mobileNo = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Designation: ");
        designation = sc.nextLine();

        System.out.print("Enter Basic Pay: ");
        basicPay = sc.nextDouble();
    }

    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.getDetails();
        p.calculateSalary();
    }
}

class Programmer extends Employee {
    void calculateSalary() {
        double da = basicPay * 0.97;
        double hra = basicPay * 0.10;
        double pf = basicPay * 0.12;
        double staff = basicPay * 0.01;

        double gross = basicPay + da + hra;
        double net = gross - pf - staff;

        System.out.println("\n------ Employee Details ------");
        System.out.println("Employee Name : " + empName);
        System.out.println("Employee ID : " + empId);
        System.out.println("Address : " + address);
        System.out.println("Mail ID : " + mailId);
        System.out.println("Mobile No : " + mobileNo);
        System.out.println("Designation : " + designation);
        System.out.println("Basic Pay : " + basicPay);
        System.out.println("DA : " + da);
        System.out.println("HRA : " + hra);
        System.out.println("PF : " + pf);
        System.out.println("Staff Club : " + staff);
        System.out.println("Gross Salary : " + gross);
        System.out.println("Net Salary : " + net);
    }
}
