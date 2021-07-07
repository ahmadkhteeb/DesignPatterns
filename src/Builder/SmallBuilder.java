package Builder;

public class SmallBuilder implements StringBuilder {

    private StringProduct result;

    @Override
    public void reset() {
        result = new StringProduct();
    }

    @Override
    public void addA() {
        result.addChar('a');
    }

    @Override
    public void addB() {
        result.addChar('b');
    }

    @Override
    public void addC() {
        result.addChar('c');
    }

    @Override
    public StringProduct getResult(){
        return result;
    }

}
