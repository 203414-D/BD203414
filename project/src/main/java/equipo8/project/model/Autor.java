package equipo8.project.model;

import javax.persistence.*;

@Entity
@Table(name="autores")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

    @Column(name = "nombre")
    private String nombre;

    public Autor(){

    }

    public Autor(int id, String nombre){
        this.id=id;
        this.nombre=nombre;
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
}