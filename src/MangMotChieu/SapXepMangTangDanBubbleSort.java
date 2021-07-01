package MangMotChieu;

import java.util.Scanner;

public class SapXepMangTangDanBubbleSort {

	public static void main(String[] args) {
		//Số phần tử trong mảng
		int n, temSort;
		Scanner scanner = new Scanner(System.in);
		
		//Nếu n<0 thì phải nhập lại
		do {
			System.out.println("Nhập vào số phần tử của mảng:");
			n= scanner.nextInt();
		}while(n<0);
		
		//Khai báo và cấp phát bộ nhớ cho mảng
		int array[] = new int[n];
		
		//Nhập giá trị cho các phần tử cho mảng
		for(int i =0; i<n;i++) {
			System.out.println("Nhập phần tử thứ"+ i+":");
			array[i] = scanner.nextInt();
		}
		//Hiển thị mảng ban đầu
		System.out.println("\nMang ban đầu:");
		for(int i =0; i<n; i++) {
			System.out.print(array[i] + "\t");
		}
		
		//Sắp xếp mảng sử dụng phương pháp Bubble sort
		//duyệt i từ 0 đến n-2
		//Sau mỗi lần duyệt j = n-1
		//sau mỗi lần duyệt j = n-1 đến j >= 1
		//thì sau đó tăng i lên 1 và quay lại duyệt j
		//khi i>n - 1  thì ngừng vòng lặp
		for(int i =0 ; i<n-1; i++) {
			for(int j = n-1; j>=1; j--) {
				//Nếu phần tử đứng sau nhỏ hơn phần tử đứng trước
				//thì đổi 2 phần tử đó cho nhau
				//với cách sắp ếp này thì trong lần duyệt đầu tiên
				//Phần tử nhỏ nhất sẽ được chuyển lên trên cùng
				if(array[j] < array[j-1]) {
					temSort = array[j];
					array[j] = array[j-1];
					array[j-1] = temSort;
				}
			}
		}
		System.out.println("Mảng sau khi sắp xếp:");
		for(int i=0; i<n; i++) {
			System.out.print(array[i] +"\t");
		}

	}

}
