/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.coraci.lessons;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author sommovir
 */
public class Liste {
    
    
    public static void main(String[] args) {
        
        //La LinkedList è una lista collegata, ottima per frequenti inserimenti
        //e cancellazioni
        List<String> parole  = new LinkedList<>();
        
        //L'ArrayList è invece ottima per le frequenti letture della lista
        List<String> parole2 = new ArrayList<>();
        
        //aggiungere elementi alla lista
        parole.add("Frutta"); 
        parole.add("Verdura");
        parole.add("Carne");
        parole.add("Pesce");
        
        //parole :   Frutta -> Verdura -> Carne -> Pesce
        //             0          1         2        3
        //for normale  1     +    2     +   3     +  4      =  10
        int size = parole.size();
        System.out.println("la lista contiene "+size+" elementi");
        
        for (int i = 0; i < parole.size(); i++) {
            System.out.println("Elemento: "+parole.get(i));
        }
        System.out.println("--------------------------------");
        
        for (String p : parole) {
            System.out.println("Elemento: "+p);
        }
        
        //come azzerare tutta una lista, cancellare tutti gli elementi
        parole2.clear();
        
        //come verificare che la lista sia vuota
        if(parole2.isEmpty()){
            System.out.println("si la lista parole2 è vuota");
        }
        
        //il metodo contains ritorna true se l'oggetto passato in argomento
        //appartiene alla lista. Se si usano classi customizzate, questo 
        //metodo funziona solo se è stato fatto l'override del metodo equals.
        if(parole2.contains("Ciao")){
            System.out.println("si la lista contiene 'Ciao'");
        }
        
        //rimuove l'elemento all'indice 1. 
        parole2.remove(1);
        
        //però se la classe che è tipo della lista, ha sovrascritto l'equals
        parole2.remove("Ciao"); //se 'Ciao' esiste nella lista, viene anche rimosso. 
        
        
    }
    
}
