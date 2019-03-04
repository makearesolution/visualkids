package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class nuurController {
    public void btnOrderProcessing_Click(ActionEvent event){
        try {
            BorderPane root = FXMLLoader.load(getClass().getResource("orderProcessing.fxml"));
            Scene scene = new Scene(root,700,400);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("Bethesda Car Rental: Order Processing");
            stage.setScene(scene);
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void btnEmployees_Click(ActionEvent event){
        try {
            Pane root = FXMLLoader.load(getClass().getResource("employeeRecord.fxml"));
            Scene scene = new Scene(root,549,344);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("Bethesda Car Rental: Employees Records");
            stage.setScene(scene);
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void btnCustomers_Click(ActionEvent event){
        try {
            Pane root = FXMLLoader.load(getClass().getResource("customerInformation.fxml"));
            Scene scene = new Scene(root,577,344);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("Bethesda Car Rental: Customers Information");
            stage.setScene(scene);
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void btnCarRental_Click(ActionEvent event){
        try{
            BorderPane root = FXMLLoader.load(getClass().getResource("carEditor.fxml"));
            Scene scene = new Scene(root,608,358);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("Bethesda Car Rental: Car Editor");
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
