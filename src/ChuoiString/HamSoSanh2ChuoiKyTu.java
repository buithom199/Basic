package ChuoiString;

public class HamSoSanh2ChuoiKyTu {

	public static void main(String[] args) {
		// Cú pháp: int result = string.compareTo(String string2);
		
		int result;
		String string1 = "Happy new year!";
		String string2 = "Happy new year!";
		
		result = string1.compareTo(string2);
		if(result ==0) {
			System.out.println("Chuỗi"+ string1 + "=" + string2);
		}else if(result < 0){
			System.out.println("Chuỗi" + string1 + "< " + string2);
		}else  {
			System.out.println("Chuỗi" + string1 + ">" + string2);
			
		}

	}

}
