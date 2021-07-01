package If_Else;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GiaiPhuongTrinhBac1 {

	public static void main(String[] args) {
		int aNumber, bNumber;
		double nghiem;
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập vào số a:");
		aNumber = scanner.nextInt();
		System.out.println("Nhập vào số b:");
		bNumber = scanner.nextInt();
		
		if(aNumber == 0) {
			if (bNumber == 0) {
				System.out.println("Phương trình này có vô số nghiệm");
			}	else {
				System.out.println("Pương trình này có vô nghiệm");
			}
		}else {
				nghiem = (double)- bNumber /aNumber ;  //ép kiểu để cho ra kết quả chính xác
						System.out.println("Phương trình có nghiệm x =" + decimalFormat.format(nghiem) + ".");
			} 
				
			
			
		
	}

}
