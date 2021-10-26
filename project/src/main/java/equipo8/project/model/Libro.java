package equipo8.project.model;

import javax.persistence.*;

@Entity
@Table(name = "libros")
public class Libro {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "titulo")
  private String titulo;

  @Column(name = "idautor")
  private int idautor;

  @Column(name = "ideditorial")
  private  int ideditorial;

  @Column(name = "precio")
  private double precio;

  public Libro(){

  }
  public Libro(int id, String titulo,int idautor,int ideditorial,double precio){
    this.id=id;
    this.titulo=titulo;
    this.idautor=idautor;
    this.ideditorial=ideditorial;
    this.precio=precio;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getIdautor() {
    return idautor;
  }

  public void setIdautor(int idautor) {
    this.idautor = idautor;
  }

  public int getIdeditorial() {
    return ideditorial;
  }

  public void setIdeditorial(int ideditorial) {
    this.ideditorial = ideditorial;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }
}
