package ArrayList;

import java.util.ArrayList;

public class TimKiemTrucTiepPhanTu {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(7);
		arrayList.add(2);
		arrayList.add(9);
		
		//kiểm tra arrListInteger có chứa phần tử có giá trị bàng 2 hay không
		boolean resultcheck= arrayList.contains(2);
		
		//nếu resultCheck == true
		//thì hiển thị thông báo "Có phần tử 2 trong arrListInteger"
		//ngược lại hiển thị thông báo "Không tìm thấy phần tử 2"
		if(resultcheck == true) {
			System.out.println("Có phần tử 2 trong arrListInteger");
		}else {
			System.out.println("Không tìm thấy phần tử 2");
		}

	}

}
