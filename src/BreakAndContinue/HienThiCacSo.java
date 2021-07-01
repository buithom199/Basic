package BreakAndContinue;

public class HienThiCacSo {

	public static void main(String[] args) {
		for(int i = 10; i>=0; i--) {
			System.out.println(i);
			
			//Kiểm tra nếu i <=5 thì thoát vòng lặp
			if(i <=5) {
				break;
			}
		}

	}

}
