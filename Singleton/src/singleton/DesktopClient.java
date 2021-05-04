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
public class DesktopClient {
    //Hie eine Instanz von AccountManager erzeugen (auf die nicht von anderen Klassen zugegriffen werden kann)
    private final AccountManager dc_AccManager;
    
    public DesktopClient() {
        //Hier den AccountManager instanziieren
        dc_AccManager=null;
    }
    //Diese Methode soll einen dynamisch definierbaren Betrag auf das Konto überweisen 
    public void deposit(int amount){
        if (amount>0){
            //Hier die Transaktion durchführen
        }
    }

}
