package XuLySoLieuTrongJaVa;

import java.math.RoundingMode;
import java.text.NumberFormat;

public class LamTronSo {

	public static void main(String[] args) {
		NumberFormat numfFormat = NumberFormat.getNumberInstance();
		numfFormat.setMaximumFractionDigits(2); //làm tròn đến 2 chữ số phần thập phân
		
		//RoundingMode.UP: làm tròn lên
		numfFormat.setRoundingMode(RoundingMode.UP);
		System.out.println("Chế độ làm tròn: " + numfFormat.getRoundingMode());
		System.out.println("534.345 sau khi làm tròn" + numfFormat.format(534.345));
		System.out.println("2345.9875 sau khi làm tròn" + numfFormat.format(2345.9875));
		System.out.println("374.593 sau khi làm tròn" + numfFormat.format(374.593));
		

		//RoundingMode.DOW: làm tròn xuống
				numfFormat.setRoundingMode(RoundingMode.DOWN);
				System.out.println("Chế độ làm tròn: " + numfFormat.getRoundingMode());
				System.out.println("534.345 sau khi làm tròn" + numfFormat.format(534.345));
				System.out.println("2345.9875 sau khi làm tròn" + numfFormat.format(2345.9875));
				System.out.println("374.593 sau khi làm tròn" + numfFormat.format(374.593));
				

	}

}
