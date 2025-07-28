package Bloaters;
import java.util.Scanner;
public class LongMethod{
    public static void method(int anio){
        Integer anios = anio;
        Scanner sc = new Scanner(System.in);
        int dias = 365;
        String nombre;
        for(int i = 0; i < dias; i++){
            System.out.println("Estamos en el año " + anio + " en el dia i");
        }
        System.out.println("Cuantos años tienes ?\n");
        try {
            int edad = sc.nextInt();
        } catch(Exception e){
            System.out.println("error");
        }
        sc.close();
    }   
}