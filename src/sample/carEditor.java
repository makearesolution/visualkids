package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

public class carEditor {
    @FXML
    private TextField txtTagNumber;

    @FXML
    private TextField txtMake;

    @FXML
    private TextField txtModel;

    @FXML
    private TextField txtYear;

    @FXML
    private ComboBox<String> cboCategories;

    @FXML
    private CheckBox chkCDPlayer;

    @FXML
    private CheckBox chkAvailable;

    @FXML
    private CheckBox chkDVDPlayer;

    @FXML
    private Label lblPictureName;

    @FXML
    private ImageView pbxCar;

    @FXML
    private Button btnSelectPicture;

    @FXML
    private Button btnClose;

    @FXML
    private Button btnSubmit;

    @FXML
    public void initialize(){
        System.out.println("afwafa");
        cboCategories.getItems().addAll("Economy", "Compact", "Standard", "Full Size", "Mini Van", "SUV", "Truck", "Van");
    }
    public void btnSelectPicture_Click(ActionEvent event){
        System.out.println("halooo");
    }
    public void btnSubmit_Click(ActionEvent event){
        System.out.println("halooo agaaaaiiiin");
    }
}
