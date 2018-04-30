package site.hoya.test;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
	static ArrayList<Integer> solution(int array[]){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<array.length; i++) {
			list.add(array[i]);
			
			
		}
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		int array[] = {1,2,3,4,5};
		
		System.out.println(solution(array));
		
	}

}
