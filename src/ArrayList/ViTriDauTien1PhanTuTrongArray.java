package ArrayList;

import java.util.ArrayList;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class ViTriDauTien1PhanTuTrongArray {

	public static void main(String[] args) {
		ArrayList<String> arrListString = new ArrayList<>();
		arrListString.add("Bird");
		arrListString.add("Rabbit");
		arrListString.add("Tiger");
		arrListString.add("Bird");
		
		//Tìm kiếm vị trí xuất hiện đầu tiên của phần tử "Bird" trong arrListString
		//sử dụng phương thức indexOf()
		//kết quả của phương thức này sẽ trả về 1 biến có kiểu số nguyên
		int position1 = arrListString.indexOf("Bird");
		System.out.println("Vị tí xuất hiện đầu tiên của phần tử \"Bird\" trong ArrayList là"
				+ position1);
		
		//Tìm kiếm vị trí xuất hiện đầu tiên của phần tử "Cat" trong arrListString
		//vì phần tử này không có trong arrListString
		int position2 = arrListString.indexOf("Cat");
		System.out.println("Vị trí xuất hiện đầu tiên của phần tử \"Cat\" trong ArraList là"
				+ position2);

	}

}
