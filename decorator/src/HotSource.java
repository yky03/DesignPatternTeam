public class HotSource extends PizzaDecorator {

    public HotSource(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String doTopping() {
        return pizza.doTopping() + " with Hot Source";
    }
}
