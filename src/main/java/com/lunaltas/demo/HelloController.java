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
    @FXML private TextField inputName;
    @FXML private TextField inputEmail;
    ObservableList lista;

    @FXML
    public void initialize() {
        // Liga a coluna "Nome" ao atributo "nome" da classe Usuario
        colNome.setCellValueFactory(
                new PropertyValueFactory<>("nome")
        );

        // Liga a coluna "Email" ao atributo "email"
        colEmail.setCellValueFactory(
                new PropertyValueFactory<>("email")
        );

        // Cria a lista observável e joga na tabela
        lista = FXCollections.observableArrayList(
                new Usuario("Maria", "maria@email.com"),
                new Usuario("João", "joao@email.com")
        );
        tabela.setItems(lista);
        colEmail.setText("E-mail");
        colNome.setText("Nome");
    }

    @FXML
    protected void onHelloButtonClick() {
        String name = inputName.getText();
        String email = inputEmail.getText();
        lista.add(new Usuario(name, email));
    }
}
