package BreakAndContinue;

public class HienThiCacSoChiaHet5 {

	public static void main(String[] args) {
		System.out.println("Các số chia hết cho 5");
		for(int i = 0; i<=20; i++) {
		//Nếu i không chia hết cho 5 thì quay lại vòng lặp for
		if(i %5 != 0) {
			continue;
		}
		System.err.println(i);

	}

}
}