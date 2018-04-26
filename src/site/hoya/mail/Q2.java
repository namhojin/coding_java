package site.hoya.mail;

import java.util.Scanner;

public class Q2 {
	static int solution(int N) {
		int x =0;
		int y =1;
		int sum=0;
		while(x<N) {
			if(x%2==0) {
				sum += x;
			}
			int z=x+y;
			x=y;
			y=z;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		
		System.out.println(solution(N));
		

	}

}
