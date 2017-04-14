package arlist;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;

/**
 * Created by Rakshith on 4/14/2017.
 */
public class ALToA{

    public static void main(String[] args) {
        List<Integer> stringList = new ArrayList<>();

        stringList.add(5);
        stringList.add(10);
        stringList.add(3);
        stringList.add(22);
        stringList.add(76);


        System.out.println("Before sort: "+ stringList);
        Collections.sort(stringList, new SortComparator());
        System.out.println("After sort: "+ stringList);






    }



}
