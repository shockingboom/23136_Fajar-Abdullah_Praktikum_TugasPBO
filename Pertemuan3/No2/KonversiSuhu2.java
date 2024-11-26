/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3.No2;

/**
 *
 * @author Fajar Abdullah
 */
public class KonversiSuhu2 extends KonversiSuhu{
    
    public void farhenheitToReamur(double farhenheit){
        double reamur = (farhenheit - 32) * 4/9;
        System.out.println(farhenheit + " F = " + reamur + " R");
    }
}
