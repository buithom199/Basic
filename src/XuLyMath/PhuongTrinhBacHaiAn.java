package XuLyMath;

import java.util.Scanner;

public class PhuongTrinhBacHaiAn {

	public static void main(String[] args) {
		double a, b, c, x1, x2, delta;
		String ketQuaString = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Giai phương trình ax^2 + bx + c = 0");
		do {
			System.out.println("Nhập a (a#0):");
			a = scanner.nextDouble();
		}while(a==0);
		System.out.println("Nhập b:");
		b= scanner.nextDouble();
		System.out.println("Nhập c:");
		c= scanner.nextDouble();
		
		//tính delta = b*b4*a*c
		delta = Math.pow(b, 2) - 4*a*c;
		
		//kiểm tra nếu delta < 0 thì phương trình vô nghiệm
		//delta =0 thì phương trình có nghiệm kép
		//delta >0 thì phương trình có 2 nghiệm phân biệt
		if(delta <0) {
			ketQuaString ="Phương trình vô nghiệm";
		}
		else if (delta == 0){
			x1 = x2 = -b/(2*a);
		}else {
			x1 = (-b + Math.sqrt(delta))/(2*a);
			x2 = (-b - Math.sqrt(delta))/(2*a);
			ketQuaString = "Phương trình có 2 nghiệm x1= " + x1 + 
					"và x2 =" + x2;
		}
		System.out.println(ketQuaString);
			
		}

	}


