package TreeSet;

import java.util.TreeSet;

public class Vidu03 {
	public static void main(String[] args) {
	TreeSet<Integer> treeSetInteger = new TreeSet<>();
	
	treeSetInteger.add(10);
	treeSetInteger.add(9);
	treeSetInteger.add(20);
	treeSetInteger.add(22);
	treeSetInteger.add(11);
	treeSetInteger.add(27);
	treeSetInteger.add(30);
	
	//tìm phần tử nhỏ nhất trong treeSetInteger
	//sử dụng phương thức first()
	int min = treeSetInteger.first();
	System.out.println("Phần tử nhỏ nhất trong treeSetInteger là" + min);
	
	System.out.println("SỐ lượng các phần tử trong treeSetInteger trước khi xóa ="
			+ (treeSetInteger.size()));
	
	//Xóa phần tử đó ra khỏi treeSetInteger
	//Sử dụng phương thức remove()
	treeSetInteger.remove(min);
	
	System.out.println("Số lượng các phần tử trong treeSetInteger sau khi xóa = "
			+ (treeSetInteger.size()));
	System.out.println("Các phần tử còn lại trong treeSeInteger sau khi xóa là"
			+ treeSetInteger);
	}

}
