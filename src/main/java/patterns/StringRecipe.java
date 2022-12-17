package patterns;

import java.util.List;

public class StringRecipe {
    private List<StringTransformer> list;
    public StringRecipe(List<StringTransformer> list){
        this.list = list;
    }

    public void mix(StringDrink o){
        for (StringTransformer method: list){
            method.execute(o);
        }
    }
}