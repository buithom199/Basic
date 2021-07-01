package ChuoiString;

public class HamTaoMotChuoiConTuViTriIndexTrongChuoiCha {

	public static void main(String[] args) {
		// Cú pháp: 
		// - String chuoiCon = chuoiCha.substring(int beginIndex);
		// - String chuoiCha = chuoiCha.substring(int beginIndex, int endIndex);
		
		String chuoiCha = new String("Welcome to Freetuts.net");
		
		//Tạo một chuỗi con từ vị trí 11 trong chuỗi string1
		String chuoiCon1 = chuoiCha.substring(11);//freetuts.net
		System.out.println(chuoiCon1);
		
		//Tách một chuỗi con bắt du629 từ vị trí 11
		//Và kết thúc tại vị trí 19 trong chuỗi cha
		
		String chuoiCon2 = chuoiCha.substring(11, 19); //Freetuts
		System.out.print(chuoiCon2);

	}

}
