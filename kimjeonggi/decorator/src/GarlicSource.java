public class GarlicSource extends PizzaDecorator {

    public GarlicSource(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String doTopping() {
        return pizza.doTopping() + " with Garlic Source";
    }
}
