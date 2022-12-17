package patterns;

public class StringCaseChanger implements StringTransformer{
    public void execute(StringDrink drink){
        StringBuilder a = new StringBuilder();
        String text = drink.getText();
        int size = text.length();
        for (int i = 0; i <size; i++){
            if (Character.isLowerCase(text.charAt(i))){
                a.append(Character.toUpperCase(text.charAt(i)));
            }
            else{
                a.append(Character.toLowerCase(text.charAt(i)));
            }
        }
        drink.setText(a.toString());
    }
    public void undo(StringDrink drink){
        execute(drink);
    }
}