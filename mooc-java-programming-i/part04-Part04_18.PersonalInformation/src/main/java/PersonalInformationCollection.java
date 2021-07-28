
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        String firstName = "";
        String lastName = "";
        String idNumber = "";
        
        while (true) {
            System.out.print("First name: ");
            
            firstName = scanner.nextLine();
            
            if (firstName.isEmpty()) {
                break;
            }
            
            System.out.print("Last name: ");
            
            lastName = scanner.nextLine();
            
            System.out.print("Identification number: ");
            
            idNumber = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(firstName, lastName, idNumber));
        }
        
        System.out.println("");
        for (PersonalInformation info: infoCollection) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }

    }
}
