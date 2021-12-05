package MauricioDominguez.MedicamentoServicio.Model;

import javax.persistence.*;

@Entity

public class Mascota {


    @Id

    private int idmascotas;

    @Column(name = "nombremascota")
    private String nombremascota;

    @Column(name = "tipomascota")
    private String tipomascota;

    @Column(name = "idmedicamento")
    private int idmedicamento;

    @Column(name="iddueno")
    private int iddueno;

    public Mascota(){

    }
    public Mascota(int idmascotas, String nombremascota, String tipomascota, int idmedicamento, int iddueno){
        this.idmascotas=idmascotas;
        this.nombremascota=nombremascota;
        this.tipomascota=tipomascota;
        this.idmedicamento=idmedicamento;
        this.iddueno=iddueno;
    }

    public void setIdmascotas(int idmascotas) {
        this.idmascotas = idmascotas;
    }

    public int getIdmascotas() {
        return idmascotas;
    }

    public String getNombremascota() {
        return nombremascota;
    }

    public void setNombremascota(String nombremascota) {
        this.nombremascota = nombremascota;
    }

    public String getTipomascota() {
        return tipomascota;
    }

    public void setTipomascota(String tipomascota) {
        this.tipomascota = tipomascota;
    }

    public int getIdmedicamento() {
        return idmedicamento;
    }

    public void setIdmedicamento(int idmedicamento) {
        this.idmedicamento = idmedicamento;
    }

    public void setIddueno(int iddueno) {
        this.iddueno = iddueno;
    }

    public int getIddueno() {
        return iddueno;
    }


}