package site.hoya.mail;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
	static ArrayList<String> solution(int N){
		ArrayList<String> list = new ArrayList<String>();
		rec(list, "", 0, 0, N);
		return list;
	}
	static void rec(ArrayList<String> list, String cur, int open, int close, int N) {
		if(cur.length() == N*2) {
			list.add(cur);
			return;
		}
		if(open<N) {
			rec(list, cur+"(", open+1, close, N);
		}
		if(close<open) {
			rec(list, cur+")", open, close+1, N);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		System.out.println(solution(N));
	}
}
