/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.coraci.lessons;

/**
 *
 * @author sommovir
 */
public class Persona {

    //attributi tutti privati
    private String nome;
    private String cognome;
    private int anni;
    
    public final String INVALID = "NO VALUE"; //si usa mettere le costanti tutte maiuscole
    
    //METODO COSTRUTTORE
    // 0. è un metodo! 
    // 1. è pubblico ( nella maggior parte dei casi ) 
    // 2. NON ha tipo di ritorno (nemmeno void)
    // 3. ha per nome, il nome della classe (compresa la maiuscola)
    public Persona(){
        this.nome = INVALID;
        this.cognome = INVALID;
        this.anni = -1;
    }
    
//    //COSTRUTTORE CON ARGOMENTI
    public Persona(String nome, String cognome, int anni) {
        setNome(nome);
        setCognome(cognome);
        setAnni(anni);
    }

    //creare metodi getter & Setter
    //SETTERS:
    //sono i metodi che permettono di settare (scrivere) gli attributi 
    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            this.nome = "INVALID";
        } else {
            this.nome = nome;
        }
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setAnni(int anni) {
        this.anni = anni;
    }

    //GETTERS:
    //sono i metodi che restituiscono gli attributi privati
    //permettono di leggere i dati privati dall'esterno.
    // y = f(x)
    public int getAnni() {
        return this.anni;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    void saluta() {
        System.out.println("ciao a tutti belli e brutti");
    }
}
