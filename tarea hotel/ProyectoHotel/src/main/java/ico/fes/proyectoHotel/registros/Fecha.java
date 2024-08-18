/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.proyectoHotel.registros;

/**
 *
 * @author 2im3q
 */
public class Fecha {
    int dia;
    int mes;
    int año;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    @Override
    public String toString(){
        String res=" Dìa: "+this.dia;
        res=res+" Mes: "+this.nombreMes();
        res=res+" Año "+this.año;
        
        return res;
    }
    public String nombreMes(){
        String nombreMes;
        nombreMes="";
        switch(this.mes){
            case 1:
                nombreMes="Enero";
                break;
            case 2:
                nombreMes="Febrero";
                break;          
            case 3:
                nombreMes="Marzo";
                break;
            case 4:
                nombreMes="Abril";
                break;
            case 5:
                nombreMes="Mayo";
                break;
            case 6:
                nombreMes="Junio";
                break;  
            case 7:
                nombreMes="Julio";
                break;
            case 8:
                nombreMes="Agosto";
                break;          
            case 9:
                nombreMes="Septiembre";
                break;
            case 10:
                nombreMes="Octubre";
                break;
             case 11:
                nombreMes="Nobiembre";
                break;
            case 12:
                nombreMes="Diciembre";
                break;
        }
        return nombreMes;
    }
    
    public void incrementarDia(){
        int max=30;
        switch(this.mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                max=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                max=30;
                break;
            case 2:
                if(this.año<4){
                    if((this.año%4)==0){
                        max=29;
                    }
                }else{
                    max=28;
                }
                break;
        }
        
        if(this.dia<max){
            this.dia++;
        }else{
            this.dia=1;
            this.incrementarMes();
            
        }
    }
    
    public void incrementarMes(){
        if(this.mes<12){
            this.mes++;
        }else{
            this.mes=1;
        }
        
    }
    
    public void incrementarAño(){
        this.año++;
    }
}
