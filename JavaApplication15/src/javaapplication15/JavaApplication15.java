package javaApplication15;

import java.util.Scanner;

public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner opc = new Scanner(System.in);

        String nombre,apellido,direccion,ciudad;
        int edad,telefono;

       
        System.out.print("digite su nombre");
        nombre = opc.nextLine();
        System.out.println("su nombre es:"+nombre);
        System.out.print("digite su apellido");
        apellido = opc.nextLine();
        System.out.println("su nombre es:"+apellido);
        System.out.print("digite su direccion");
        direccion = opc.nextLine();
        System.out.println("su nombre es:"+direccion);
       System.out.print("digite su ciudad");

        System.out.print("digite su edad");
        edad = opc.nextInt();
        System.out.println("su nombre es:"+edad);
        System.out.print("digite su telefono");
        telefono = opc.nextInt();
        System.out.println("su nombre es:"+telefono);
    }}