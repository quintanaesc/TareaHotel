/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.proyectoHotel.habitaciones;

/**
 *
 * @author 2im3q
 */
public class TipoHabitacion {
    private int numCama;
    private String tipoCama;
    private boolean miniBar;
    private boolean Bar;
    private boolean sala;
    private boolean recibidor;
    private boolean jacuzzi;
    private boolean alberca;
    private float precioSnServicios;
    private float precioTodoIncluido;

    public TipoHabitacion() {
    }

    public TipoHabitacion(int numCama, String tipoCama, boolean miniBar, boolean Bar, boolean sala, boolean recibidor, boolean jacuzzi, boolean alberca, float precioSnServicios, float precioTodoIncluido) {
        this.numCama = numCama;
        this.tipoCama = tipoCama;
        this.miniBar = miniBar;
        this.Bar = Bar;
        this.sala = sala;
        this.recibidor = recibidor;
        this.jacuzzi = jacuzzi;
        this.alberca = alberca;
        this.precioSnServicios = precioSnServicios;
        this.precioTodoIncluido = precioTodoIncluido;
    }

    


    public int getNumCama() {
        return numCama;
    }

    public void setNumCama(int numCama) {
        this.numCama = numCama;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    public boolean isMiniBar() {
        return miniBar;
    }

    public void setMiniBar(boolean miniBar) {
        this.miniBar = miniBar;
    }

    public boolean isBar() {
        return Bar;
    }

    public void setBar(boolean Bar) {
        this.Bar = Bar;
    }

    public boolean isSala() {
        return sala;
    }

    public void setSala(boolean sala) {
        this.sala = sala;
    }

    public boolean isRecibidor() {
        return recibidor;
    }

    public void setRecibidor(boolean recibidor) {
        this.recibidor = recibidor;
    }

    public boolean isJacuzzi() {
        return jacuzzi;
    }

    public void setJacuzzi(boolean jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    public boolean isAlberca() {
        return alberca;
    }

    public void setAlberca(boolean alberca) {
        this.alberca = alberca;
    }

    public float getPrecioSnServicios() {
        return precioSnServicios;
    }

    public void setPrecioSnServicios(float precioSnServicios) {
        this.precioSnServicios = precioSnServicios;
    }

    public float getPrecioTodoIncluido() {
        return precioTodoIncluido;
    }

    public void setPrecioTodoIncluido(float precioTodoIncluido) {
        this.precioTodoIncluido = precioTodoIncluido;
    }
    @Override
    public String toString(){
        String res="Nùmero de camas: "+this.numCama;
        res=res+" Tipo de camas: "+this.tipoCama;
        res=res+" Minibar: "+this.miniBar;
        res=res+" Bar: "+this.Bar;
        res=res+" Sala: "+this.sala;
        res=res+" Recibidor: "+this.recibidor;
        res=res+" Jacuzzi: "+this.jacuzzi;
        res=res+" Alberca: "+this.alberca;
        res=res+" Precio sin servicios: "+this.precioSnServicios;
        res=res+" Prescio todo Incluido: "+this.precioTodoIncluido;
        
        return res;
        
    }
}


