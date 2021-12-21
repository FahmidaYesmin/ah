package array;

public class ThirdLargeNumber2 {

    public static void main(String[] args) {

        int[] array = {50,1,6,7,8,5,3,10, 2363,6753};

        int max = 0, m = 3,count = 0,l = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                if (array[j] > array[i]) {

                    if (array[j] > max) {
                        max = array[j];
                    }
                }
            }
            if (max == 0) {
                max = array[i];
            }
            for (int j = 0; j < array.length; j++) {

                if (max == array[j]) {

                    array[j] = 0;
                }
            }

            if (m == i + 1){
                l = max;
            }
            max = 0;
        }
        System.out.println(l);
    }
}
