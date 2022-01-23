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
    public static boolean containsNegativeTemps(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                return true;
            }
        }
        return false;
    }
    //creare un metodo che restituisce il numero di temperature superiori a x ,
    //dove x è passato in argomento

    public static int countTemperatures(int[] t, int x) {
        int c = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] > x) {
                c++;
            }

        }
        return c;
    }

    //creare un metodo che restituisca la temperatura massima dell'array
    public static int maxTemperature (int[]t){
        int max = t[0];
        for (int i = 1; i< t.length; i++){
            if (t[i] > max){
                max=t[i];
            }
                   
        }
        return max;
    }
    
    public static void main(String[] args) {

        int[] temps = new int[]{10, 15, 34, 34, 87, 22, 11, 18, 25, 15, -1, 22};

        boolean result = containsNegativeTemps(temps);
        int result2 = countTemperatures(temps, 25);
        int max = maxTemperature(temps);
        System.out.println("l'array contiene un numero di valori superiore a 25 pari a:" + result2);
        if (result == true) {
            System.out.println("l'array contiene numeri negativi");
        }
        else {
            System.out.println("l'array non contiene numeri negativi");
            
        }
        System.out.println("la massima temperatura è:"+max);
    }

}
