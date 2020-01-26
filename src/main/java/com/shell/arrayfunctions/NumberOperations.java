package com.shell.arrayfunctions;

import java.util.Scanner;

public class NumberOperations {

    public void oddNumberOfFactors() {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int number = scanner.nextInt();
            int count = 0;
            for (int j = 1; j <=number; j++) {
                double factor = Math.sqrt(j);
                if (factor % 1 == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
