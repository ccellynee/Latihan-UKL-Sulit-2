
import java.util.Scanner;

public class sulit2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("----- Penjumlahan Dua Matriks -----");

        System.out.println("Masukkan jumlah baris: ");
        int baris = input.nextInt();
        System.out.println("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();

        int [][] matriksA =  new int [baris][kolom];
        int [][] matriksB = new int [baris][kolom];
        int [][] hasil = new int [baris][kolom]; 

        System.out.println("Masukkan elemen matriks A: ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j  < kolom; j++){
            System.out.print("A[" + i + "][" + j + "] = ");
            matriksA[i][j] = input.nextInt();
            } 
        }

        System.out.println("Masukkan elemen matriks B: ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j  < kolom; j++){
                System.out.print("B[" + i + "][" + j + "] = ");
                matriksB[i][j] = input.nextInt();
            }
        }    
        
         for (int i = 0; i < baris; i++) {
            for (int j = 0; j  < kolom; j++){
                hasil[i][j] = matriksA[i][j] + matriksB [i][j];
            }
        }
        
        System.out.println("Hasil penjumlahan matriks A + B = ");
         for (int i = 0; i < baris; i++) {
            for (int j = 0; j  < kolom; j++){
                System.out.print(hasil[i][j]+ "\t");
            }
            System.out.println();
        }        

    }
}
