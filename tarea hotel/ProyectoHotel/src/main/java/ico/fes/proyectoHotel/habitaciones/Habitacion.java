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
public class Habitacion {
    private int numero;
    private TipoHabitacion tipoHabitacion;
    private String vista;

    public Habitacion() {
    }

    public Habitacion(int numero, TipoHabitacion tipoHabitacion, String vista) {
        this.numero = numero;
        this.tipoHabitacion = tipoHabitacion;
        this.vista = vista;
    }

    public String getVista() {
        return vista;
    }

    public void setVista(String vista) {
        this.vista = vista;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
    
    
    public String tooString(){
        String res=" Numero: "+this.numero;
        res=res+" Tipo: "+getTipoHabitacion();
        res=res+" Vista: "+this.vista;
        
        return res;
    }
}
