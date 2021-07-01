package MangHaiChieu;

import java.util.Scanner;

public class XuatNhapCacPhanTuChoMang {

	public static void main(String[] args) {
	//Khai báo số dòng và số cột cho mảng
		int soDong, soCot;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập vào số dòng của mảng");
		soDong = scanner.nextInt();
		System.out.println("Nhập vào số cột của mảng:");
		soCot = scanner.nextInt();
		
		//Khai báo và cấp phát bộ nhớ cho mảng
		int[][] A = new int[soDong][soCot];
		
		//Để nhậ giá trị cho các phần tử cho mảng
		//Chúng ta sẽ sử dụng 2 vòng lặp for
		//Vòng lạp for bên ngoài sẽ duyệt i từ 0 đến soDong -1
		//Và vòng lặp for bên trong sẽ duyệt j từ 0 đến soCot - 1
		//Mỗi lần như vậy thì sẽ nhập vào phần tử tại vị trí i, j
		for(int i =0; i< soDong; i++) {
			for(int j =0; j<soCot; j++) {
				System.out.print("Nhập phần tử thứ [" + i + "," +j+"]");
				A[i][j] = scanner.nextInt();
			}
		}
		//Hiển thị các phần tử trong mảng vừa nhập
		//Chúng ta cũng sử dụng 2 vòng lặp for như khi nhập
		System.out.println("Mảng vừa nhập:");
		for(int i =0; i<soDong ;i++) {
			for(int j=0; j<soCot;j++) {
				System.out.print(A[i][j] + "\t");
			}
			//Sau khi viết xong 1 dòng thì xuống hàng
			System.out.println("\n");
		}
		

	}

}
