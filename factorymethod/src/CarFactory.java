
package factorymethodexample;

/**
 *
 * @author Fabian Ziegler
 */
public class CarFactory {
    
    //default implemention of the Factory Mehtod named "makeCar"
    //Extend class and override this method for customization
    public Car createCar(String carType){
        //if type is Family create a new Family Car
        if(carType.equalsIgnoreCase("Family")){
            return new FamilyCar();
            
        }
        // if type is Sport create a Sportscar
        if(carType.equalsIgnoreCase("Sport")){
            return new SportsCar();
        }
        
        
        //Return null if no car for specified type is avaiable
        return null; 
    }
    
    
    
}
