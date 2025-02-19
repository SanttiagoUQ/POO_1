package co.edu.uniquindio.poo;

import java.util.Scanner;

class Estudiante {
    private String id;
    private String nombres;
    private String apellidos;
    private String correo;
    private String telefono;
    private int edad;

    public Estudiante(String id, String nombres, String apellidos, String correo, String telefono, int edad) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("\nInformación del Estudiante:");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombres + " " + apellidos);
        System.out.println("Correo: " + correo);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Edad: " + edad);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese ID: ");
        String id = scanner.nextLine();
        System.out.print("Ingrese nombres: ");
        String nombres = scanner.nextLine();
        System.out.print("Ingrese apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.print("Ingrese correo: ");
        String correo = scanner.nextLine();
        System.out.print("Ingrese teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();

        Estudiante estudiante = new Estudiante(id, nombres, apellidos, correo, telefono, edad);
        estudiante.mostrarInformacion();
        Estudiante estudiante2 = new Estudiante(id, nombres, apellidos, correo, telefono, edad);
        estudiante2.mostrarInformacion();


    }
}
