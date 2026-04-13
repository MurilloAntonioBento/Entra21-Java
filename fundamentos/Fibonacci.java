package Fundamentos;

import java.math.BigInteger;

public class Fibonacci {
    static void main(String[] args) {
        BigInteger[] fibonacci = new BigInteger[100];
        fibonacci[0] = BigInteger.ZERO;
        fibonacci[1] = BigInteger.ONE;
        for(int i = 2; i < 100; i++) {
            fibonacci[i] = fibonacci[i-1].add(fibonacci[i-2]);
            System.out.print(fibonacci[i] +", ");
        }
    }
}
