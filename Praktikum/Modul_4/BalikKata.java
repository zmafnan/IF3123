/*
Nama  : Zikri M Afnan
NIM   : 3411191109
Kelas : DSE-C
*/
import java.lang.*;
import java.io.*;
import java.util.*;
 
public class BalikKata {
    public static void main(String[] args) {
		Scanner input= new Scanner(System.in); 
		System.out.print("Masuk Kata: ");
		String str= input.nextLine();
        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        System.out.println(sbr);
    }
}