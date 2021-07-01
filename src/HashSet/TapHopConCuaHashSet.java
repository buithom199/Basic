package HashSet;

import java.util.HashSet;

public class TapHopConCuaHashSet {

	public static void main(String[] args) {
		// tạo mới 2 HashSet có kiểu là integer
		HashSet<Integer> hashSetInteger1 = new HashSet<>();
		HashSet<Integer> hashSetInteger2 = new HashSet<>();
		
		//Thêm phần tử vào 2 HashSet này
		hashSetInteger1.add(3);
		hashSetInteger1.add(2);
		hashSetInteger1.add(6);
		hashSetInteger1.add(7);
		
		hashSetInteger2.add(6);
		hashSetInteger2.add(3);
		hashSetInteger2.add(8);
		
		//Hiển thị 2 HashSet
		System.out.println("Các phần tử của hashSetInteger1" + hashSetInteger1);
		System.out.println("Các phần tử của hashSetInteger2" + hashSetInteger2);

		//Kiểm tra hashSetInteger2 có phải là tập hợp con của hashSetInteger1 hay không?
		//Sử dụng phương thức constainsAll()
		if(hashSetInteger1.containsAll(hashSetInteger2)) {
			System.out.println("hashSetInteger2 là tập hợp con của hashSetInteger1");
		}else {
			System.out.println("hashSetInteger2 không là tập hợp con của hasSetInteger1");
		}
		
		//Thêm tất cả các phần tử của hashSetInteger2 vào hashSetInteger1
		//và hiển thị lại hashSetInteger1
		//Sử dụng phương thức addAll()
		hashSetInteger1.addAll(hashSetInteger2);
		System.out.println("Các phần tử của hashSetInteger1 sau khi thêm:" + hashSetInteger1);
		
		//Tìm và hiển thị các phần tử chung giữa 2 HashSet này
		//sử dụng phương thức retainAll()
		hashSetInteger1.retainAll(hashSetInteger2);
		System.out.println(hashSetInteger1);
	}

}
