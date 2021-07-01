package VongLapFor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TinGiaTriBieuThucM {

	public static void main(String[] args) {
		int n;
		float sum =0, temp1 = 1, temp2 = 0;
		Scanner scanner = new Scanner(System.in);
		
		//làm tròn đến 2 chữ số thập phân
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		
		//n còn nhỏ hơn 1 thì nhập lại
		do {
			System.out.println("Mời bạn nhập số n vào");
			n= scanner.nextInt();
		}while (n < 1);
		//Tính giá trị của biểu thức
		//i còn nhỏ hoặc bàng n thì còn thực hiện thân vòng lặp
		for(int i = 1; i<= n; i++) {
			//Tính giai thừa (mẫu số)
			temp1 *= i;
			//Tính tử số
			temp2 += i;
			sum += (float) temp2/temp1;
		}
		System.out.println("Tổng = " + decimalFormat.format(sum));

	}

}
