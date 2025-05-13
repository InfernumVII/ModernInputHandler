package some;


public class StringPrompt extends Handler{
    String prompt;
    boolean allowNull;

    public StringPrompt(String prompt, boolean allowNull){
        super(prompt);
        this.allowNull = allowNull;
    }

    @Override
    public boolean validateInput() {
        if (!allowNull && textField.getText().isEmpty()) {
            printError("The field value cannot be empty.");
            return false;
        }
        return true;
    }


}