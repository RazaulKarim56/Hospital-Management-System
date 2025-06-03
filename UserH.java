import java.util.Scanner;

public class UserH {
    public void choice() {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n----- Hospital Management Menu -----");
            System.out.println("1. Receptionist");
            System.out.println("2. Patient");
            System.out.println("3. Doctor");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    Receptionist receptionist = new Receptionist();
                    receptionist.giveAppointment();
                    receptionist.generateBill();
                    break;
                case 2:
                    Patient patient = new Patient();
                    patient.payBill();
                    break;
                case 3:
                    Doctor doctor = new Doctor();
                    doctor.checkPatient();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting System...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
