public class Add_to_String_Array {

    public static void main(String[] args) {
        String word1 = "Yankees";
        String word2 = "Orioles";
        String word3 = "Mariners";

        String[] arr = {"Astros", "Reds", "Phillies", "Dodgers", "Angels"};
        String[] newArr =  new String[8];

        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[5] = word1;
        newArr[6] = word2;
        newArr[7] = word3;


        for (int i = 0; i < newArr.length; i++){
            System.out.println(newArr[i]);
        }


    }
}
