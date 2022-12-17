package patterns;

public class StringInverter implements  StringTransformer{
    public void execute(StringDrink drink){
        StringBuilder a = new StringBuilder();
        String text = drink.getText();
        int size = text.length();
        int i  = size-1;
        while (i >= 0){
            char c = text.charAt(i);
            a.append(c);
            i--;
        }
        drink.setText(a.toString());
    }
    public void undo(StringDrink drink){
        execute(drink);
    }
}