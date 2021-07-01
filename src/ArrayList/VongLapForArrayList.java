package ArrayList;

import java.util.ArrayList;

public class VongLapForArrayList {

	public static void main(String[] args) {
		//khai báo 1 ArrayList có tên l1 arrListString
		//có kiểu là String
		ArrayList<String> arrayListString = new ArrayList<>();
		
		//Thêm các phần tử sử dụng phương thức add()
		arrayListString.add("JAVA");
		arrayListString.add("PHP");
		arrayListString.add("C#");
		arrayListString.add("C++");
		
		//Duyệt theo kích thước của arrListString
		//sử dụng vòng lặp for thông thường
		//Phương thức arrListString.size() sẽ trả về số phần tử của arrListString
		//và sau đó lấy phần tử tại vị trí thứ i thông qua hà get()
		//sau đó hiển thị giá trị phần tử đó ra
		System.out.println("Các phần tử có trong arrListString là:");
		for(int i=0; i<arrayListString.size();i++) {
			System.out.print(arrayListString.get(i) + "\t");
		}

	}

}
