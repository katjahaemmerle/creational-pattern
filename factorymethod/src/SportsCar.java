
package factorymethodexample;

/**
 *
 * @author Fabian Ziegler
 */
public class SportsCar implements Car{

    @Override
    public void drive() {
        System.out.println("Sportscar: driving fast");
    }
    
}
