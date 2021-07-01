package XuLySoNgauNhien;

import java.util.Random;
import java.util.Scanner;

public class ChuongTrinhGamDoanSo {

	public static void main(String[] args) {
		int score = 5 ;//điểm khởi tạo = 5;
		int soCuaMay, soNguoiChoiDoan;
		String ketQuaString =" ";
		Scanner scanner = new Scanner(System.in);
		
		//Nếu bạn để điều kiện là true
		//thì vòng lặp while sẽ chạy đến khi 
		// biểu thức if có từ khóa break được thực thi
		while (true){
			Random rdRandom = new Random();
			//Số máy ra được randome từ 1 đến 5
			soCuaMay = 1 + rdRandom.nextInt(5);
			
			System.out.println("Mời bạn đoán số");
			soNguoiChoiDoan = scanner.nextInt();
			
			if(soNguoiChoiDoan!= soCuaMay) {
				ketQuaString = "=> Bạn đoán sai!";
				System.out.println(ketQuaString);
				score ++;
			}
			if(score == 0) {
				System.out.println("Game Over!");
				break;
			}
			if(score==10) {
				System.out.println("Congratulations! You win!");
				break;
			}
			
		}

	}

}
