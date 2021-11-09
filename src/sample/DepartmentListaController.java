package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Department;

import java.net.URL;
import java.util.ResourceBundle;

public class DepartmentListaController implements Initializable {
//CRIAR REFERENCIAS PARA A SAMPLE DEPARTMENT lIST PARA O BUTTON - TABLE VIEW - COLUMN ID - COLUMN NAME

    @FXML
    private TableView<Department> tableViewDepartment;

    @FXML
    private TableColumn<Department, Integer> tableColumnId;

    @FXML
    private TableColumn<Department, String>tableColumnName;

    @FXML
    private Button btnNew;
    @FXML
    public void onBtnNewAction(){
        System.out.println("onBtnNewAction");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        inicializeNodes();
    }
    private void inicializeNodes(){//INICIA O COMPORTAMENTO DAS COLUNAS DO DEPARTMENTLISTACONTROLLER
        tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tableColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));

        //PARA A TABLE VIEW FINALIZAR COM A JANELA NA VBOX
        Stage stage = (Stage) Main.getScene().getWindow();
        tableViewDepartment.prefHeightProperty().bind(stage.heightProperty());

    }
}
