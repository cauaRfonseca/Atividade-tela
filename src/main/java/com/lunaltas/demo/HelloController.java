package com.lunaltas.demo;

import com.lunaltas.demo.Usuario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {
    @FXML
    private Label welcomeText;
    // Declaração dos componentes com fx:id
    @FXML private TableView tabela;
    @FXML private TableColumn colNome;
    @FXML private TableColumn colEmail;
    @FXML private TableColumn colIMC;
    @FXML private TextField inputName;
    @FXML private TextField inputEmail;
    @FXML private TextField txtPeso;
    @FXML private TextField txtAltura;
    @FXML private ObservableList lista;

    @FXML public double calcularIMC() {
        double peso = Double.parseDouble(
                txtPeso.getText()
        );
        double altura = Double.parseDouble(
                txtAltura.getText()
        );

        double imc = peso / (altura * altura);

        return imc;
    }

    @FXML public void initialize() {
        colNome.setCellValueFactory(
                new PropertyValueFactory<>("nome")
        );
        colEmail.setCellValueFactory(
                new PropertyValueFactory<>("email")
        );
        colIMC.setCellValueFactory(
                new PropertyValueFactory<>("imc")
        );
        lista = FXCollections.observableArrayList(
                new Usuario("Maria", "maria@email.com", 21.4),
                new Usuario("João", "joao@email.com", 24.5)
        );
        tabela.setItems(lista);
        colEmail.setText("E-mail");
        colNome.setText("Nome");
        colIMC.setText("IMC");
    }

    @FXML
    protected void onHelloButtonClick() {
        String name = inputName.getText();
        String email = inputEmail.getText();
        double imc = calcularIMC();
        lista.add(new Usuario(name, email, imc));
    }
}
