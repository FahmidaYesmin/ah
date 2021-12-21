package array;

public class ThidLargeNumber {

    public static void main(String[] args) {

        int[] array = {2, 34,99,102, 12, 37, 87, 56, 98};
        int[] a = new int[array.length];

        int max = 0, m = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {


                if (array[j] > array[i]) {

                    if (array [j] > max) {
                        max = array[j];
                    }
                }
            }

            if (max == 0) {
                max = array[i];
            }
            a[i] = max;

            for (int j = 0; j < array.length; j++) {

                if (max == array[j]) {

                    array[j] = 0;
                }
            }
            max = 0;
        }
        System.out.println(a[2]);
    }
}

