package XuLySoLieuTrongJaVa;

import java.text.NumberFormat;
import java.util.Locale;

public class DecimalFormat01 {

	public static void main(String[] args) {
		double floatNumber = 232323.152345d;
		
		//Tạo 1 DecimalFormat để định dạng theo tiêu chuẩn của nước Anh
		Locale locale = new Locale("en","EN");
		
		//khai báo 1 DecimalFormat có tên là dcf
		//để định dạng số floatNumber theo mẫu "###, ###.##"
		//tức là phần thập phân của số floatNumber sau khi định dạng sẽ có 2 chữ số
		//và phần ngàn của số sẽ được phân cách bằng dấu phẩy
		//lưu ý: trong pattern chúng t nhận thấy phần đứng trước dấu thập phân có 7 chữ số
		//trong khi số floatNumber của chúng ra có 6 chữ số ở phần nguyên
		//vì vậy đối với DecimalFormat thì tất cả các chữ số ở phần nguyên
		//là bất kỳ và không phụ thuộc vào chữ số phần nguyên được khai báo trong pattern
		//nhưng phần thập phân của số phài bằng phần thập phân của pattern
		String patternString = "###,###.##";
		NumberFormat dcFormat =  NumberFormat.getNumberInstance(locale);
		System.out.println("Số" + floatNumber + "sau khi định dạng="
				+ dcFormat.format(floatNumber));

	}

}
