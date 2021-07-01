package VongLapFor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TinhGiaTriCuaBieuThucK {

	public static void main(String[] args) {
		int n;
		float sum =0, temp =1 ;
		Scanner scanner = new Scanner(System.in);
		
		//Làm tròn đến 2 chữ số thập phân
		DecimalFormat decimalFormat = new DecimalFormat();
		
		//n còn nhỏ hơn 1 thì nhập lại
		do {
			System.out.println("Mời bạn nhập vào số n");
			n= scanner.nextInt();
		}while(n<1);
		
		//tính giá trị của biểu thức
		// i còn nhỏ hơn hoặc bằng n thì còn thực hiện vòng lặp thân
		
		for(int i =1; i<=n; i++) {
			//Tính giai thừa
			temp *= i;
		sum += (float) 1/temp;
}
		System.out.println("Tổng=" + decimalFormat.format(sum));
	}
}

