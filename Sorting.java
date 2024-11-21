package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> Nums = new ArrayList<>();
        int swap=0;
        Nums.add(3);
        Nums.add(2);
        Nums.add(1);
        Nums.add(5);
        Nums.add(4);
        System.out.println("Given List is: ");
        System.out.println(Nums);
        for(int j=1; j< Nums.size(); j++) {
            for (int i = 0; i < Nums.size(); i++) {
                if (Nums.get(i) > Nums.get(j)) {
                    swap = Nums.get(i);
                    Nums.set(i, Nums.get(j));
                    Nums.set(j, swap);
//                    System.out.println(Nums);
                }
            }
        }
        System.out.println("Sorted List is: ");
        System.out.println(Nums);
        //Collections.sort(Nums);
//        System.out.println("Sorted List is: ");
//        System.out.println(Nums);
    }
}
