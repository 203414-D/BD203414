package equipo8.project.model;

import javax.persistence.*;

@Entity
@Table(name="Medicamentos")
public class Medicamentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column(name = "nombre")
    private String nombre;

    public Medicamentos(){

    }

    public Medicamentos(int codigo, String nombre){
        this.codigo=codigo;
        this.nombre=nombre;
    }


    public int getcodigo() {
        return codigo;
    }

    public void setcodigo(int id) {
        this.codigo = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}