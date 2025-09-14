package JavaBasics;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String department = sc.next();

        switch(empID){
            case 1 :
                System.out.println("Himanshu");
                break;
            case 2 :
                System.out.println("Ashii");
                break;
            case 3 :
                System.out.println("Emp no 3");
                switch(department){
                    case "IT" :
                        System.out.println("IT Dept");
                        break;
                    case "Management" :
                        System.out.println("Mangement Dept");
                        break;
                    default:
                        System.out.println("No dept entered");
                }
                break;
            default :
                System.out.println("Enter correct EmpID");
        }

        // better way to write
        switch (empID) {
            case 1 -> System.out.println("Himanshu");
            case 2 -> System.out.println("Rahul Rana");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }

}
