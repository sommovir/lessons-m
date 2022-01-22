/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.coraci.lessons;

/**
 *
 * @author sommovir
 */
public class ArrayTest {
    
    
    public static float avg(int array[]){
        //array = {4,2,8,1}  -> array.lenght = 4
        //         0 1 2 3
        //inizio sum = 0
        // ciclo i = 0: 
        //  sum = 0 + array[0]  -> sum = 0 + 4 -> sum = 4;
        // ciclo i = 1:
        //  sum = 4 + array[1]  -> sum = 4 + 2 -> sum = 6;
        //..
        //ciclo i = 3:
        //  sum = 14
        // sum -> 15
        
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("finito e la somma è "+sum);
        
        //float media = sum/array.length;
        
        return sum/array.length;
    }
    
    
    
    public static void main(String[] args) {
        System.out.println("array test");
        //abbiamo dichiarato un array di nome 'temperature' di tipo int, e 
        //lunghezza 10. 
        //1. dichiarazione semplice senza nessun valore dentro. 
        //   in questo caso viene inizializzato con i valori di default del tipo
        //   con il quale l'array è stato dichiarato, nel nostro caso 0, perché
        //   è un array di int. 
        int [] temperature = new int[10]; 
        
        //2. dichiarazione con aggiunta immediata di valori
        //   non va specificata la lunghezza dell'array, perché viene inferita
        //   dal numero degli elementi tra le parentesi graffe. 
        int [] temperature2 = new int[]{2,7,3,4,5,6,7,8,9,1123,11};
                                    //  0 1 2 3 4 5 6 7 8 9
        //3. dichiarazione con aggiunta di valori compatta
        int [] temperature3 = {1,2,3,4};
        
        temperature2[4] = 32;
        
        System.out.println("in posizione 3 abbiamo il valore: "+temperature2[3]);
        System.out.println(temperature2[9]);
        System.out.println("--------------------------");
      
        //CICLO FOR 
        //for(A;B;C)
        //A: qui si dichiarano e si inizializzano le variabili di scorrimento del ciclo for
        //B: condizione di continuazione del ciclo
        //C: operazioni da fare ad ogni ciclo
        
        for(int i=0;i<temperature2.length;i++){
            
            System.out.println("array["+i+"] = "+temperature2[i]);
        }
  
        
        //CICLO FOR-EACH
        // for(A B : C)
        // C: la collezione da ciclare (array, liste, set) 
        // A: il tipo di dato memorizzato nella collezione
        // B: una variabile di scorrimento che rappresenta il dato in posizione i-esima nella collezione
        //    il for-each scorre automaticamente la collezione da cima a fondo, e ad ogni ciclo
        //    la componente B rappresenta il dato che stiamo scorrendo. 
        
        System.out.println("----------- FOR EACH -------------");
        
        for (int temperatura : temperature2) {
            System.out.println(temperatura);
        }
        
        
        float media = avg(temperature2);
        System.out.println("la media delle temperature è: "+media);
        
        for (int i = 0; i < temperature.length; i++) {
            
        }
        
        
    }
    
}
