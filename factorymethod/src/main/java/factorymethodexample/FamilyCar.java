
package factorymethodexample;

/**
 *
 * @author Fabian Ziegler
 */
public class FamilyCar implements Car{

    @Override
    public void drive() {
        System.out.println("Family Car: driving slowly "
                + "with plenty of room for the whole family...");
    }
    
}
