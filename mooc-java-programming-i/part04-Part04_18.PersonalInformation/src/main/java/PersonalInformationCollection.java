
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String firstName;
        String lastName;
        String identificationNumber;
        while (true){
            System.out.println("First name:");
            firstName = scanner.nextLine();
            if (firstName.isEmpty()){
                break;
            }
            System.out.println("Last name:");
            lastName = scanner.nextLine();
            System.out.println("Identification number:");
            identificationNumber = scanner.nextLine();
            infoCollection.add(new PersonalInformation(firstName,lastName,identificationNumber));
        }
        for (PersonalInformation PersonalInformation:infoCollection){
            firstName = PersonalInformation.getFirstName();
            lastName = PersonalInformation.getLastName();
            System.out.println(firstName + " " + lastName);
        }

    }
}
