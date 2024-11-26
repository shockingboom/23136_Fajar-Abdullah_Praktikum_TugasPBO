/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan5.Soal3;
import java.util.Scanner;

/**
 *
 * @author Fajar Abdullah
 */
public class IndexMassaTubuh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("---------- PROGRAM UKUR IMT ----------");

        Scanner inp = new Scanner(System.in);

        System.out.print("Masukkan Tinggi Badan Anda (CM)  : ");
        float tb = inp.nextFloat();
        
        System.out.print("Masukkan Berat Badan Anda (KG)   : ");
        float bb = inp.nextFloat();

        float tbm = tb/100;
        float imt = bb / (tbm * tbm);
        String kriteria = "";

        if (imt <= 18.4){
            kriteria = "Berat Badan Kurang";
        }
        else if (imt >= 18.5 && imt <= 24.9){
            kriteria = "Berat Badan Ideal";
        }
        else if (imt >= 25 && imt <= 29.9){
            kriteria = "Berat Badan Lebih";
        }
        else if (imt >= 30 && imt <= 39.9){
            kriteria = "Berat Badan Gemuk";
        }
        else {
            kriteria = "Sangat Gemuk";
        }
        
        System.out.println("Kategori IMT anda adalah : " + imt + " dengan kriteria " + kriteria);
    }
    
}
