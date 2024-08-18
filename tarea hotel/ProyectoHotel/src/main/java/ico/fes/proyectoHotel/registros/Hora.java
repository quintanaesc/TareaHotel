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
public class Hora {
    private int seg;
    private int min;
    private int hr;

    public Hora() {
    }
    
    

    public Hora(int seg, int min, int hr) {
        this.seg = seg;
        this.min = min;
        this.hr = hr;
    }

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
    
    @Override
   public String toString(){
       String res;
       res=""+this.hr;
       res=res+":"+this.min;
       res=res+":"+this.seg;
       return res;
   }
    
    
}
