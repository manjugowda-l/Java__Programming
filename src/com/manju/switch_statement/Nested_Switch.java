package com.manju.switch_statement;
import java.util.Scanner;
public class Nested_Switch {
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        int empID=in.nextInt();
        String department =in.next();

        switch (empID) {
            case 1 -> System.out.println("Manju ");
            case 2 -> System.out.println("Nithesh");
            case 3 -> {
                System.out.println("Emp number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT DEPARTMENT");
                    case "MANAGEMENT" -> System.out.println("MANAGEMENT DEPARTMENT");
                    default -> System.out.println("No Deapartment");
                }
            }
            default -> System.out.println("Enter crt empID");
        }
    }
}
