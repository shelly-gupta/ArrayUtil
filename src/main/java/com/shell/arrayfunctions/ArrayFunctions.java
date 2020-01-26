package com.shell.arrayfunctions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ArrayFunctions {

    public Map majorityElements(int[] intArray){
        Map<Integer,Integer> countMap = new HashMap<>();
        for(int i=0;i<intArray.length;i++){
            Iterator itr = countMap.entrySet().iterator();
            while(itr.hasNext()){
                if(intArray[i] == (Integer)itr.next()){
                    break;
                }
            }
            countMap.put(intArray[i],countMap.get(intArray[i])+1);
        }
        return countMap;
    }

    public void fibonacciSeries(){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i=0;i<T;i++){
            int input = scanner.nextInt();
            long[] fibonacci = new long[input];
            if(input<=1 || input>=84){
                continue;
            }

                fibonacci[0] = 1;
                fibonacci[1] = 1;


            for(int j=2;j<input;j++){
                fibonacci[j] = fibonacci[j-1] + fibonacci[j-2];
            }
            for (int k=0;k<fibonacci.length;k++) {
                System.out.print(fibonacci[k]+" ");
            }
        }
    }
}
