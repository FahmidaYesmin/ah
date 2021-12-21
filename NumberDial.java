package array;

import java.util.ArrayList;

public class NumberDial {
    public static void main(String[] args) {


        String a[] = {"pim","pom","pop"};
        String b [] ={"777788","888899","77889988"};
        String search = "7788";

        for(int i = 0 ;i < b.length;i++) {
            String s = b[i];

            if (s.contains(search)) {
                System.out.println(a[i]);
            } else {
                System.out.println("no result found");
            }
            ArrayList<String>name = new ArrayList<String>();
            name.add("pim");
            name.add("pom");
            name.add("pop");
        }
    }
}


