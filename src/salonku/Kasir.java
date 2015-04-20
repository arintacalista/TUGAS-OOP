/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salonku;

/**
 *
 * @author USER-PC
 */
public class Kasir {
    Double bill;
    Treatment treatment;
    private Double changes;
    String jnsbayaran;

    

    /**
     * @return the bill
     */
    private Double getBill() {
        return bill;
    }

    /**
     * @param bill the bill to set
     */
    void setBill(Double Bill) {
        bill = Bill;
    }

    /**
     * @return the changes
     */
    public Double getChanges() {
        return changes;
    }

    /**
     * @param changes the changes to set
     */
    public void setChanges(Double changes) {
        this.changes = changes;
    }
    
    String jnsbayaran(int jns){
        return jnsbayaran;
    }
    
}
