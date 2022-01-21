/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.coraci.lessons;

/**
 *
 * @author Marica
 */
public class Computer {

    private String modelloTastiera;
    private String mouse;
    private int ram;

    public Computer() {
        this.modelloTastiera = "sconosciuto";
        this.mouse = "bho";
        this.ram = 2;
    }

    public Computer(String modelloTastiera, String mouse, int ram) {
        this.modelloTastiera = modelloTastiera;
        this.mouse = mouse;
        this.ram = ram;
    }

    //getter
    public String getModelloTastiera() {
        return this.modelloTastiera;
    }
//setter
    public void setModelloTastiera(String modelloTastiera){
        this.modelloTastiera=modelloTastiera;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    }
