package com.shell.arrayfunctions;

import java.util.HashMap;
import java.util.Map;

public class ArrayFunctions2 {
    public void subArraySum(int[] arr,int sumResult){

        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum+= arr[j];
                if(sum == sumResult){
                    System.out.print("Sum of={");
                    for(int k=i;k<=j;k++){
                        System.out.print(arr[k]+",");
                    }
                    System.out.println("}");
                    return;
            }

            }
        }
    }

    public void getTriplets(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                        for(int k=0;k<arr.length;k++){
                            if(i!=j && i!=k && j!=k)
                            if(arr[i] - arr[j] == arr[k]) {

                                if(map.containsKey(arr[i])){
                                    if(map.get(arr[i]) == arr[j]){
                                        continue;
                                    }
                                }else{
                                    map.put(arr[i],arr[j]);
                                    System.out.println("{"+arr[i]+","+arr[j]+","+arr[k]+"}");
                                }

                            }

                    }
                }
            }

        }

        public void mergeSortedArrays(int[]array1,int[] array2){
        int[] array3 = new int[array1.length + array2.length];
        int i=0;
        int j=0;
        int k =0;
      while(i<array1.length && j<array2.length){
          if(array1[i]<array2[j]){
              array3[k++] = array1[i];
              i++;
          }else{
              array3[k++] = array2[j];
              j++;
          }

      }
            System.out.print("{");
            for(int l=0;l< array3.length;l++){
                System.out.print(array3[l]+",");
            }
            System.out.println("}");
        }

}
