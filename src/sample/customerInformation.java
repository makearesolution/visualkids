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

public class customerInformation implements Initializable {

    @FXML
    private TableView<customerInformationProduct> customerInformationProductTableView;

    @FXML
    private TableColumn<customerInformationProduct, String> CustomerID;

    @FXML
    private TableColumn<customerInformationProduct, String> DrvLicNumber;

    @FXML
    private TableColumn<customerInformationProduct, String> FullName;

    @FXML
    private TableColumn<customerInformationProduct, String> Address;

    @FXML
    private TableColumn<customerInformationProduct, String> City;

    @FXML
    private TableColumn<customerInformationProduct, String> State;

    @FXML
    private TableColumn<customerInformationProduct, String> ZIPCode;

    @FXML
    void btnClose_Click(ActionEvent event) {
        Platform.exit();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        CustomerID.setCellValueFactory(new PropertyValueFactory<>("CustomerIDProduct"));
        DrvLicNumber.setCellValueFactory(new PropertyValueFactory<>("DrvLicNumberProduct"));
        FullName.setCellValueFactory(new PropertyValueFactory<>("FullNameProduct"));
        Address.setCellValueFactory(new PropertyValueFactory<>("AddressProduct"));
        City.setCellValueFactory(new PropertyValueFactory<>("CityProduct"));
        State.setCellValueFactory(new PropertyValueFactory<>("StateProduct"));
        ZIPCode.setCellValueFactory(new PropertyValueFactory<>("ZIPCodeProduct"));
        customerInformationProductTableView.setItems(observableList);
    }
    ObservableList<customerInformationProduct> observableList = FXCollections.observableArrayList(
        new customerInformationProduct(" ","M-505-862-575", "Lynda Melman", "4277 Jamison Avenue", "Silver Spring", "MD", "20904"),
        new customerInformationProduct(" ", "379-82-7397", "John Villard", "108 Hacken Rd NE", "Washington", "DC", "20012"),
        new customerInformationProduct(" ", "J-938-928-274", "Chris Young", "8522 Aulage Street", "Rockville", "MD", "20852"),
        new customerInformationProduct(" ", "497-22-0614", "Pamela Ulmreck", "12075 Famina Rd", "Blain", "PA", "17006"),
        new customerInformationProduct(" ", "922-71-8395", "Helene Kapsco", "806 Hyena Drive", "Alexandria", "VA", "22231"),
        new customerInformationProduct(" ", "C-374-830-422", "Hermine Crasson", "6255 Old Georgia Ave", "Silver Spring", "MD", "20910"),
        new customerInformationProduct(" ", "836-55-2279", "Alan Pastore", "4228 Talion Street", "Amherst", "NY", "14228"),
        new customerInformationProduct(" ", "397-59-7487", "Phillis Buster", "724 Cranston Circle", "Knoxville", "TN", "37919"),
        new customerInformationProduct(" ", "115-80-2957", "Elmus Krazucki", "808 Rasters Ave", "Orlando", "FL", "32810"),
        new customerInformationProduct(" ", "294-90-7744", "Helena Weniack", "10448 Great Pollard Hwy", "Arlington", "VA", "22232")
    );
}
