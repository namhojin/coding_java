package site.hoya.mail;

public class Q1 {

	static int solution(int array[]) {
		int cur = array[0];
		int sum = array[0];
		for(int i=1; i<array.length; i++) {
			cur = Math.max(array[i], cur+array[i]);
			sum = Math.max(sum, cur);
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {2, 4, -2, -3, 8};
		System.out.println(solution(array));

	}

}
