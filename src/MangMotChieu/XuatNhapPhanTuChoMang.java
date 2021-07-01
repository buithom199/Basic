package MangMotChieu;

import java.util.Scanner;

import javax.print.attribute.Size2DSyntax;

public class XuatNhapPhanTuChoMang {

	public static void main(String[] args) {
		// kích thước của mảng
		int size;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập vào độ dài của mảng");
		size = scanner.nextInt();
		
		//Khai báo và cấp phát bộ nhớ cho mảng
		//Mảng này có tên là array và kích thước = size
		int[] array = new int[size];
		
		//array.length(): trả về kích thước của mảng
		//Vòng lặp này sẽ duyệt i từ 0 dến chiều dài của mảng -1
		for(int i = 0; i < size; i++) {
			System.out.println("Nhập vào phần tử thứ" +i + ":");
			//Nhập giá trị cho phần tử
			array[i] = scanner.nextInt();
		}
		//Hiển thị giá trị các phần tử trong mảng
		for(int i=0; i<size;i++) {
			System.out.println("Phần tử thứ" + i + ":"+ array[i]);
		}

	}

}
