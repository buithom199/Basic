package TreeSet;

import java.util.TreeSet;

public class PhanTuNhoNhatLonNhatTrongSortedSet {

	public static void main(String[] args) {
		TreeSet<String> treeSetString = new TreeSet<>();
		
		//thêm các phần tử vào trong treeSetString
		treeSetString.add("JAVA");
		treeSetString.add("PHP");
		treeSetString.add("Spring");
		treeSetString.add("Struts");
		treeSetString.add("Python");
		treeSetString.add("HTLM");
		System.out.println("Các phần tử có trong treeSetString:");
		System.out.println(treeSetString);
		
		//tìm phần tử lớn nhất (phần tử cuối cùng)
		//và phần tử nhỏ nhất (phần tử đầu tiên) trong treeSetString
		String phanTuLonNhat = treeSetString.last();
		String phanTuNhoNhat = treeSetString.first();
		System.out.println("Phần tử lớn nhất và nhỏ nhất trong" + "treeSetString là" 
		+ phanTuLonNhat + "và" + phanTuNhoNhat);

	}

}
