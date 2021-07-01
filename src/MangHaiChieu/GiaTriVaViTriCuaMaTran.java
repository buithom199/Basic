package MangHaiChieu;

import java.util.Scanner;

public class GiaTriVaViTriCuaMaTran {

	public static void main(String[] args) {
		int n,m;
		//Vị trí dòng và vị trí cột
		int rowPosition =0, colPosition =0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập vào số dòng của ma trận:");
		m = scanner.nextInt();
		System.out.println("Nhập vào số cột của ma trận");
		n = scanner.nextInt();
		
		int A[][] = new int[m][n];
		
		System.out.println("Nhập các phần tử cho ma trận:");
		for(int i =0; i<m; i++) {
			for(int j=0; j<n;j++) {
				System.out.println("A["+ i + "][" + j+ "]=");
				A[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Ma trận A vừa nhập");
		for(int i =0; i<m; i++) {
			for(int j =0; j<n; j++) {
				System.out.println(A[i][j] + "\t");
			}
			System.out.println("\n");
		}
		for(int i=0; i<m; i++) {
			for(int j=0; j<n;j++) {
				//Nếu phần tử A tại vị trí i và j
				//lớn hơn phần tử tại vị trí rowPosition và colPosition
				//thì sẽ lưu lại vị trí của phần tử lớn nhất
				//bằng cách gắn vị trí rowPosition và colPosition =j
				if(A[i][j] > A[rowPosition][colPosition]) {
					rowPosition = i;
					colPosition = j;
				}
			}
		}
		//Hiển thị vị trí của phần tử lớn nhất trong ma trận
		System.out.println("Phần tử lớn nhất trong ma trận là" + A[rowPosition][colPosition]
				+"Có vị trí(" + rowPosition + "," + colPosition +")");
		

	}

}
