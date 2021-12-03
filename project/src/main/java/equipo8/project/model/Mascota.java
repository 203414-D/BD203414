package equipo8.project.model;

import javax.persistence.*;


@Entity
@Table(name = "mascotas")
public class Mascota {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idmascota;

  @Column(name = "nombremascota")
  private String nombremascota;

  @Column(name = "tipomascota")
  private String tipomascota;

  @Column(name = "medicamentomas")
  private String medicamentomas;

  public Mascota(){

  }
  public Mascota(int idmascota, String nombremascota, String tipomascota, String medicamentomas){
    this.idmascota=idmascota;
    this.nombremascota=nombremascota;
    this.tipomascota=tipomascota;
    this.medicamentomas=medicamentomas;
  }

  public int getIdmascota() {
    return idmascota;
  }

  public void setIdmascota(int idmascota) {
    this.idmascota = idmascota;
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

  public String getMedicamentomas() {
    return medicamentomas;
  }

  public void setRazon(String medicamentomas) {
    this.medicamentomas = medicamentomas;
  }
}
