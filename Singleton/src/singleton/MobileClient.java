/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Fabian
 */
public class MobileClient {
    //Hie eine Instanz von AccountManager erzeugen (auf die nicht von anderen Klassen zugegriffen werden kann)
    private final AccountManager mc_AccManager;
    public MobileClient() {
        //Hier den AccountManager instanziieren
        mc_AccManager= null;
    }
    //Diese Methode soll einen dynamisch definierbaren Betrag von dem Konto abziehen
    public void payout(int amount){
        //Da es Eine Auszahlung ist soll der Betrag negativ sein
        if(amount >0){
            amount=-amount;
        }
         
        //Hier eien Transaktion ausführen
        
        
     }
    //Diese Methode soll den Kontostand anzeigen
    public double getBalance(){
        //Hier den Kontostand zurückliefern
        return 0;        
    }
}
