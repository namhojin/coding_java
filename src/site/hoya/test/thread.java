package site.hoya.test;

public class thread extends Thread {
	int N;
	public thread(int N) {
		this.N = N;
	}
	
	public void run() {
		System.out.println(this.N+" : run");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<7; i++) {
			thread t = new thread(i);
			t.start();	
		}
	}
}