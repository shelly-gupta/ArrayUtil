import com.shell.arrayRotations.ArrayRotation;
import com.shell.arrayRotations.ArrayUtil;
import com.shell.arrayfunctions.ArrayFunctions;
import com.shell.arrayfunctions.ArrayFunctions2;
import com.shell.arrayfunctions.NumberOperations;
import com.shell.arrayfunctions.StringFunctions;
import org.springframework.beans.factory.annotation.Autowired;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String args[]){
        ArrayRotation arrayRotation = new ArrayRotation();
        arrayRotation.rotateByNumber(2);

       /* int[] array = {2,1,6,4,5,3};
        arrayRotation.rotateAndDelete(array);

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] resultedArray = arrayUtil.removeElementUsingStreams(array, 2);
        Arrays.stream(resultedArray).forEach(i -> System.out.println(i));
        Arrays.stream(arrayUtil.sortArray(array)).forEach(i -> System.out.println(i));*/

       /* ArrayFunctions arrayFunctions = new ArrayFunctions();
        int[] array2 = {2,1,3,1,1,4};
        Map elements = arrayFunctio2ns.majorityElements(array2);
        for (Object result: elements.entrySet()) {
            System.out.println(result);

        }*/
       /*StringFunctions stringFunctions = new StringFunctions();
        stringFunctions.reverseString("shelly");*/

        /*ArrayFunctions arrayFunctions = new ArrayFunctions();
        arrayFunctions.fibonacciSeries();*/

        /*NumberOperations numberOperations = new NumberOperations();
        numberOperations.oddNumberOfFactors();*/

       /* StringFunctions stringFunctions = new StringFunctions();
        //char[] reversedString = new char[6];
        System.out.println(stringFunctions.recursiveReverse("shelly"));*/

        int[] array = {4,7,10,12};
        ArrayFunctions2 arrayFunctions2 = new ArrayFunctions2();
        arrayFunctions2.subArraySum(array,10);
        int[] array2 = {5,8,12,15};
        arrayFunctions2.getTriplets(array2);
        arrayFunctions2.mergeSortedArrays(array,array2);
    }
}
