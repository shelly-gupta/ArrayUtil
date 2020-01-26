package com.shell.arrayRotations;

import java.util.stream.IntStream;

public class ArrayUtil {

    public int[] removeElementUsingStreams(int[] array, int index){
        return IntStream.range(0,array.length)
                .filter(i -> i!=index)
                .map(i -> array[i])
                .toArray();
    }

    public int[] sortArray(int[] array){
        return IntStream.range(0,array.length)
                .sorted()
                .toArray();
    }
}
