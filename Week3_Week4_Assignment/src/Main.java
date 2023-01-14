import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 105};
        int lastMinusFirst = ages[ages.length - 1] - ages[0];
        System.out.println(lastMinusFirst);
        double sum = 0;

        for (int number : ages) {
            sum += number;
        }
        double average = sum / ages.length;
        System.out.println("Average age is: " + average + ".");

        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        double sumOfLetters = 0;

        for (String name : names) {
            sumOfLetters += name.length();
        }
        double avgLetters = sumOfLetters / names.length;
        System.out.println("Average name length is: " + avgLetters + " letters.");

        for (int i = 0; i < names.length; i++) {
            names[i] = names[i] + "";
        }
        String name = Arrays.toString(names);
        name = name.replace('[', ' ').replace(']', ' ').replace(',', ' ');
        System.out.println(name);

        //String joined = String.join(" ", names);
        //System.out.println(joined);
        // this seemed to get the desired result but did not use a loop to join the names together
        }
    }




