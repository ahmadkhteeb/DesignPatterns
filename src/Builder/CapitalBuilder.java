package Builder;

public class CapitalBuilder implements StringBuilder {

    private StringProduct result;

    @Override
    public void reset() {
        result = new StringProduct();
    }

    @Override
    public void addA() {
        result.addChar('A');
    }

    @Override
    public void addB() {
        result.addChar('B');
    }

    @Override
    public void addC() {
        result.addChar('C');
    }

    @Override
    public StringProduct getResult(){
        return result;
    }
}
