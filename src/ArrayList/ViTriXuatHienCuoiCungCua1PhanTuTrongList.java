package ArrayList;

import java.util.ArrayList;

public class ViTriXuatHienCuoiCungCua1PhanTuTrongList {

	public static void main(String[] args) {
		ArrayList<Character> arrayList = new ArrayList<>();
		arrayList.add('A');
		arrayList.add('B');
		arrayList.add('C');
		arrayList.add('D');
		arrayList.add('E');
		arrayList.add('F');
		
		//Tìm kiếm vị trí xuất hiện cuối cùng của phần tử 'C' trong arrListChar
		//sử dụng phương thức lastIndexOf()
		//trong arrListChar có 2 phần tử 'C'
		//nên kết quả của chương trình sẽ trả về chỉ số của phần tử 'C' cuối cùng là 6
		int position1 = arrayList.lastIndexOf('C');
		System.out.println("Vị trí xuất hiện cuối cùng của phần tử \'C\' trong arrListChar là" 
				+ position1);
		
		//Tìm kiếm vị trí xuất hiện cuối cùng của phần tử 'D' trong arrListChar
		//Sử dụng phương thức lastIndexOf()
		//trong arrayList có 2 phần tử 'D'
		//nên kết quả của chương trình sẽ trả về chỉ số của phần tử 'D' cuối cùng là 7
		int position2 = arrayList.lastIndexOf('D');
		System.out.println("Vị trí xuất hiện cuối cùng của phần tử \'D\' trong arrListChar là"
				+ position2);

	}

}
