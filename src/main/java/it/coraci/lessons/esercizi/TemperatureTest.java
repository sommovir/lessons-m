/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.coraci.lessons.esercizi;

/**
 *
 * @author sommovir
 */
public class TemperatureTest {
    
    //creare un metodo che ci dica se l'array contiene temperature inferiori allo 0. 
    
    public static boolean containsNegativeTemps(int [] a){
        for (int i = 0; i < a.length; i++) {
            if(a[i] < 0){
                return true;
            }
        }
        return false;
    }
    
    
    public static void main(String[] args) {
        
        int [] temps = new int[]{10,15,34,34,87,22,11,18,25,15,-1,22};
        
        
        
        
    }
    
}
