package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class RentalRates implements Initializable {
    @FXML
    private TableView<rentalRatesProduct> rentalRatesProductTableView;

    @FXML
    private TableColumn<rentalRatesProduct, String> colCategory;

    @FXML
    private TableColumn<rentalRatesProduct, String> colDaily;

    @FXML
    private TableColumn<rentalRatesProduct, String> colWeekly;

    @FXML
    private TableColumn<rentalRatesProduct, String> colMonthly;

    @FXML
    private TableColumn<rentalRatesProduct, String>colWeekend;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colCategory.setCellValueFactory(new PropertyValueFactory<>("productCategory"));
        colDaily.setCellValueFactory(new PropertyValueFactory<>("productDaily"));
        colWeekly.setCellValueFactory(new PropertyValueFactory<>("productWeekly"));
        colMonthly.setCellValueFactory(new PropertyValueFactory<>("productMonthly"));
        colWeekend.setCellValueFactory(new PropertyValueFactory<>("productWeekend"));
        rentalRatesProductTableView.setItems(observableList);
    }
    ObservableList<rentalRatesProduct> observableList = FXCollections.observableArrayList(
        new rentalRatesProduct("Economy", "35.95","32.75", "28.95", "24.95"),
        new rentalRatesProduct("Compact", "39.95","35.75", "32.95", "28.95"),
        new rentalRatesProduct("Standard", "45.95","39.75", "35.95", "32.95"),
        new rentalRatesProduct("Full Size", "49.95","42.75", "38.95", "35.95"),
        new rentalRatesProduct("Mini Van", "55.95","50.75", "45.95", "42.95"),
        new rentalRatesProduct("SUV", "55.95","50.75", "45.95", "42.95"),
        new rentalRatesProduct("Truck", "42.75","38.75", "35.95", "32.95"),
        new rentalRatesProduct("Van", "69.95","62.75", "55.95", "52.95")
    );
}
