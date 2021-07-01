package VongLapFor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TinhGiaTriBieuThucU {

	public static void main(String[] args) {
		int n;
		float sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		//Làm tròn đến 2 chữ số thập phân
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		
		//n còn nhỏ hơn 1 thì còn nhập lại
		do {
			System.out.println("Mời bạn nhập vào số n");
			n = scanner.nextInt();
		}while (n < 1);
		//Tính giá trị của biểu thức
		//i còn nhỏ hơn hoặc bằng n thì thực hiện thân vòng lặp
		
		for(int i =1; i <= n; i++) {
			//Ép kiểu về float để có kết quả chính xác hơn
			sum += (float) i/(i+1);
		}
		System.out.println("Tổng =" + decimalFormat.format(sum));

	}

}
