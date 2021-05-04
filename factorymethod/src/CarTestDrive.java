
package factorymethodexample;

/**
 *
 * @author Fabian Ziegler
 * This class provides an environment where the Cars can be created and tested
 */
public class CarTestDrive {
    
    public static void main(String[] args) {
       
       // creating a new carFactory
       CarFactory carFactory = new CarFactory();
       
       // creating a FamilyCar and a SportsCar using the CarFactory object
       Car familyVan = carFactory.createCar("Family");
       Car niceFastCabrio = carFactory.createCar("Sport");
       
       // calling the drive() Method of tbe cars
       familyVan.drive();
       niceFastCabrio.drive();
       
        
    }
    
    
    /* Aufgabenbeschreibung: 
    x) Erstelle eine neue Klasse namens “PickupTruck”, die das Car-Interface implementiert 
    
    x) Überschreibe die drive()-Methode, sodass folgendes ausgegeben wird:
        „PickupTruck: driving on unsurfaced roads ..“ 
    
    x) Erstelle eine neue Klasse namens “CustomCarFactory“. 
        Diese Klasse soll eine Kind-Klasse der CarFactory sein. 
    
    x) Überschreibe die createCar()-Methode, sodass ein PickupTruck erstellt wird,
        wenn der Parameter carType der Zeichenkette „Pickup“ gleicht. 
    

     */
    
}
