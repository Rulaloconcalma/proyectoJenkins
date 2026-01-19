/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.projectojenkins;

/**
 *
 * @author pacuc
 */
public class ProjectoJenkins {

    public static boolean dia_laboral(String dia) {
        switch (dia) {
            case "Lunes":
                return true;
            case "Martes":
                return true;
            case "Miercoles":
                return true;
            case "Jueves":
                return true;
            case "Viernes":
                return true;
            case "Sabado":
                return false;
            case "Domingo":
                return false;
            default:
                return false;
        }
    }
    

    public static void main(String[] args) {
        System.out.println("Hello World!");
        boolean prueba = dia_laboral("Lunes");
        System.out.println(prueba);
    }
}
