package XuLySoLieuTrongJaVa;

import java.text.DecimalFormat;

public class ChuongTrinhTinhSoNam {

	public static void main(String[] args) {
		int soNam =0;
		double tienGui = 10000;
		String patternLaiString = "#.###";
		String patternGuiString = "$#.##";
		//làm tròn tiền lãi và tiền gửi đến 2 chữ số phần thập phân
		DecimalFormat dcfLai = new DecimalFormat(patternLaiString);
		//riêng tiền gửi có thêm dấu $ đằng trước
		DecimalFormat dcfGui = new DecimalFormat(patternGuiString);
		
		while(tienGui<20000) {
			soNam++;
			double tienLai = tienGui *5/100;
			tienGui += tienLai;
			System.out.println("Năm" + soNam + "tiền lãi =" + dcfLai.format(tienLai)
			+ "tổng tiền gửi =" + dcfGui.format(tienGui));
		}
		System.out.println("===> Sau" + soNam + "số tiền gửi sẽ tăng gấp đôi");

	}

}
