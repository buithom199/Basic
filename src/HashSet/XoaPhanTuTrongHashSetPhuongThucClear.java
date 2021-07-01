package HashSet;

import java.util.HashSet;

public class XoaPhanTuTrongHashSetPhuongThucClear {

	public static void main(String[] args) {
		float fNumber;
		HashSet<Float> hashSetFloat = new HashSet<>();
		
		//thêm các phần tử vào hashSetFloat
		hashSetFloat.add(7.17f);
		hashSetFloat.add(19.14f);
		hashSetFloat.add(1.11f);
		hashSetFloat.add(20.14f);
		
		//Xóa toàn bộ các phần tử trong hashSetFloat
		//Sử dụng phương thức clear()
		hashSetFloat.clear();
		
		//Sau khi xóa thì trong hashSetFloat
		//sẽ không có phần tử nào
		//phương thức isEmpty() dưới đây sẽ kiểm tra
		//nếu hashSetFloat không có giá trị
		//thì sẽ hiển thị thông báo "Không có phần tử"
		if(hashSetFloat.isEmpty()) {
			System.out.println("Không có phần tử");
		}

	}

}
