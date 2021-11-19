/*
Nama  : Zikri M Afnan
NIM   : 3411191109
Kelas : DSE-C
*/
import java.util.Scanner;
	public class obat {
		public static void main (String args []){
			Scanner input = new Scanner(System.in);
			int umur,bb;
			String jk;

			System.out.println("Masukan Umur : ");
			umur = input.nextInt();
			
			System.out.println("Masukan Berat Badan : ");
			bb = input.nextInt();
			
			System.out.println("Masuk Jenis Kelamin L/P : ");
			jk = input.next();
			
				//1
				if(jk.equals("L") && umur > 21 && bb > 150){
					System.out.println("Obat 1");
				//2
				}else if(jk.equals("L") && umur > 21 && bb < 150){
					System.out.println("Obat 2");
				//3
				}else if(jk.equals("P") && umur > 21 && bb > 150 ){
					System.out.println("Obat 3");
				//4
				}else if(jk.equals("P") && umur > 21 && bb < 150){
					System.out.println("Obat Tidak Tersedia");
				//5
				}else if(jk.equals("L") && umur < 21 && bb > 150){
					System.out.println("Obat 1 dan 2");
				//6
				}else if(jk.equals("L") && umur < 21 && bb < 150){
					System.out.println("Obat 3");
				//7
				}else if(jk.equals("P") && umur < 21 && bb > 150){
					System.out.println("Obat Tidak Tersedia");
				//8
				}else if(jk.equals("P") && umur < 21 && bb < 150){
					System.out.println("Obat 1 dan 3");
				}
		}
	}
