package patientintake;

import java.util.Scanner;

public class ClinicMain {

    private static ClinicCalendar calendar;

    public static void main(String[] args) throws Throwable {
        calendar = new ClinicCalendar();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Patient Intake Computer System!\n\n");
        String lastOption = "";
        while (!lastOption.equalsIgnoreCase("x")){
            lastOption = displayMenu(scanner);
        }
        System.out.println("\nExisting System\n");
    }

    private static String displayMenu (Scanner scanner) throws Throwable {
        System.out.println("Please select an option:");
        System.out.println("1. Enter a Patient Appointment");
        System.out.println("2. View All Appointments");
        System.out.println("X. Exit System.");
        System.out.println("Option: ");
        String option = scanner.next();
        switch (option){
            case "1": performPatientEntry(scanner);
                return option;
            case "2": performAllAppointments();
                return option;
            default: System.out.println("Invalid option, please re-enter!");
                return option;
        }
    }

    private static void performPatientEntry(Scanner scanner){
        scanner.nextLine();
        System.out.println();
    }

}
