package patterns;

public class StringReplacer implements StringTransformer{
    private char x;
    private char y;
    public StringReplacer(char a, char b){
        this.x = x;
        this.y = y;
    }
    public void execute(StringDrink drink){
        drink.setText(drink.getText().replace(x,y));
    }
    public void undo(StringDrink drink){
        drink.setText(drink.getText().replace(x,y));
    }
}