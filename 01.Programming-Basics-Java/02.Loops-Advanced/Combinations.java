package NestedLoopsLab;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int validCombinationsCount = 0;
        // x1 + x2 + x3 = n;
        int sum = 0;
        for (int x1 = 0; x1 <= n; x1++) {
            for (int x2 = 0; x2 <= n; x2++) {
                for (int x3 = 0; x3 <= n; x3++) {
                   sum = x1 + x2 + x3;
                  if(sum == n){
                      validCombinationsCount++;
                      sum = 0;
                  }
                }
            }
        }
        System.out.println(validCombinationsCount);
    }
}
