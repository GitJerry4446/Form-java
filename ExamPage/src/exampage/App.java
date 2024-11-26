/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampage;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author MATHIAS JEREMIAH
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Label examLabel, surname, firstN, matNo, extendLabel;
        TextField tfSurname, tfFirst, tfMatno;
        ComboBox<String> extension;
        Button reset, submit;

        //LABEL
        examLabel = new Label("Exam Portal");
        surname = new Label("Surname: ");
        firstN = new Label("Firstname: ");
        matNo = new Label("Matriculation Number: ");
        extendLabel = new Label("SELECT COURSE EXTENSION");
        
        //TEXTFIELD
        tfSurname = new TextField();
        tfSurname.setPromptText("Enter surname");

        tfFirst = new TextField();
        tfFirst.setPromptText("Enter firstname");

        tfMatno = new TextField();
        tfMatno.setPromptText("Enter Matriculation number");
        
        //COMBOBOX
        extension = new ComboBox(FXCollections.observableArrayList("JAVA", "C", "PY"));
        extension.setPromptText("Select extension");
        
        //BUTTON
        reset = new Button("RESET");
        submit = new Button("SUBMIT");
        
        HBox btnHb = new HBox(10, reset, submit);
        btnHb.setAlignment(Pos.CENTER);
        
        //LABEL FORMAT
        examLabel.setAlignment(Pos.CENTER);
        examLabel.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        examLabel.setStyle("-fx-font:italic bold 40px monospace");

        VBox vs = new VBox(5, surname, tfSurname);
        VBox vf = new VBox(5, firstN, tfFirst);
        VBox vm = new VBox(5, matNo, tfMatno);
        VBox ve = new VBox(5, extendLabel, extension);

        VBox mainVb = new VBox(10, examLabel, vs, vf, vm, ve, btnHb);
        
        //TEXTFIELD FORMAT
        tfSurname.setPadding(new Insets(10));
        tfFirst.setPadding(new Insets(10));
        tfMatno.setPadding(new Insets(10));
        
        //COMBOBOX FORMAT
        extension.setPadding(new Insets(5));
        extension.setMaxWidth(Double.MAX_VALUE);
        
        //BUTTON FORMAT
        reset.setPrefSize(700, 50);
        submit.setPrefSize(700, 50);
        
        //FORM COMPNENT FORMAT
        mainVb.setAlignment(Pos.CENTER);
        mainVb.setMaxSize(400, 400);

        BorderPane pane = new BorderPane();
        
        pane.setPadding(new Insets(10));
        pane.setCenter(mainVb);
        
        Scene scene = new Scene(pane, 400, 400);
        stage.setScene(scene);
        stage.setTitle("Exam Portal");
        stage.setResizable(true);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
