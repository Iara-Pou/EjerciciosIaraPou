package eje8;

import java.util.Scanner;
public class Eje8 {

    public static void main(String[] args) {

	Scanner leo = new Scanner (System.in);
       
        System.out.println ("¿Cuántos usuarios quiere ingresar?");
        int a = leo.nextInt();
        
               String nombres [] = new String [a];
               int edad []= new int [a];
               String sexo [] = new String [a];

        System.out.println("Por favor, ingrese la siguiente información de cada usuario. ");
for (int i= 0; i< nombres.length; i++){
System.out.println("Usuario n° " + (i+1));

System.out.println(">Nombre: ");
nombres [i] = leo.next();
System.out.println(">Edad: ");
edad [i] = leo.nextInt();
leo.nextLine();
System.out.println(">Sexo: ");
sexo [i] = leo.nextLine();

}
        System.out.println("<USUARIOS REGISTRADOS>");
for(int b = 0; b< nombres.length; b++){
System.out.println(">USUARIO N° " + (b+1) + ":");
System.out.println("    >Nombre: " + nombres [b]);
System.out.println("    >Edad: " + edad [b]);
System.out.println("    >Sexo: " + sexo [b]);
System.out.println("------------------------------");
}


}
    
}
