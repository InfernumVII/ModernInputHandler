import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Stack;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;
import some.Handler;
import some.ModernInputHandlerDialog;
import some.StringPrompt;


public class App extends Application {
        


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // ButtonType okButton = new ButtonType("Submit", ButtonData.OK_DONE);
        // customDialog.getDialogPane().getButtonTypes().add(okButton);
        // ModernInputHandlerDialog modernInputHandlerDialog = new ModernInputHandlerDialog();
        // modernInputHandlerDialog.addHandler(new StringPrompt("Enter name", false));
        // modernInputHandlerDialog.addHandler(new StringPrompt("Enter name", false));
        // modernInputHandlerDialog.addHandler(new StringPrompt("Enter name", false));
        // modernInputHandlerDialog.addHandler(new StringPrompt("Enter name", false));
        // modernInputHandlerDialog.addHandler(new StringPrompt("Enter name", false));
        // modernInputHandlerDialog.addHandler(new StringPrompt("Enter name", false));
        // customDialog.getDialogPane().setContent(modernInputHandlerDialog.getRoot());
        // customDialog.showAndWait();

        //primaryStage.setScene(new Scene(modernInputHandlerDialog.getRoot()));
        //primaryStage.show();
        // VBox vbox = new VBox()

        StackPane root = new StackPane();
        Button button = new Button();
        button.setOnAction(this::check);
        primaryStage.setScene(new Scene(button));
        primaryStage.show();

        
        
    }

    private void check(ActionEvent event){
        ModernInputHandlerDialog modernInputHandlerDialog = new ModernInputHandlerDialog();
        modernInputHandlerDialog.addHandler(new StringPrompt("Enter name1", false));
        modernInputHandlerDialog.addHandler(new StringPrompt("Enter name2", false));
        modernInputHandlerDialog.addHandler(new StringPrompt("Enter name3", false));
        modernInputHandlerDialog.addHandler(new StringPrompt("Enter name4", false));
        modernInputHandlerDialog.addHandler(new StringPrompt("Enter name5", false));
        modernInputHandlerDialog.addHandler(new StringPrompt("Enter name6", false));
        modernInputHandlerDialog.showAndWait();

        // System.out.println("Im alive!");
        // Dialog<String> customDialog = new Dialog<>();
        // customDialog.setTitle("C");
        // customDialog.setHeaderText("1");
        // Button closeButton = new Button("close");
        // closeButton.setOnAction(e -> {
        //     customDialog.getDialogPane().getChildren().forEach(n -> {
        //         if (n.getClass() == ButtonBar.class){
        //             ButtonBar bar = (ButtonBar) n;
        //             bar.setDisable(true);
        //         }
        //     });
        // });
        // customDialog.getDialogPane().setContent(closeButton);
        // ButtonType okButton = new ButtonType("Submit", ButtonData.OK_DONE);
        // customDialog.getDialogPane().getButtonTypes().add(okButton);
        // customDialog.setResultConverter(buttonType -> {
        //     if (buttonType == okButton) {
        //         // Process the input and return a result
        //         return "Result";
        //     }
        //     return null;
        // });
        // Optional<String> customResult = customDialog.showAndWait();
        // customResult.ifPresent(result -> {
        //     // Process the custom result
        // });
        // Button closeButton = new Button("close");
        // Dialog<ButtonType> dialog = new Dialog<ButtonType>();
        // dialog.setOnCloseRequest(e -> {
        //     dialog.close();
        // });
        // closeButton.setOnAction(e -> {
        //     dialog.close();
        // });
        // GridPane gridPane = (GridPane) dialog.getDialogPane().getChildren().get(0);
        // gridPane.add(closeButton, 0, 0);
        // dialog.showAndWait();
        //DialogPane dialogPane = new DialogPane();
        //dialog.showAndWait();
        //Alert alert = new Alert(AlertType.CONFIRMATION);
        //alert.showAndWait();
        //Alert alert = new Alert(Alert.AlertType.INFORMATION); 
        // alert.setTitle("Information Dialog"); 
        // alert.setHeaderText("This is an information dialog"); 
        // alert.setContentText("You have successfully completed the operation."); 
        // alert.showAndWait(); 
        // Stage dialog = new Stage();
        // dialog.initStyle(StageStyle.UTILITY);
        // Scene scene = new Scene(new Group(new Text(25, 25, "Hello World!")));
        // dialog.setScene(scene);
        // dialog.showAndWait();
    }
}
