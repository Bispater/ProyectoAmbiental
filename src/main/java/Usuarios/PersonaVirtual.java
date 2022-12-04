package Usuarios;

public abstract class  PersonaVirtual { //Clase padre - superClase
    private String Nombre;

    private String Rut;

    public String getNombre() {
        return Nombre;
    }

    public String getRut() {
        return Rut;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setRut(String rut) {
        this.Rut = rut;
    }
}
