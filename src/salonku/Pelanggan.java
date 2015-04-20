/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salonku;
import java.util.Date;
/**
 * @author USER-PC
 */
public class Pelanggan {
    String nama;
    String address;
    Date tglBerkunjung;
    String treatment;
    String treatmenttype;
    private Double payment;
    private Double changes;
    String phonenumber;
    Boolean puasHasil;
    String testimoni;
    
    
   
 public String tellTreatment() {
 return getTreatment();
 
 }
 
  //this untuk variabel private

    /**
     * @return the treatment
     */
    public String getTreatment() {
        return treatment;
    }

    /**
     * @param treatment the treatment to set
     */
    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    /**
     * @return the treatmenttype
     */
    public String getTreatmenttype() {
        return treatmenttype;
    }

    /**
     * @param treatmenttype the treatmenttype to set
     */
    public void setTreatmenttype(String treatmenttype) {
        this.treatmenttype = treatmenttype;
    }

    /**
     * @return the payment
     */
    public Double getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(Double payment) {
        this.payment = payment;
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

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phonenumber
     */
    private String getPhonenumber() {
        return phonenumber;
    }

    /**
     * @param phonenumber the phonenumber to set
     */
    private void setPhonenumber(String phoneNumber) {
        phonenumber = phoneNumber;
    }
}
 
