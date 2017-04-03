package paska;

import java.util.List;

public class Profesor extends Persona{


    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    private String nombre; 
    private int edad;
    private List<Prestamo> prestamos;

//    public Profesor(String str) {
//        super(numeroDeTelefono);
//    }

    public Profesor(String nombre, int edad, List<Prestamo> prestamos, String numeroDeTelefono) {
        super(numeroDeTelefono);
        this.nombre = nombre;
        this.edad = edad;
        this.prestamos = prestamos;
    }
    

    public void printTodaLaInformacion() {
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("Teléfono: "+numeroDeTelefono);
    }
    
    public void printInformacionPersonal(){
        printTodaLaInformacion();  
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    

}