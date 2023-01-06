public class methodTest {

    public static void main(String[] args) {
        int[] myArray = new int[3];
        myArray[0] = 7;
        myArray[1] = 10;
        myArray[2] = 8;

        System.out.println(sumArray(myArray));
    }

    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}