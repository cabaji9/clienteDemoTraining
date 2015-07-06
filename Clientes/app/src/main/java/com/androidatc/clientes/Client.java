package com.androidatc.clientes;

import java.util.List;

/**
 * Created by advance on 06/07/15.
 */
public class Client {


    private String nombre;
    private String id;
    private String tipo;
    private String edad;
    private String ingreso;
    private List<String> activosList;

    private List<String> pasivosList;

    public Client(String id, String nombre,String tipo, String edad, String ingreso, List<String> activosList,List<String> pasivosList){
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.ingreso = ingreso;
        this.activosList = activosList;
        this.pasivosList = pasivosList;


    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public List<String> getActivosList() {
        return activosList;
    }

    public void setActivosList(List<String> activosList) {
        this.activosList = activosList;
    }

    public List<String> getPasivosList() {
        return pasivosList;
    }

    public void setPasivosList(List<String> pasivosList) {
        this.pasivosList = pasivosList;
    }

    public String toString(){
        return getNombre();
    }
}
