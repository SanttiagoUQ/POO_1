package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese edad: ");
        int edad = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese el documento: ");
        String documento = sc.nextLine();

        System.out.println("Alergias: ");
        String alergias = sc.nextLine();

        System.out.println("Ingrese nombre del acudiente: ");
        String acudiente = sc.nextLine();

        System.out.println("Contacto: ");
        String contacto = sc.nextLine();

        Ninio ninio = new Ninio(nombre, edad, documento, alergias, acudiente, contacto);
        ninio.mostrarDatos();

    }
}