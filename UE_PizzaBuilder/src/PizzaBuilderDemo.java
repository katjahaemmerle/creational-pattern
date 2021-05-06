public class PizzaBuilderDemo {
    public static void main(String[] args) {
        Pizza pizza;
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        //Pizza bestellen - Waiter braucht Information welche Pizza gebaut werden soll

        //Waiter kann Pizza erstellen

        //Pizza-Objekt initialisieren

        
        System.out.println(pizza.getDough() + " " + pizza.getSauce() + " " + pizza.getTopping());
    }
}