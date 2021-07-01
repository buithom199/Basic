package ArrayList;

import java.util.ArrayList;

public class XoaPhanTuPhuongThucClear {

	public static void main(String[] args) {
		ArrayList<Integer> arrListInteger = new ArrayList<>();
		
		//Thêm phần tử vào trong arrListInteger
		arrListInteger.add(1);
		arrListInteger.add(4);
		arrListInteger.add(5);
		
		//Hiển thị số phần tử của arrListInteger ban đầu
		//sử dụng phương thức size()
		System.out.println("Số phần tử của arrListInteger ban đầu=" + arrListInteger.size());
		System.out.println("Các phần tử của arrListInteger ban đầu:");
		System.out.println(arrListInteger);
		
		//Xóa tất cả các phần tử trong arrListInteger
		//sử dụng phương thức clear()
		arrListInteger.clear();
		
		System.out.print("Số phần tử của arrListInteger sau khi xóa =" 
		+arrListInteger.size());
		System.out.println("Các phần tử của arrListInteger sau khi xóa ");
		System.out.println(arrListInteger);
		

	}

}
