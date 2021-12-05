package AntonioMartinez.DuenoServicio.Model;

import javax.persistence.*;

@Entity
@Table(name = "duenos")
public class Dueno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idduenos;

    @Column(name = "nombreduenos")
    private String nombreduenos;
    @Column(name = "telefono")
    private String telefono;

    @Column(name = "direccion")
    private String direccion;


    public Dueno(){

    }

    public Dueno(int idduenos, String nombreduenos, String telefono, String direccion){
        this.idduenos=idduenos;
        this.nombreduenos=nombreduenos;
        this.telefono=telefono;
        this.direccion = direccion;
    }



    public int getIdduenos() {
        return idduenos;
    }

    public void setIdduenos(int idduenos) {
        this.idduenos = idduenos;
    }


    public String getNombreduenos() {
        return nombreduenos;
    }

    public void setNombreduenos(String nombreduenos) {
        this.nombreduenos = nombreduenos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



}