package co.edu.uniquindio.poo;

public class Ninio {
    private String nombre;
    private int edad;
    private String documento;
    private String alergias;
    private String nombreAcudiente;
    private String contacto;



    public Ninio(String nombre, int edad, String documento, String alergias, String nombreAcudiente, String contacto){

        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
        this.alergias = alergias;
        this.nombreAcudiente = nombreAcudiente;
        this.contacto = contacto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDocumento() {
        return documento;
    }

    public String getAlergias() {
        return alergias;
    }

    public String getNombreAcudiente() {
        return nombreAcudiente;
    }

    public String getContacto() {
        return contacto;
    }

    public String toString(){
        return "Niño \n\nNombre :"+ nombre + "\n" + "Edad :"+ edad +
                "\n" + "Documento :"+ documento + "\n" + "Alergias :"+ alergias + "\n" +
                "Nombre acudiente :"+ nombreAcudiente + "\n" +"Contacto :"+ contacto + "\n" ;
    }

    public void mostrarDatos(){
        System.out.println(this.toString());

    }
}
