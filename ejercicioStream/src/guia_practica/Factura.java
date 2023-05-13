/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_practica;

/**
 *
 * @author Carlo
 */
public class Factura {
    
    private String concepto;
    private int importe;

    public Factura() {
    }

    public Factura(String concepto, int importe) {
        this.concepto = concepto;
        this.importe = importe;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Factura{" + "concepto=" + concepto + ", importe=" + importe + '}';
    }
    
    
    
}
