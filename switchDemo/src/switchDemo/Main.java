package switchDemo;

public class Main {

	public static void main(String[] args) {
		
		char grade = 'P';
		
		switch(grade) {
		  case 'A': 
			  System.out.println("Mükemmel : Geçtiniz");
			  break;
		  case 'B' :
		  case 'C' :
			  System.out.println("Ýyi : Geçtiniz");
			  break;
		  case 'D':
			  System.out.println("Fena deðil : Geçtiniz");
		  case 'F':
			  System.out.println("Maalesef kaldýnýz");
			  break;
		  default:
				  System.out.println("Geçersiz not girdiniz");
			  
		  
		}

	}

}
