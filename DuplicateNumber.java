package array;

public class DuplicateNumber {
    public static void main(String[] args) {

        int array[] = {1, 1, 2, 2, 3, 4, 5, 1};
        int d = 0;


            System.out.print("{");

            for (int i = 0; i < array.length -1 ; i++) {
               int a = array[i];

            for (int j = i + 1; j < array.length; j++) {
               int b = array[j];

                if (a != b) {
                    System.out.print(a +" ");
                }
                break;
            }
        }
            System.out.print("}");
    }
}
