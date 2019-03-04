package sample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class EmployeeRecord implements Initializable {

    @FXML
    private TableView<employeesRecordProduct> employeeRecordProductTableView;

    @FXML
    private TableColumn<employeesRecordProduct, String> EmployeeID;

    @FXML
    private TableColumn<employeesRecordProduct, String> EmployeeNumber;

    @FXML
    private TableColumn<employeesRecordProduct, String> FirstName;

    @FXML
    private TableColumn<employeesRecordProduct, String> LastName;

    @FXML
    private TableColumn<employeesRecordProduct, String> FullName;

    @FXML
    private TableColumn<employeesRecordProduct, String> Title;

    public void btnClose_Click(ActionEvent event){
        Platform.exit();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        EmployeeID.setCellValueFactory(new PropertyValueFactory<>("productEmployeeID"));
        EmployeeNumber.setCellValueFactory(new PropertyValueFactory<>("productEmployeeNumber"));
        FirstName.setCellValueFactory(new PropertyValueFactory<>("productFirstName"));
        LastName.setCellValueFactory(new PropertyValueFactory<>("productLastName"));
        FullName.setCellValueFactory(new PropertyValueFactory<>("productFullName"));
        Title.setCellValueFactory(new PropertyValueFactory<>("productTitle"));
        employeeRecordProductTableView.setItems(observableList);
    }
    ObservableList<employeesRecordProduct> observableList = FXCollections.observableArrayList(
            new employeesRecordProduct(" ", "62-845","Patricia", "Katts", "Patricia Katts", "General Manager"),
            new employeesRecordProduct(" ", "92-303","Henry", "Larson", "Henry Larson", "Sales Representative"),
            new employeesRecordProduct(" ", "25-947","Gertrude", "Monay", "Gertrude Monay", "Sales Representative"),
            new employeesRecordProduct(" ", "73-947","Helene", "Sandt", "Helene Sandt", "Intern"),
            new employeesRecordProduct(" ", "40-508","Melanie", "Karron", "Melanie Karron", "Sales Representative"),
            new employeesRecordProduct(" ", "22-580","Ernest", "Chisen", "Ernest Chisen", "Sales Manager"),
            new employeesRecordProduct(" ", "20-308","Melissa", "Roberts", "Melissa Roberts", "Administrative Assistant")
    );
}
