package repositories;

public class Usuarios {


    String email;
    String nombre;

    public Usuarios() {

    }


    public Usuarios(String email, String nombre){
        this.email=email;
        this.nombre=nombre;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "email='" + email + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
