package arlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Rakshith on 4/13/2017.
 */
public class Main {
    public static void main(String[] args) {


        List<Integer> integerList = new ArrayList<>();
        int[] intArrayValues;
        integerList.add(5);
        integerList.add(35);
        integerList.add(75);
        integerList.add(105);

        intArrayValues=convertIntegertoint(integerList);
        System.out.println(Arrays.toString(intArrayValues));
    }

    public static int[] convertIntegertoint(List<Integer> integerList) {
        int[] result = new int[integerList.size()];
        Iterator iterator = integerList.iterator();
        for (int i=0;i<result.length;i++){
            result[i]=(int)iterator.next();
        }
        return result;
    }
}
