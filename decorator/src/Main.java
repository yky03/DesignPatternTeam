public class Main {

    public static void main(String[] args) {

        /**
         *  Decorator Pattern
         *  주어진 상황 및 용도에 따라 어떤 객체에 책임을 덧붙이는 패턴
         *
         *  Dependency Injection을 통해 책임을 전가함
         *
         */

        Pizza baconPizza = () -> "bacon Pizza";
        Pizza potatoPizza = () -> "potato Pizza";

        Pizza hotBaconPizza = new HotSource(baconPizza);
        System.out.println(hotBaconPizza.doTopping());

        Pizza garlicPotatoPizza = new GarlicSource(potatoPizza);
        System.out.println(garlicPotatoPizza.doTopping());

    }
}
