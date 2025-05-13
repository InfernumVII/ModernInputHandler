package some;


public class StringPrompt extends Handler<String>{
    boolean allowNull;

    public StringPrompt(String prompt, boolean allowNull){
        super(prompt);
        this.allowNull = allowNull;
    }

    @Override
    public boolean validateInputAndSetContent() {
        if (!allowNull && getTextField().getText().isEmpty()) {
            printError("The field value cannot be empty.");
            return false;
        }
        return true;
    }



}