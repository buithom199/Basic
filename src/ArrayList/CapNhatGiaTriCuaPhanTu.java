package ArrayList;

import java.util.ArrayList;

public class CapNhatGiaTriCuaPhanTu {

	public static void main(String[] args) {
		ArrayList<Integer> arrayListInteger = new ArrayList<>();
		
		//thêm phần tử vào trong arrListInteger
		arrayListInteger.add(5);
		arrayListInteger.add(8);
		arrayListInteger.add(34);
		arrayListInteger.add(54);
		arrayListInteger.add(55);
		arrayListInteger.add(78);
		
		System.out.println("Các phần tử của arrListInteger ban đầu:");
		System.out.println(arrayListInteger);
		
		//cập nhật giá trị của phần tử thứ 4
		//trong arrListInteger bằng phương thức set()
		arrayListInteger.set(4, 204);
		
		System.out.println("Các phần tử của arrListInteger sau khi cập nhật");
		System.out.println(arrayListInteger);

	}

}
