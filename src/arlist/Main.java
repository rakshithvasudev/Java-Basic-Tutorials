package arlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rakshith on 4/13/2017.
 */
public class Main {
        public static void main(String[] args) {

            List<Integer> integerList = new ArrayList<>();
            integerList.add(5);
            integerList.add(35);
            integerList.add(75);
            integerList.add(105);

//            for (int currentInt:integerList) {
//                System.out.println("first: "+currentInt);
//            }
//
//            for (int i=0;i<integerList.size();i++) {
//                System.out.println(integerList.get(i));
//            }



            int index = integerList.indexOf(75);
            integerList.remove(index);

            int index1 = integerList.indexOf(35);
            integerList.remove(index1);



            System.out.println("After removing:"+ integerList);



        }
}

