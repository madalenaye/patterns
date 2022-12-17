package patterns;

public interface StringTransformer {
    void execute(StringDrink drink);
    void undo(StringDrink drink);
}
