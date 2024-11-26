/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3.No2;

/**
 *
 * @author Fajar Abdullah
 */
public class KonversiSuhu {
     public void celciusToFahrenheit(double celcius){
        double farhenheit = (celcius * 9/5) + 32;
        System.out.println(celcius + " C = " + farhenheit + " F");
    }

    public void celciusToReamur(double celcius){
        double reamur = (celcius * 4/5);
        System.out.println(celcius + " C = " + reamur + " R");
    }
    
}
