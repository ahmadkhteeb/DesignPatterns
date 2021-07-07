package Builder;

public class Director {

    private StringBuilder builder;

    public Director(StringBuilder builder){
        this.builder = builder;
    }

    public void buildString(){
        builder.reset();
        builder.addA();
        builder.addB();
        builder.addC();
    }

    public void changeBuilder(StringBuilder builder){
        this.builder = builder;
    }

}
