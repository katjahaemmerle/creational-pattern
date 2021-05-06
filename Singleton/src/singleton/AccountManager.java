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
class AccountManager {
    
    //verhinderte Instanziierung von außen.
    private AccountManager() {
    }
    //solange nicht benutzt, wird das Singleton nicht instanziiert.
    private static AccountManager accManager;

    /**
     * Instanziierung bei erstmaligem Aufruf.
     * In dieser Methode prüfen ob bereits eine Instanz existiert. Wenn nicht 
     * soll eine erstellt werden.
     * @return Singleton Instanz
     */
    public static AccountManager getInstance() {
        //Hier den Account Manager über Lazy Load instanziieren
        
        //Das Return Statement muss ebenfalls geändert werden
        return null;
    }


    //Anstatt öffentlicher, statischer Variablen haben wir private Instanzvariablen
    private int int_credit =1000;
    
    //Der Kontostand soll um einen Betrag erhöht/reduziert werden.
    public void transaction(int int_amount) {
        int_credit = int_credit+int_amount;      
    }
    //Diese Methode gibt den Kontostand zurückg
    public int getBalance(){
        return int_credit;
    }
}