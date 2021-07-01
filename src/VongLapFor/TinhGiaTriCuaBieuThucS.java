package VongLapFor;

import java.util.Scanner;

public class TinhGiaTriCuaBieuThucS {

	public static void main(String[] args) {
		int n, result = 0;
		Scanner scanner = new Scanner(System.in);
		
		// n còn nhỏ hơn 1 thì còn nhập lại
		do {
			System.out.println("Mời bạn nhập vào số n:");
			n = scanner.nextInt();
		}while(n < 1);
		
		//Tính giá trị của biểu thức
		//i còn nhỏ hoặc bằng n thì còn thực hiện thân vòng lap85
		
		for(int i =1; i <= n; i++) {
			//Kiểm tra nếu số i là số chẵn thì thực hiện phép trừ
			if(i %2 == 0) {
				//result = result - i
				result -= i;
			}else {
				//Ngược lại nếu số i là số lẻ thì thực hiện phép cộng
				// result = result + 1
				result += i;
			}
		}
		System.out.println("Kết quả =" + result);

	}

}
