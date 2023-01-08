
import java.util.Scanner;
public class Menuapp {

    static Scanner s = new Scanner(System.in);
    static int addingIndex = 0;

    public static void main(String[] args) {

        String[] family = new String[5];

        int decision = 0;

        while(decision != -1) {
            showMenu();
            decision = s.nextInt();

            if (decision < -1 || decision > 5) {
                System.out.println("Please pick a valid option");

            } else if (decision == 1) {
                showFamily(family);

            } else if (decision == 2) {
                showFamilyMember(family);

            } else if (decision == 3) {
                addFamilyMember(family);

            } else if (decision == 4) {
               deleteFamilyMember(family);

            } else {
                deleteAllFamilyMembers(family);

            }

        }
    }

    public static void deleteAllFamilyMembers(String[] family) {
        for (int i = 0; i < family.length; i++){
            family[i] = null;

        }
    }

    public static void deleteFamilyMember(String[] family) {
        System.out.println("Which family member would you like to delete?");
        int memberToDelete = s.nextInt();
        if (isValid(memberToDelete)){
            family[memberToDelete] = null;

        }
    }

    public static void addFamilyMember(String[] family) {
        System.out.print("Enter new member name: ");
        String newMember = s.next();
        if (isValid(addingIndex)){
            family[addingIndex++] = newMember;
        }


    }

    public static boolean isValid(int input){
        if (input >= 0 && input < 5){
            return true;
        } else {
            System.out.println("Invalid entry.");
            return false;
        }
    }

    public static void showFamilyMember(String[] family) {
        System.out.println("Which family member would you like to see?");
        int familyNumber = s.nextInt();
        if (isValid(familyNumber)){
            System.out.println(familyNumber + ": " + family[familyNumber]);
        }


    }

    public static void showFamily(String[] family) {
        System.out.println("Family:");
        for (int i = 0; i < family.length; i++){
            System.out.println(i + ": " + family[i]);
        }
    }

    public static void showMenu(){
        System.out.println("Please pick an option or enter -1 to exit.");
        System.out.println("1) Show Family");
        System.out.println("2) Show Family Member");
        System.out.println("3) Add a Family Member");
        System.out.println("4) Delete Family Member");
        System.out.println("5) Delete All Family Members");

    }
}
