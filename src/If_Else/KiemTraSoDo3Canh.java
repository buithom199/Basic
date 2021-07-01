package If_Else;

import java.util.Scanner;

public class KiemTraSoDo3Canh {

	public static void main(String[] args) {
		float soDoDoan1, soDoDoan2, soDoDoan3, chuVi,dienTich;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số đo đoạn thẳng thứ nhất");
		soDoDoan1 = scanner.nextFloat();
		System.out.println("Nhập số đo đoạn thẳng thứ hai");
		soDoDoan2 = scanner.nextFloat();
		System.out.println("Nhập số đo đoạn thẳng thứ ba");
		soDoDoan3 = scanner.nextFloat();
		
		//Kiểm tra số đo 3 doạn thẳng vừa rồi có tạo thành 1 tam giác hay không?
		//Nếu có thì tính chu vi của tam giác đó
		//Nếu không thì hiển thị thông báo "Không tồn tại tam giác"
		
		if((soDoDoan1 + soDoDoan2 > soDoDoan3) && (soDoDoan1 + soDoDoan3 > soDoDoan2)&&
				(soDoDoan2 + soDoDoan3 > soDoDoan1)) {
			//Thỏa mãn điều kiện tạo thành một tam giác
			//Tính chu vi của tam giác bằng tổng số đo 3 cạnh
			chuVi = soDoDoan1 + soDoDoan2 + soDoDoan3;
			System.out.println("Chu vi của tam giác bằng = " +chuVi);
		}else {
			System.out.println("Không tồn tại tam giác");
		}

	}

}
