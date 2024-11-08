/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;
import javax.swing.Icon;

/**
 *
 * @author Alumno
 */
public class Zapato {
    
    String modelo,color,marca,tipoSuela,estilo,tipo,genero,valoracion,descripcion,temporada;
    float talla,precio;
    boolean oferta,hayEnStock;
    ArrayList<Icon> lista;
    int stock;
    
    public Zapato(){
        
    }

    public Zapato(String modelo, String color, String marca, String tipoSuela, String estilo, String tipo, String genero, String valoracion, String descripcion, String temporada, float talla, float precio, boolean oferta, boolean hayEnStock, ArrayList<Icon> lista) {
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
        this.tipoSuela = tipoSuela;
        this.estilo = estilo;
        this.tipo = tipo;
        this.genero = genero;
        this.valoracion = valoracion;
        this.descripcion = descripcion;
        this.temporada = temporada;
        this.talla = talla;
        this.precio = precio;
        this.oferta = oferta;
        this.hayEnStock = hayEnStock;
        this.lista = lista;
    }
    
    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoSuela() {
        return tipoSuela;
    }

    public void setTipoSuela(String tipoSuela) {
        this.tipoSuela = tipoSuela;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public float getTalla() {
        return talla;
    }

    public void setTalla(float talla) {
        this.talla = talla;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isOferta() {
        return oferta;
    }

    public void setOferta(boolean oferta) {
        this.oferta = oferta;
    }

    public boolean isHayEnStock() {
        return hayEnStock;
    }

    public void setHayEnStock(boolean hayEnStock) {
        this.hayEnStock = hayEnStock;
    }

    public ArrayList<Icon> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Icon> lista) {
        this.lista = lista;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void añadirImagen (Icon image) {
    	lista.add(image);
    }
    
}
