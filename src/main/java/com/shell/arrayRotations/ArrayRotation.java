package com.shell.arrayRotations;

import org.springframework.stereotype.Component;

@Component
public class ArrayRotation {

    public void rotateByNumber(int number){
        System.out.println("in method");
        int[] randomArray = {1,2,3,4,5,6};
        int[] rotatedArray = {1,2,3,4,5,6};
        System.out.println(randomArray);
        for(int i=0;i<randomArray.length;i++){
            System.out.println(randomArray[i]);
            rotatedArray[i] = randomArray[i] + number;
        }
        for(int rotated : rotatedArray){
            System.out.println(rotated);
        }
    }

    public void rotateAndDelete(int[] array){
        int resultArray[] = array.clone();
        int j = 0;
        while(resultArray.length!=1){
            resultArray = rotateArray(resultArray);
            int index = resultArray.length - (j + 1);
            resultArray = removeElement(resultArray, index);
            for (int result: resultArray
                 ) {
                System.out.println("Iteration" + j);
                System.out.println(result);

            }
            j++;
        }
    }


    private int[] removeElement(int[] array, int index){
    int[] tempArr = new int[array.length-1];
    int j = 0;
    for(int i=0;i<array.length;i++){
        if(i == index){

        }else{
            tempArr[j] = array[i];
            if(j!=tempArr.length-1)
                j++;
         }

    }
    return tempArr;
    }

    private int[] rotateArray(int[] array){
        int[] tempArr = new int[array.length];
        tempArr[0] =  array [ array.length - 1 ];
        for(int i=0;i<array.length - 1;i++){
            tempArr[i + 1] = array[i];
        }
        return tempArr;
    }
}