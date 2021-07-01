package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Vidu03 {

	public static void main(String[] args) {
		int n; //số phần tử trong danh sách
		int node; //giá trị của phần tử trong danh sách
		Scanner scanner = new Scanner(System.in);
		Iterator<Integer> iterator;
		
		//Khai báo một danh sách liên kết lưu trữ các số nguyên
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		//Khai báo một danh sách liên kết lưu trữ các số lẻ
		LinkedList<Integer> linkedListLe = new LinkedList<>();
		
		System.out.println("Nhập vào số phần tử của danh sách:");
		n = scanner.nextInt();
		
		System.out.println("Nhập giá trị của các phần tử trong danh sách");
		for(int i=0; i<n; i++) {
			System.out.print("Nhập phần tử thứ" + i + ":");
			node = scanner.nextInt();
			linkedList.add(node);
		}
		
		//tạo bản sao của linkedList
		//sử dụng phương thức clone()
		LinkedList<Integer> linkedListCopy = (LinkedList<Integer>)linkedList.clone();
		
		//Hiển thị các phần tử lẻ có trong danh sách ra màn hình
		for(int i = 0; i<n;i++) {
			//số lẻ là số không chia hết cho 2
			//chúng ta sẽ kiểm tra phần tử thứ i trong linkedList
			//có chia hết chp 2 hay không
			//nếu có thì thêm phần tử đó vào trong linkedListLe
			if(linkedList.get(i)%2 !=0) {
				linkedListLe.add(linkedList.get(i));
			}
		}
		System.out.println("\n Các phần tử lẻ có trong danh sách là:");
		iterator = linkedListLe.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next() + "\t");
		}
		
		//Tìm trong danh sách các phần tử có giá trị chia hết cho 2 và 5
		System.out.println("Các phần tử chia hết cho 2 và 5 có trong danh sách là");
		for(int i =0; i<n; i++) {
			if((linkedList.get(i) %2 == 0 && (linkedList.get(i) % 5 == 0))) {
				System.out.print(linkedList.get(i) + "\t");
				
				
			} 
		}
		
		//In giá trị phần tử cuối cùng trong danh sách liên kết
		//Sử dụng phương thức getLast()
		System.out.print("\n Phần tử cuối cùng trong danh sách =" + linkedList.getLast() + "\n") ;
		
		//Kiểm tra phần tử kê cuối của danh sách là chẵn hay lẻ
		//phần tử kế cuối của danh sách
		//là phần tử có chỉ số = size -2
		int ptKeCuoi = linkedList.get(linkedList.size() -2);
		if(ptKeCuoi %2 ==0) {
			System.out.println("Phần tử kế cuối = " + ptKeCuoi + "là số chẵn");
		}else {
			System.out.println("Phần tử kế cuối = " + ptKeCuoi + "là số lẻ");
		}
		
		//Điểm số phần tử có giá trị = x trong danh sách
		//x được nhập từ bàn phím
		//Số phần tử có giá trị = x trong danh sách
		int soPhanTu = 0;
		System.out.print("Nhập giá trị x:");
		int x = scanner.nextInt();
		for(int i =0; i<n; i++) {
			if(linkedList.get(i) == x) {
				soPhanTu++;
			}
		}
		System.out.println("Số phần tử có giá trị = " + x +
				"trong danh sách là" + soPhanTu);
		
		//Xuất ra màn hình giá trị của phần tử thứ K trong danh sách
		//Không nhập từ bàn phím
		//Giá trị của k phải lớn hơn 0 và nhỏ hơn số phần tử tối đa của danh sách
		System.out.print("Nhập số k");
		int k = scanner.nextInt();
		while (k < 0 || k>n-1) {
			System.out.print("Nhập lại số k");
			k = scanner.nextInt();
		}
		
		System.out.print("Giá trị của phần tử thứ" + k + "trong danh sách =" +
		linkedList.get(k)) ;
		
		//Xóa phần tử lẻ trong danh sách
		//sử dụng phương thức remove()
		for(int i =0; i<n; i++) {
			if(linkedList.get(i) %2 !=0) {
				linkedList.remove(linkedList.get(i));
				//sau khi xóa phần tử lẻ thì sẽ giảm số phần tử đi 1
				//và giảm i đi 1 (quay lại phần tử đứng trước nó
				//và duyệt lại danh sách
				n--;
				i--;	
			}
		}
		System.out.println("\nCác phần tử còn lại trong danh sách"
				+ "Sau khi xóa đi các phần tử lẻ:");
		iterator = linkedList.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
			//Xóa phần tử chẵn trong danh sách
		//Tương tự như khi xóa phần tử lẻ
		int m = linkedListCopy.size();
		for(int i =0; i<m; i++) {
			if(linkedListCopy.get(i) %2 ==0) {
				linkedListCopy.remove(linkedListCopy.get(i));
				//sau khi xóa phần tử chẵn thì sẽ giảm số phần tử đi 1
				//Và giảm i đi 1 (quay lại phần tử đứng trước nó
				//và duyệt lại danh sách
				m--;
				i--;
			}
		}
		System.out.println("\nCac phần tử còn lại trong danh sách"
				+ "sau khi xóa đi các phần tử chẵn");
		iterator = linkedListCopy.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
			
		}
		}

	}


