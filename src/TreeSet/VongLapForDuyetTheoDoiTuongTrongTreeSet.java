package TreeSet;

import java.util.TreeSet;

public class VongLapForDuyetTheoDoiTuongTrongTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> treeSetInteger = new TreeSet<>();
		
		treeSetInteger.add(5);
		treeSetInteger.add(9);
		treeSetInteger.add(4);
		treeSetInteger.add(2);
		
		//Hiển thị các phần tử có trong treeSetInteger
		//Bằng các sử dụng vòng lặp for duyệt theo đối tượng
		//trong đó kiểu dữ liệu của của biến number
		//phải trùng với kiểu dữ liệu của treeSetInteger
		System.out.println("Các phần tử của treeSetInteger là");
		for(int number: treeSetInteger) {
			System.out.print(number + "\t");
		}

	}

}
