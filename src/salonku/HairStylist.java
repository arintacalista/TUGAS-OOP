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
import java.util.Date;

public class HairStylist {
    String nama;
    String address;
    String phoneNumber;
    Boolean isDone;
    String treatment;
   
    String treatmenttype;
    
//this untuk variabel privat
void isDone (Boolean isDone){
    this.isDone=isDone;}
Boolean treatmentEnd(){
    return isDone;
}

private void setNama(String nama){
    this.nama=nama;
}

private String getNama(){
    return nama;
}

void setPhonenumber(String phonenumber){
    phoneNumber=phonenumber;
}

private String getPhoneNumber(){
    return phoneNumber;
}

String askTreatmentType(){
    return getTreatmenttype();
 }
 
 String getTreatment(){
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

    
    private String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phoneNumber
     */
    }

