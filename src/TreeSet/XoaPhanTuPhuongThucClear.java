package TreeSet;

import java.util.Scanner;
import java.util.TreeSet;

public class XoaPhanTuPhuongThucClear {

	public static void main(String[] args) {
		int number;
		TreeSet<Integer> treeSetInteger = new TreeSet<>();
		Scanner scanner = new Scanner(System.in);
		
		//Thêm các phần tử vào treeSetInter
		treeSetInteger.add(7);
		treeSetInteger.add(19);
		treeSetInteger.add(1);
		treeSetInteger.add(20);
		
		//Xóa toàn bộ các phần tử trong treeSetInteger
		//Sử dụng phương thức clear()
		treeSetInteger.clear();
		
		//sau khi xóa thì trong treeSetInteger
		//sẽ không có phần tử nào
		//phương thức isEmpty() dưới đây sẽ kiểm tra
		//nếu treeSetInteger không có giá trị
		//thì sẽ hiển thị thông báo "Không có phần tử"
		if(treeSetInteger.isEmpty()) {
			System.out.println("Không có phần tử");
		}


	}

}
