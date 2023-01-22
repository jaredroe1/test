import java.awt.dnd.DragGestureRecognizer;
import java.lang.reflect.Array;
import java.util.*;

import static java.lang.reflect.Array.setInt;

public class practice {


    //static int sumOfDigits(int digits) {
        //String temp = Integer.toString(digits);
       // int[] numbers = new int[temp.length()];
       // for (int i = 0; i < temp.length(); i++) {
            //numbers[i] = Character.getNumericValue(temp.charAt(i));
        //}
        //int sum = 0;
        //for (int number: numbers){
           // sum += number;
       // }
        //return sum;
   // }

    //static int addingIndex = 0;


    public static void main(String[] args) {
        int sideLength = 4;

        for (int x = 0; x < 1; x++){
            for (int y = 0; y < sideLength; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 1; y++){
                System.out.print("*  *");
            }
            System.out.println();
        }

        for (int x = 0; x < 1; x++){
            for (int y = 0; y < sideLength; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int x = 0; x < sideLength; x++) {
            for (int y = 0; y < sideLength; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int a = 1; a <= 10; a++) {
          for (int b = 1; b <= 10; b++) {
              System.out.printf("%4d", (a * b));
        }
        System.out.println();
        }

        List<String> sports = new ArrayList<String>();
        sports.add("Wrestling");
        sports.add("Soccer");
        sports.add("Football");
        System.out.println(sports.size());

        Set<String> states = new HashSet<String>();

        Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
        racerPlacements.put(1, "Tommy");
        racerPlacements.put(2, "Sally");
        racerPlacements.put(3, "John");

        System.out.println(racerPlacements.get(1));
        System.out.println(racerPlacements.isEmpty());

        Set<Integer> racerKeys = racerPlacements.keySet();
        for (Integer key : racerKeys) {
            System.out.println(key + " : " + racerPlacements.get(key));
        }


        Map<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("Augment", "make (something) greater by adding to it; increase.");
        dictionary.put("Diminish", "make or become less.");
        dictionary.put("Ostentatious", "characterized by vulgar or pretentious display, designed to impress or attract notice.");

        for (String sport : sports) {
            System.out.println(sport);
        }

        StringBuilder numbers = new StringBuilder();
        for (int i = 0; i <= 9; i++) {
            if (i != 9) {
                numbers.append(i + "-");
            } else {
                numbers.append(i);
            }
        }
        System.out.println(numbers.toString());

        List<String> strings = new ArrayList<String>();
        strings.add("hello");
        strings.add("welcome");
        strings.add("hi");
        strings.add("wow");
        strings.add("wonderful");

        System.out.println(smallestString(strings));
        List<String> swapped = swapFirstAndLast(strings);
        for (String string: swapped) {
            System.out.println(string);
        }
        System.out.println(combinedStrings(strings));

        System.out.println();

        List<String> searchResults = searchList(strings,"e");
        for (String result : searchResults) {
            System.out.println(result);
        }

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 16, 20, 25, 30);
        List<List<Integer>> sortedNumbers = listOfLists(numbers2);
        for (List<Integer> list : sortedNumbers) {
            for (Integer number : list) {
                System.out.println(number);
            }
            System.out.println();
        }

        //int[] arr = {-11, 43, 901, 72, -5};
        //int[] arr2 = arr.clone();

       // System.out.println(arr2[3]);


    }

    public static List<List<Integer>> listOfLists(List<Integer> list) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        results.add(new ArrayList<Integer>());
        results.add(new ArrayList<Integer>());
        results.add(new ArrayList<Integer>());
        results.add(new ArrayList<Integer>());

        for (Integer number : list) {
            if (number % 2 == 0) {
                results.get(0).add(number);
            }
            if (number % 3 == 0) {
                results.get(1).add(number);
            }
            if (number % 5 == 0) {
                results.get(2).add(number);
            }
            if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
                results.get(3).add(number);
            }
        }
        return results;
    }

    public static List<String> searchList(List<String> list, String query) {
        List<String> results = new ArrayList<String>();
        for (String string : list) {
           if (string.contains(query)) {
               results.add(string);
           }
        }
        return results;
    }

    public static String combinedStrings(List<String> strings) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strings.size(); i++) {
            if (i < strings.size() - 1) {
                result.append(strings.get(i) + ", ");
            } else {
                result.append(strings.get(i));
            }
        }
        return result.toString();
    }

    public static List<String> swapFirstAndLast(List<String> list) {
        String temporary = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.set(list.size() - 1, temporary);
        return list;
    }

    public static String smallestString(List<String> list) {
        String smallest = list.get(0);
        for (String string : list) {
            if (string.length() < smallest.length()) {
                smallest = string;
            }
        }
        return smallest;
    }





        //for (int number : array) {
        //System.out.println(number);
        // }

        //double sum = 0;
        //for (int number : array) {
        //sum += number;
        //}
        //System.out.println(sum);

        //double average = sum / array.length;
        //System.out.println(average);

        //for (int number : array) {
        //if (number % 2 == 1) {
        //System.out.println(number);
        //}
        //}

        //String[] names = {"Sam", "Sally", "Thomas", "Robert"};
        // int sumOfLetters = 0;
        //for (String name : names) {
        // sumOfLetters += name.length();

        //}
        //System.out.println(sumOfLetters);

        //int digits = 12;
        //int sumAll = sumOfDigits(digits);
        //System.out.println("The sum of all digits for the value " + digits + " is " + sumAll + ".");





}
