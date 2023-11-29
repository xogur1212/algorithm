package Eulerproductformula;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 자연수 n이 주어졌을 때, GCD(n, k) = 1을 만족하는 자연수 1 ≤ k ≤ n 의 개수를 구하는 프로그램을 작성하시오.
 * 첫째 줄에 자연수 n (1 ≤ n ≤ 1012)이 주어진다
 * GCD(n, k) = 1을 만족하는 자연수 1 ≤ k ≤ n 의 개수를 출력한다.
 * 1부터 N까지 범위에서 N과 서로소인 자연수의 개수를 구하는 함수입니다. 오일러 피 함수는 에라토스테네스의 체에서 배수를 지우는 부분만 P[i] = P[i] - P[i]/K
 */
public class Euler {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        long pi = n;
        for(long i=2; i*i<=n; i++) {
            if(n%i==0) {
                pi = pi/i*(i-1);
            }
            while(n%i==0) {
                n/=i;
            }

        }
        if(n!=1) {
            pi = pi/n*(n-1);
        }
        System.out.println(pi);
    }
}
