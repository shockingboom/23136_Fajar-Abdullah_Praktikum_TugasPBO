/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalNo2;

/**
 *
 * @author Fajar Abdullah
 */
public class Matematika implements InterfaceMatematika {
  
    @Override
    public void pertambahan(int a, int b){
        int jumlah = a + b;
        System.out.println(a + " + " + b + " = " + jumlah);
    }

    @Override
    public void pengurangan(int a, int b){
        int jumlah = a - b;
        System.out.println(a + " - " + b + " = " + jumlah);
    }

    @Override
    public void perkalian(int a, int b){
        int jumlah = a * b;
        System.out.println(a + " * " + b + " = " + jumlah);
    }

    @Override
    public void pembagian(int a, int b){
        int jumlah = a / b;
        System.out.println(a + " / " + b + " = " + jumlah);
    }
}
