/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.coraci.lessons;

/**
 *
 * @author sommovir
 */
public class Main {
    
    public static void main(String[] args) {

        System.out.println("Ciao Marica");
        
        Persona p = new Persona();
  
        p.setNome("Luca");   
        System.out.println("no");
        p.setCognome("Coraci");
        p.setAnni(84);
        
        //utilizzo del costruttore con argomenti
        
        Persona p2 = new Persona("Mario", "Mariolini", 22);
        
        System.out.println("Il mio nome è "+p.getNome());
        
        Computer c = new Computer();
        c.setModelloTastiera("logitech");
        System.out.println("il computer ha la tastiera: "+ c.getModelloTastiera());
    }
    
}
