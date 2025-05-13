package some;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public abstract class Handler {
    Text error;
    TextField textField;
    private final BooleanProperty validateState = new SimpleBooleanProperty(false);
    public Handler(String prompt){
        error = new Text();
        error.setStyle("-fx-fill: #dc143c;");
        textField = new TextField();
        textField.setPromptText(prompt);
        textField.setStyle("-fx-background-color:  #37373E; -fx-text-fill:  #FFFFFF;");
        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (validateInput()){
                validateState.set(true);
                printError("");
            } else {
                validateState.set(false);
            }
        });
    }

    public BooleanProperty validateStateProperty() { return validateState; }

    public boolean getValidateStateProperty(){ return validateState.get(); }

    public abstract boolean validateInput();

    protected void printError(String error){
        this.error.setText(error);
    }

    public Node[] getNodes(){
        return new Node[]{error, textField};
    }
}
