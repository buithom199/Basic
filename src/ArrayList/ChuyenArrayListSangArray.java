package ArrayList;

import java.util.ArrayList;

public class ChuyenArrayListSangArray {

	public static void main(String[] args) {
		ArrayList<Integer> arrayListInteger = new ArrayList<>();
		arrayListInteger.add(2);
		arrayListInteger.add(4);
		arrayListInteger.add(6);
		arrayListInteger.add(8);
		
		//Chuyển đổi arrListInteger sang mảng
		//sử dụng phương thức toArray()
		//kết quả của phương thức này sẽ trả về mảng arr
		//có kiểu là Object (Chi tiết về Object chúng ta sẽ gặp trong các bài sai)
		Object[] arr = arrayListInteger.toArray();
		
		//sử dụng vòng lặp for để hiển thị các phần tử có trong mảng arr
		for(int i =0; i<arr.length; i++) {
			System.out.println("Phần tử tại vị trí" + i + "trong arr là" + arr[i]);
		}

	}

}
