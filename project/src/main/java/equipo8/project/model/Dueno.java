package equipo8.project.model;

import javax.persistence.*;

@Entity
@Table(name="duenos")
public class Dueno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

    @Column(name = "nombre")
    private String nombre;
    private int telefono;

    public Dueno(){

    }

    public Dueno(int id, String nombre, int telefono){
        this.id=id;
        this.nombre=nombre;
        this.telefono=telefono;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int gettelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}