package MangHaiChieu;

import java.util.Scanner;

public class MaTranVuong {

	public static void main(String[] args) {
		int n, max =10;
		int kt=1; //là ma trận tam giác trên
		int dinhThuc =1;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Nhập vào bậc của ma trận");
			n= scanner.nextInt();
		}while(n<0);
		
		int[][] A = new int [n][n];
		System.out.println("Nhập vào các phần tử của ma trận A");
		for(int i =0; i<n; i++) {
			for(int j =0; j<n; j++) {
				System.out.print("A[" + i + "][" +j + "]=");
				A[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Ma trận A");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n;j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println("\n");
		}
		
		//Kiểm tra ma trận A có phải là ma trận tam giác trên hay không?
		//Ma trận tam giác trên là ma trận
		//Có các phần tử nằm dưới đường chéo chính =0
		//Đặc điểm của các phần tử này có chỉ số dòng > chỉ số cột
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(A[i][j] ==0) {
				kt =1;
			}
			else {
				kt =0;
			}
		}

	}
		if(kt ==1) {
			System.out.println("Ma trận A là ma trận tam giác trên");
		}else {
			System.out.println("Ma trận A không là ma trận tam giác trên");
		}
		
		//Tính định thức của ma trận trên
		//Định thức của ma trận tam giác trên
		//sẽ bằng tích các phần tử nằm trên dường chéo chính
		for(int i =0; i<n; i++) {
			for(int j=0; j<n; j++) {
			//Các phần tử nằm trên đường chéo chính
			//Có đặc điểm là chỉ số dòng = chỉ số cột
			if(i==j) {
				dinhThuc *= A[i][j];
			}
		}
		System.out.println("Định thức của ma trận trên =" + dinhThuc);
}
	}
}