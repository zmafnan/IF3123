/*
Nama  : Zikri M Afnan
NIM   : 3411191109
Kelas : DSE-C
*/
import java.util.Scanner;
import java.io.*;
 
public class JumlahKelipatan
{
    static int findSum(int n, int a, int b)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
 
            if (i % a == 0 || i % b == 0)
                sum += i;
 
        return sum;
    }
    public static void main(String[] args){
        int n,a,b;
		Scanner input = new Scanner(System.in);
		
			System.out.println("Masukan Batasan Nilai : ");
			n = input.nextInt();
			
			System.out.println("Masukan Nilai Kelipatan 1 : ");
			a = input.nextInt();
			
			System.out.println("Masukan Nilai Kelipatan 2 : ");
			b = input.nextInt();

        System.out.println("Jumlah Kelipatan nya adalah: " +findSum(n, a, b));
    }
}
