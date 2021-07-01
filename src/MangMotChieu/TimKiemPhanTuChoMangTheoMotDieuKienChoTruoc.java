package MangMotChieu;

import java.util.Scanner;

public class TimKiemPhanTuChoMangTheoMotDieuKienChoTruoc {

	public static void main(String[] args) {
		int n, max = 100, i;
		int[]A = new int[max];
		Scanner scanner =new Scanner(System.in);
		do {
			System.out.println("Nhập số phần tử của mảng:");
			n = scanner.nextInt();
		}while(n <=0 || n>max-1 );
		System.out.println("Nhập giá trị cho các phần tử của mảng:");
		for(i=0; i< n; i++) {
			System.out.println("A["+i+"]");
			A[i] = scanner.nextInt();
		}
		System.out.println("Nhập số nguyên k cần tìm");
		int k = scanner.nextInt();
		 i = 0;
		 //Tiến hành tìm kiếm phần tử
		 //Nếu không tìm thấy giá trị tại i bằng với số nguyn6 k
		 //Thì tăng i lên 1
		 while ((i <n) && (A[i] !=k)) {
			i++;	
		}
		 
		 //Nếu i lớn hơn số phần tử của mảng -1
		 //thì thông báo không tìm thấy phần tử
		 //Ngược lại hiển thị ra i
		 if(i> n-1) {
			 System.out.println("Trong mảng không có phần tử nào chứa giá trị cần tìm");
		 }else {
			System.out.println("Phần tử đầu tiên có giá trị bằng"+ k + "tại vị trí =" + i);
		}

	}

}
