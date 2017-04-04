package arrays;

import java.util.Arrays;

/**
 * Created by Rakshith on 4/3/2017.
 */
public class LearningArrays {

    public static void main(String[] args) {

        //Array is a continuous representation of same elements in the memory.
        int[] studentMathScore = {51,65,21,30,45,76};


//        for (int i=0;i<studentMathScore.length;i++){
//            studentMathScore[i]=i;
//        }


        //1,2,3,8,9,40-> bin(3)=3
        //System.out.println(Arrays.binarySearch(studentMathScore,8));


       // System.out.println(Arrays.toString(studentMathScore));

        Arrays.sort(studentMathScore);
        System.out.println(Arrays.toString(studentMathScore));

    }
}
