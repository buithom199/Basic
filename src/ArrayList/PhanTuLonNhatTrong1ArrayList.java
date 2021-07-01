package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class PhanTuLonNhatTrong1ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arrayListInteger = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int number; //phần tử của mảng
		
		System.out.println("Nhập số phần tử của ArrayList:");
		int n = scanner.nextInt();
		
		//Nhập và thêm phần tử cho arraylist
		for(int i=0; i<n; i++) {
			System.out.print("Nhập phần tử thứ" + i + ":");
			number = scanner.nextInt();
			arrayListInteger.add(number);
		}
		
		//tìm phần tử lớn nhất trong mảng
		//sử dụng phương thức compareTo()
		//giả sử phần tử lớn nhất là phần tử đầu tiên trong ArrayList
		int max = arrayListInteger.get(0);
		
		for(int i =1; i< arrayListInteger.size(); i++) {
			//nếu kết quả của phép so sánh này lớn hơn 0
			//tức biến max nhỏ hơn phần tử tại vị trí thứ i trong ArrayList
			//thì gán max = phần tử tại vị trí i
			//và đó chính là phần tử lớn nhất
			if(arrayListInteger.get(i).compareTo(max) >0) {
				max = arrayListInteger.get(i);
			}
		}
		System.out.println("Phần tử lớn nhất trong arrListInteger=" + max);

	}

}
