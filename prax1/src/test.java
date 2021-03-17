import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        String a = "auto";
        String b = "AuToMaAt";
        List<String> lst = new ArrayList<>();
        lst.add(a);
        lst.add(b.substring(4));
        if (a.charAt(1) == b.charAt(6)){
            lst.add("esimene");
        } else {
            lst.add("teine");
        }
        for (String el:lst
             ) {
            System.out.print(el);
        }

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(1,1);
        for (int i:list1
             ) {
            System.out.println(i);
        }
    }
}
