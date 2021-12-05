package MauricioDominguez.MedicamentoServicio.Model;

import javax.persistence.*;

@Entity
@Table(name="medicamentos")
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "nombre")
    private String nombre;

    public Medicamento(){

    }

    public Medicamento(int id, String codigo, String nombre){
        this.id=id;
        this.codigo=codigo;
        this.nombre=nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}