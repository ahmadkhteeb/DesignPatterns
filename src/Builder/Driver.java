package Builder;

public class Driver {
    public static void main(String[] args) {
        StringBuilder capitalBuilder = new CapitalBuilder();
        StringBuilder smallBuilder = new SmallBuilder();
        Director director = new Director(capitalBuilder);
        director.buildString();
        System.out.println(capitalBuilder.getResult().toString());
        director.changeBuilder(smallBuilder);
        director.buildString();
        System.out.println(smallBuilder.getResult().toString());
    }
}
