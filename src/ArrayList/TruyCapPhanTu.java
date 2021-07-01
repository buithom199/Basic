package ArrayList;

import java.util.ArrayList;

public class TruyCapPhanTu {

	public static void main(String[] args) {
		ArrayList<Character> arrayList = new ArrayList<>();
		
		//Thêm phần tử vào trong arrListChar
		arrayList.add('1');
		arrayList.add('a');
		arrayList.add('b');
		
		//Truy cập phần tử có chỉ số trong arrListChhar
		//tương ứng với ký tự 'b'
		// vì arrListChar có kiểu là Character
		//nên các phần tử con của nó cũng có kiểu dữ liệu
		char ch = arrayList.get(2);
		System.out.print("hần tử có chỉ số 2 trong arrListChar là:" + ch);

	}

}
