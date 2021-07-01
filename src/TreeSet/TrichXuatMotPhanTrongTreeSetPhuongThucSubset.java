package TreeSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class TrichXuatMotPhanTrongTreeSetPhuongThucSubset {

	public static void main(String[] args) {
		TreeSet<Integer> treeSetInteger = new TreeSet<>();
		
		//Thêm các phần tử vào trong treeSetInteger
		treeSetInteger.add(2);
		treeSetInteger.add(1);
		treeSetInteger.add(4);
		treeSetInteger.add(3);
		treeSetInteger.add(6);
		treeSetInteger.add(5);
		treeSetInteger.add(8);
		treeSetInteger.add(7);
		treeSetInteger.add(0);
		treeSetInteger.add(9);
		
		System.out.println("Các phần tử có trong treeSetInteger");
		System.out.println(treeSetInteger);
		
		//khai báo 1 treeset có tên subset
		//có các phần tử được trích xuất
		//trong đoạn [3,10) của treeSetInteger
		SortedSet<Integer> subset = treeSetInteger.subSet(3, 7);
		System.out.println("Các phần tử có trong subset:");
		System.out.println(subset);
		
		//Nếu phần tử đầu và phần tử cuối bằng nhau
		//thì kết quả của phương thức subSet()
		//sẽ trả về subset không có phần tử nào
		subset = treeSetInteger.subSet(3, 3);
		System.out.println("Các phần tử có trong subset:");
		System.out.println(subset);

	}

}
