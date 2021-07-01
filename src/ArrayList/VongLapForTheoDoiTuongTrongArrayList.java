package ArrayList;

import java.util.ArrayList;

public class VongLapForTheoDoiTuongTrongArrayList {

	public static void main(String[] args) {
		//Khai báo 1 ArrayList có tên là arrListString
		//có kiểu là String
		ArrayList<Integer> arrayListInteger = new ArrayList<>();
		
		//Thêm các phần tử sử dụng phương thức add()
		arrayListInteger.add(0);
		arrayListInteger.add(7);
		arrayListInteger.add(1);
		arrayListInteger.add(9);
		
		//Duyệt theo kích thước của arrListInteger
		//Sử dụng vòng lặp for duyệt theo đối tượng 
		//trong đó kiểu dữ liệu của biến number
		//phải trùng với kiểu dữ liu65 của arrListInteger
		
		System.out.println("Các phần tử có trong arrListInteger là");
		for(int number: arrayListInteger) {
			System.out.print(number + "\t");
		}

	}

}
