package BreakAndContinue;

public class HienthiVongLap {

	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			System.out.println("Lần thứ" + i);
			System.out.println("Chào bạn");
			
			//Khi i = 3 thì ngừng vòng lặp
			if(i == 3) {
				break;
			}
		}
		System.out.println("Hết vòng lặp");

	}

}
