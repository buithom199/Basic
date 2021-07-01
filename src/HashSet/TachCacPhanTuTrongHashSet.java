package HashSet;

import java.util.HashSet;

public class TachCacPhanTuTrongHashSet {

	public static void main(String[] args) {
		// Tạo mảng và thêm các phần tử cho mảng
		Integer[] array = {1,2,3,2,4,5,1,6,1};
		
		//Tạo 2 HashSet
		//HashSet1 chứa các phần tử không trùng nhau
		//và hashSet2 chứa các phần tử đã tồn tại trong hashSet1
		HashSet<Integer> hashSet1 = new HashSet<>();
		HashSet<Integer> hashSet2 = new HashSet<>();
		
		//Sử dụng vòng lặp for duyệt qua các phần tử của mảng
		//Kiểm tra nếu hashSet1 chứa phần tử tại vị trí i của mảng
		//thì sẽ thêm phần tử đó vào hashSet2
		//ngược lại thì thêm vào hashSet1
		for(int i=0; i<array.length; i++) {
			if(hashSet1.contains(array[i])) {
				hashSet2.add(array[i]);
			}else {
				hashSet1.add(array[i]);
			}
			
		}
		//Hiển thị các phần tử của hashSet1
		System.out.println("Các phần tử của hashSet1" + hashSet1);

	}

}
