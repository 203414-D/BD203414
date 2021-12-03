package AntonioMartinez.DuenoServicio.Model;

import javax.persistence.*;

@Entity
@Table(name = "duenos")
public class Dueno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idduenos;

    @Column(name = "nombreduenos")
    private String nommbreduenos;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "idmascota")
    private int idmascota;

    public Dueno(){

    }

    public Dueno(int idduenos, String nombreduenos, String telefono, int idmascota){
        this.idduenos=idduenos;
        this.nommbreduenos=nombreduenos;
        this.telefono=telefono;
        this.idmascota=idmascota;
    }


    public int getIdDueno() {
        return idduenos;
    }

    public void setIdDueno(int iddueno) {
        this.idduenos = idduenos;
    }

    public String getNommbreDueno() {
        return nommbreduenos;
    }

    public void setNommbreDueno(String nommbredueno) {
        this.nommbreduenos = nommbredueno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setIdmascotas(int idmascotas) {
        this.idmascota = idmascotas;
    }

    public int getIdmascotas() {
        return idmascota;
    }

}