/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salonku;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author USER-PC
 */
public class Salonku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    HairStylist hairstylist1=new HairStylist();//constructor digunakan pada saat new
    hairstylist1.nama=("Melissa Suhartati");
    hairstylist1.phoneNumber=("085793035859");
    hairstylist1.address=("Jl. Merdeka Barat no 58A, Jakarta");
    hairstylist1.setTreatment("Creambath");    
    
    
     try {
            hairstylist1.setTreatment("creambath");
            hairstylist1.setTreatment("creambath");

            hairstylist1.setTreatment("cat rambut");

        } catch (Exception e) {
            System.out.println("Terjadi Error: " + e.getMessage());
        }
    
    Pelanggan pelanggan1=new Pelanggan();
    pelanggan1.nama="Rere";
    pelanggan1.phonenumber="085235727276";
    pelanggan1.address="Jl. Perjuangan no.11, Jakarta";
    Calendar call=Calendar.getInstance();
    call.set (Calendar.YEAR, 2015);
    call.set(Calendar.MONTH, Calendar.APRIL);
    call.set(Calendar.DATE, 19);
    pelanggan1.setTreatment("creambath");
    pelanggan1.setTreatmentType("aroma stroberi");
    pelanggan1.givePayment(100000);
    pelanggan1.getChanges(30000);
    pelanggan1.puasHasil=true;
    pelanggan1.givetestimoni=true;
    
      
        
    Date waktu;
        Calendar cal= Calendar.getInstance();
        cal.set(Calendar.YEAR, 2015);
        cal.set(Calendar.MONTH, Calendar.APRIL);
        cal.set(Calendar.DATE, 18);
        waktu=cal.getTime();
    
//tellTreatment();
    while (pelanggan1.puasHasil){
        if(hairstylist1.isDone);
        Treatment treatment1=new Treatment();
        treatment1.pelanggan=pelanggan1;
        treatment1.hairstylist=hairstylist1;
               Calendar cal= Calendar.getInstance();
        cal.set(Calendar.YEAR, 2015);
        cal.set(Calendar.MONTH, Calendar.APRIL);
        cal.set(Calendar.DATE, 18);
        waktu=cal.getTime(); 
        Kasir pembayaran1=new Kasir();
            pembayaran1.treatment=treatment1;
            pembayaran1.bill=70000;
            pembayaran1.setBill();
            kasir1.giveChanges();
            if(pelanggan1.giveComment){
                
            }
            pelanggan1.komentar="Saya puas dengan hasilnya. Terima kasih."
        }}
   
   
    
    
   
    
    
}
    
        
        
        
        
    

