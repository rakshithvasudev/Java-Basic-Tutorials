package arrays;

/**
 * Created by Rakshith on 4/3/2017.
 */
public class LearningArrays {

    public static void main(String[] args) {

        //Array is a continuous representation of same elements in the memory.
        int[] studentMathScore = new int[5];


        for (int i=0;i<5;i++){
            studentMathScore[i]=i;
        }

        for (int i=0;i<5;i++)
        System.out.println(studentMathScore[i]);
    }
}
