abstract class PizzaBuilder {
    Pizza pizza;

    //createNewPizzaProduct


    public Pizza getPizza() {
        return pizza;
    }

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}
