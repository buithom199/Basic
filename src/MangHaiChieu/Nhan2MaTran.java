package MangHaiChieu;

import java.util.Scanner;

import BreakAndContinue.Break;

public class Nhan2MaTran {

	public static void main(String[] args) {
		int m1, n1; //số dòng và số cột của ma trận A
		int m2, n2; //số dòng và số cột của ma trận B
		char choose;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập vào số dòng của ma trận A");
		m1 = scanner.nextInt();
		System.out.println("Nhập số cột của ma trận A");
		n1 = scanner.nextInt();
		
		System.out.println("Nhập váo số dòng của ma trận B");
		m2 = scanner.nextInt();
		System.out.println("Nhập vào số cột của ma trận B");
		n2 = scanner.nextInt();
		
		int[][] A = new int [m1][n1];
		int[][]B = new int [m2][n2];
		
		//Ma trận tích C= A*B
		//sẽ có số dòng là số dòng của ma trận A
		//và số cột là số cột của ma trận B
		int C[][] = new int [m1][n1];
		
		while(m1> 0 && n1>0 && m2> 0 && n2>0) {
			if(n1 != n2) {
				System.out.println("Để nhân hai ma trận thì" + "Số cột của ma trận A phải bằng số dòng của ma trận B");
				System.out.println("Nhập vào số cột của ma trận A");
				n1= scanner.nextInt();
				System.out.println("Nhập vào số dòng của ma trận B");
				m2 = scanner.nextInt();
				
			}
			else {
				//Nhập giá trị của các phần tử 2 ma trận A
				System.out.println("Nhập vào các phần tử của ma trận A");
				for(int i=0; i<m1;i++) {
					for(int j =0; j<n1; j++) {
						System.out.print("A[" + i + "][" + j + "]=") ;
						A[i][j] = scanner.nextInt();
					}
				}
				//Nhập giá trị của các phần tử cho 2 ma trận B
				System.out.println("Nhập vào các phần tử của ma trận B");
				for(int i=0; i<m2; i++) {
					for(int j=0; j<n2; j++) {
						System.out.println("B[" +i + "][" + j +"]=");
						B[i][j] = scanner.nextInt();
					}
				}
				//Hiển thị 2 ma trận vừa nhập
				System.out.println("Ma trận A:");
				for(int i=0; i<m1;i++) {
					for(int j=0; j<n1; j++) {
						System.out.println(A[i][j] + "\t");
					}
					System.out.println("\n");
				}
				System.out.println("Ma trận B");
				for(int i=0; i<m2; i++) {
					for(int j =0; j<n2; j++) {
						System.out.println(B[i][j] + "\t");
					}
					System.out.println("\n");
				}
				
				//Tính và in ra ma trận C = A*B
				for(int i=0; i< m1; i++) {
					for(int j=0; j< n2; j++) {
						C[i][j] =0;
						for(int k=0; k<n1; k++) {
							C[i][j] = C[i][j] + A[i][k] *B[k][j];
						}
					}
				}
				//Hiển thị ma trận tích C
				System.out.println("Mma trận tích C:");
				for(int i =0; i<m1;i++) {
					for(int j=0; j< n2;j++) {
						System.out.print(C[i][j] + "\t");
					}
					System.out.println("\n");
				}
				
				//Tìm ma trận D là ma trận chuyển vị của ma trận C
				//Ma trận D là ma trận chuyển vị của ma trận C
				//thì các dòng của ma trận C sẽ trở thành
				//Các cột của ma trận D và ngược lại
				//Ví dụ: ma trận C có số dòng m1 = 3 và số cột n2 =4 thì
				//ma trận D sẽ có số dòng n2=4 và số cột m1 =3
				int D[][] = new int [n2][m1];
				for(int i=0; i<m1; i++) {
					for(int j = 0; j< n2; j++) {
						D[j][i] = C[i][j];
					}
				}
				
				//Hiển thị ma trận D
				System.out.println("Ma trận chuyển vị của ma trận C là");
				for(int i=0; i<n2; i++) {
					for(int j=0; j<m1; j++) {
						System.out.print(D[i][j] + "\t");
					}
					System.out.println("\n");
				}
				System.out.println("Bạn có muốn tiếp tục không? Bấm y để tiếp tục, n để thoát!");
				choose = scanner.next().charAt(0);
				if(choose =='y') {
					continue;
				}else {
					System.out.println("Goodbye!");
							break;
				}
			}
		}

	}

}
