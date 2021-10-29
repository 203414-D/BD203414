package equipo8.project.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mascotas")
public class Mascota {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "nombre")
  private String nombre;

  @Column(name = "tipo")
  private String tipo;

  @Column(name = "fechaingreso")
  private Date fechaingreso;

  @Column(name = "razon")
  private String razon;

  public Mascota(){

  }
  public Mascota(int id, String nombre, String tipo, Date fechaingreso, String razon){
    this.id=id;
    this.nombre=nombre;
    this.tipo=tipo;
    this.fechaingreso=fechaingreso;
    this.razon=razon;
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

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public Date getFechaingreso() {
    return fechaingreso;
  }

  public void setFechaingreso(Date fechaingreso) {
    this.fechaingreso = fechaingreso;
  }

  public String getRazon() {
    return razon;
  }

  public void setRazon(String razon) {
    this.razon = razon;
  }
}