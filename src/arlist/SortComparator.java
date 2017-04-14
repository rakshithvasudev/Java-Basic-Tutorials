package arlist;

import java.util.Comparator;

/**
 * Created by Rakshith on 4/14/2017.
 */
public class SortComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}
