package Builder;

public class StringProduct {

    private String result;

    public StringProduct(){
        result = "";
    }

    public void addChar(char c){
        result += c;
    }

    public String toString(){
        return result;
    }

}
