/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Perro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    @OneToOne
    private Raza raza;
    @OneToOne
    private Tamanio tamanio;
    @OneToOne
    private Dueno dueno;
    @OneToMany
    private List<Vacuna> vacunacionList;
    private String fotoRuta;
    private String comentario;
    //para jpa, necesito constructor vacio y todos los stegest y getters de cada atributo

    public Perro() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    public List<Vacuna> getVacunacionList() {
        return vacunacionList;
    }

    public void setVacunacionList(List<Vacuna> vacunacionList) {
        this.vacunacionList = vacunacionList;
    }

    public String getFotoRuta() {
        return fotoRuta;
    }

    public void setFotoRuta(String fotoRuta) {
        this.fotoRuta = fotoRuta;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Dueno getDueno() {
        return dueno;
    }

    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }
    

    @Override
    public String toString() {
        return "Perro{" + "id=" + id + ", nombre=" + nombre + ", raza=" + raza + ", tamanio=" + tamanio + ", vacunacionList=" + vacunacionList + ", fotoRuta=" + fotoRuta + ", comentario=" + comentario + '}';
    }
    

}
