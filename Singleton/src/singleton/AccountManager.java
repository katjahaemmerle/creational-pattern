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
    
    //verhinderte Instanziierung von au�en.
    private AccountManager() {
    }
    //solange nicht benutzt, wird das Singleton nicht instanziiert.
    private static AccountManager accManager;

    /**
     * Instanziierung bei erstmaligem Aufruf.
     * In dieser Methode pr�fen ob bereits eine Instanz existiert. Wenn nicht 
     * soll eine erstellt werden.
     * @return Singleton Instanz
     */
    public static AccountManager getInstance() {
        //Hier den Account Manager �ber Lazy Load instanziieren
        
        //Das Return Statement muss ebenfalls ge�ndert werden
        return null;
    }


    //Anstatt �ffentlicher, statischer Variablen haben wir private Instanzvariablen
    private int int_credit =1000;
    
    //Der Kontostand soll um einen Betrag erh�ht/reduziert werden.
    public void transaction(int int_amount) {
        int_credit = int_credit+int_amount;      
    }
    //Diese Methode gibt den Kontostand zur�ckg
    public int getBalance(){
        return int_credit;
    }
}