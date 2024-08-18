/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.proyectoHotel.registros;

import ico.fes.proyectoHotel.habitaciones.Habitacion;

/**
 *
 * @author 2im3q
 */
public class Registro {
    private String cliente;
    private Habitacion habitacion;
    private Fecha fechaEntrada;
    private Hora horaEntrada;
    private Fecha fechaSalida;
    private Hora horaSalida;
    private int nochesEstadia;
    private boolean todosLosServicios;

    public Registro() {
    }

    public Registro(String cliente, Habitacion habitacion, Fecha fechaEntrada, Hora horaEntrada, Fecha fechaSalida, Hora horaSalida, int nochesEstadia, boolean todosLosServicios) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.horaEntrada = horaEntrada;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.nochesEstadia = nochesEstadia;
        this.todosLosServicios = todosLosServicios;
    }

        public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Fecha getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Fecha fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Hora getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Hora horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Fecha getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Fecha fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Hora getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Hora horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getNochesEstadia() {
        return nochesEstadia;
    }

    public void setNochesEstadia(int nochesEstadia) {
        this.nochesEstadia = nochesEstadia;
    }


    public void setTodosLosServicios(boolean todosLosServicios) {
        this.todosLosServicios = todosLosServicios;
    }
    
    @Override
    public String toString(){
        String res="Cliente: "+this.cliente;
        res=res+" Habitacion: "+this.habitacion.getNumero();
        res=res+" Fecha de entrada: "+this.fechaEntrada.toString();
        res=res+" Hora de entranda: "+this.horaEntrada.toString();
        res=res+" Fecha de entrada: "+this.fechaEntrada.toString();
        res=res+" Hora de entranda: "+this.horaEntrada.toString();
        res=res+" Nochesde estadia: "+this.nochesEstadia;
        res=res+" Contrata todos los servicios: "+this.todosLosServicios;
        return res;
    }
    
    public String fechasEstancia(){
        String fechasEstancia="       "+this.fechaEntrada;
        Fecha fechaAux=this.fechaEntrada;
        for (int i = 0; i < this.nochesEstadia; i++) {
            fechaAux.incrementarDia();
            fechasEstancia=fechasEstancia+"\n       "+fechaAux;
        }
        return fechasEstancia;
    }
    
    public float precioPorNoche(){
        float precioNoche=0;
        if(this.todosLosServicios==true){
            precioNoche=this.habitacion.getTipoHabitacion().getPrecioTodoIncluido();
        }else{
            precioNoche=this.habitacion.getTipoHabitacion().getPrecioSnServicios();
        }
        if (this.habitacion.getVista()=="Mar") {
            precioNoche=precioNoche+350;
        } else if (this.habitacion.getVista()=="Campo de golf"){
            precioNoche=precioNoche+200;
        }else if(this.habitacion.getVista()=="Sin vista"){
            precioNoche=precioNoche;
        }
        return precioNoche;
    }
    
    public String precioTotal(){
        String precioTotal;
        precioTotal=" El precio a pagar es: "+(this.precioPorNoche()*this.nochesEstadia)+"(no incluye spa, propinas, ni transporte)";
        return precioTotal;
    }



    


   
}
