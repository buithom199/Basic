package ArrayList;

import java.util.ArrayList;

public class SuDungPhuongThucAddallTrongArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList1 = new ArrayList<>();
		
		//thêm phần tử vào trong arrList1
		arrayList1.add(6);
		arrayList1.add(4);
		arrayList1.add(9);
		
		ArrayList<Integer> arrayList2 = new ArrayList<>();
		
		//thêm phần tử vào trong arrList2
		arrayList2.add(11);
		arrayList2.add(15);
		arrayList2.add(16);
		arrayList2.add(19);
		
		//thêm các phần tử của arrList1
		//Vào vị trí số 3 của arrList2
		arrayList2.addAll(3, arrayList1);
		
		System.out.println("Các phần tử có trong arrList2 là");
		for(int number: arrayList2) {
			System.out.println(number);
		}

	}

}
