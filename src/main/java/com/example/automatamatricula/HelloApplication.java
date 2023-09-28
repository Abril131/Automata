package com.example.automatamatricula;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private TextField entradaTextField;
    private Label salidaLabel;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Automata Matricula");

        entradaTextField = new TextField();
        entradaTextField.setPromptText("Ingresa una Matricula");

        Button mostrarButton = new Button("Mostrar");
        mostrarButton.setOnAction(e -> mostrarTexto());

        salidaLabel = new Label();

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20, 20, 20, 20));
        vbox.getChildren().addAll(entradaTextField, mostrarButton, salidaLabel);

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void mostrarTexto() {
        String textoIngresado = entradaTextField.getText();
        salidaLabel.setText("Matricula ingresada: " + textoIngresado);
        Automata validar = new Automata();
        String resultado = validar.automata(textoIngresado);
        salidaLabel.setText("Resultado: "+ resultado);
        salidaLabel.setText(" " + resultado);
    }

    public static void main(String[] args) {
        launch(args);
    }
}