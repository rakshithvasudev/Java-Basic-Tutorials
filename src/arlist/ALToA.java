package arlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Rakshith on 4/14/2017.
 */
public class ALToA {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        String[] arrayValues = new String[stringList.size()];

        stringList.add("Rakshith");
        stringList.add("Random");
        stringList.add("Text");
        stringList.add("Entry");
        stringList.add("Point");

        System.out.println("From ArrayList: "+stringList);

        arrayValues = stringList.toArray(arrayValues);

        System.out.println("From Array: "+ Arrays.toString(arrayValues));

    }

}
