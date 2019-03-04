package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Controller {
    @FXML
    private ComboBox<?> cbxEmployeeID;

    @FXML
    private TextField txtEmployeeName;

    @FXML
    private ComboBox<?> cbxCustomerID;

    @FXML
    private TextField txtCustomerName;

    @FXML
    private TextField txtCustomerAddress;

    @FXML
    private TextField txtCustomerCity;

    @FXML
    private ComboBox<String> cbxCustomerStates;

    @FXML
    private TextField txtCustomerZIPCode;

    @FXML
    private ComboBox<?> cbxCarID;

    @FXML
    private ComboBox<String> cbxCarConditions;

    @FXML
    private TextField txtMake;

    @FXML
    private TextField txtModel;

    @FXML
    private TextField txtCarYear;

    @FXML
    private TextField txtMileageStart;

    @FXML
    private TextField txtMileageEnd;

    @FXML
    private ComboBox<String> cbxTankLevels;

    @FXML
    private DatePicker dtpDateProcessed;

    @FXML
    private DatePicker dtpStartDate;

    @FXML
    private DatePicker dtpEndDate;

    @FXML
    private TextField txtDays;

    @FXML
    private ComboBox<String> cbxOrderStatus;

    @FXML
    private TextField txtRateApplied;

    @FXML
    private TextField txtSubTotal;

    @FXML
    private TextField txtTaxRate;

    @FXML
    private TextField txtTaxAmount;

    @FXML
    private TextField txtOrderTotal;

    @FXML
    private TextField txtReceiptNumber;

    @FXML
    private Button btnRentalRates;

    @FXML
    private Button btnCalculate;

    @FXML
    private Button btnPrint;

    @FXML
    private Button btnPrintPreview;

    @FXML
    private Button btnOpen;

    @FXML
    private Button btnClose;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnNewRentalOrder;



    @FXML
    public void initialize(){
        System.out.println("ehdrhdrh");
        cbxCustomerStates.getItems().addAll("AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "DC", "FL",
                "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ",
                "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY");
        cbxCarConditions.getItems().addAll("Needs Repair", "Drivable", "Excellent");
        cbxTankLevels.getItems().addAll("Empty", "1/4 Empty", "1/2 Full", "3/4 Full", "Full");
        cbxOrderStatus.getItems().addAll("Car On Road", "Car Returned", "Order Reserved");
    }

    public void dtpStartDate_ValueChanged(ActionEvent event) {
        dtpEndDate.setValue(dtpStartDate.getValue());
    }

    public void dtpEndDate_ValueChanged(ActionEvent event){
        LocalDate date = dtpEndDate.getValue();
        LocalDate date2 = dtpStartDate.getValue();
        long days = ChronoUnit.DAYS.between(date,date2);
        if (days == 0)
            days = 1;
        txtDays.setText(String.valueOf(days));
    }

    public void btnRentalRates_Click(ActionEvent event){
        try {
            AnchorPane root = FXMLLoader.load(getClass().getResource("rentalRates.fxml"));
            Scene scene = new Scene(root,462,263);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("Bethesda Car Rental: Rental Rates");
            stage.setScene(scene);
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void btnCalculate_Click(ActionEvent event) throws IOException {
        int    Days = 0;
        double RateApplied = 0.00;
        double SubTotal = 0.00;
        double TaxRate = 0.00;
        double TaxAmount = 0.00;
        double OrderTotal = 0.00;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);

        try
        {
            Days = Integer.parseInt(this.txtDays.getText());
        }
        catch (Exception e)
        {
            alert.setContentText("Invalid Number of Days");
            alert.showAndWait();
        }

        try
        {
            RateApplied = Double.parseDouble(txtRateApplied.getText());
        }
        catch (Exception e)
        {
            alert.setContentText("Invalid Amount for Rate Applied");
            alert.showAndWait();
        }
        SubTotal = Days * RateApplied;
        txtSubTotal.setText(String.valueOf(SubTotal));

        try
        {
            TaxRate = Double.parseDouble(txtTaxRate.getText());
        }
        catch (Exception e)
        {
            alert.setContentText("Invalid Tax Rate");
            alert.showAndWait();
        }
        TaxAmount = SubTotal * TaxRate / 100;
        txtTaxAmount.setText(String.valueOf(TaxAmount));
        OrderTotal = SubTotal + TaxAmount;
        txtOrderTotal.setText(String.valueOf(OrderTotal));
    }

//    public void docPrint_PrintPage(System.Drawing.Printing.PrintPageEventArgs e)
//    {
//        e.Graphics.DrawLine(new Pen(Color.Black, 2), 80, 90, 750, 90);
//        e.Graphics.DrawLine(new Pen(Color.Black, 1), 80, 93, 750, 93);
//
//        String strDisplay = "Bethesda Car Rental";
//        System.Drawing.Font fntString = new Font("Times New Roman", 28,
//                FontStyle.Bold);
//        e.Graphics.DrawString(strDisplay, fntString,
//                Brushes.Black, 240, 100);
//
//        strDisplay = "Car Rental Order";
//        fntString = new System.Drawing.Font("Times New Roman", 22,
//                FontStyle.Regular);
//        e.Graphics.DrawString(strDisplay, fntString,
//                Brushes.Black, 320, 150);
//
//        e.Graphics.DrawLine(new Pen(Color.Black, 1), 80, 187, 750, 187);
//        e.Graphics.DrawLine(new Pen(Color.Black, 2), 80, 190, 750, 190);
//
//        fntString = new System.Drawing.Font("Times New Roman", 12,
//                FontStyle.Bold);
//        e.Graphics.DrawString("Receipt #:  ", fntString,
//                Brushes.Black, 100, 220);
//        fntString = new System.Drawing.Font("Times New Roman", 12,
//                FontStyle.Regular);
//        e.Graphics.DrawString(txtReceiptNumber.Text, fntString,
//                Brushes.Black, 260, 220);
//        e.Graphics.DrawLine(new Pen(Color.Black, 1), 100, 240, 380, 240);
//
//        fntString = new System.Drawing.Font("Times New Roman", 12,
//                FontStyle.Bold);
//        e.Graphics.DrawString("Processed By:  ", fntString,
//                Brushes.Black, 420, 220);
//        fntString = new System.Drawing.Font("Times New Roman", 12,
//                FontStyle.Regular);
//        e.Graphics.DrawString(txtEmployeeName.Text, fntString,
//                Brushes.Black, 550, 220);
//        e.Graphics.DrawLine(new Pen(Color.Black, 1), 420, 240, 720, 240);
//
//        fntString = new Font("Times New Roman", 12, FontStyle.Bold);
//
//        e.Graphics.FillRectangle(Brushes.Gray,
//                new Rectangle(100, 260, 620, 20));
//        e.Graphics.DrawRectangle(Pens.Black,
//                new Rectangle(100, 260, 620, 20));
//
//        e.Graphics.DrawString("Customer", fntString,
//                Brushes.White, 100, 260);
//
//        fntString = new Font("Times New Roman", 12, FontStyle.Bold);
//        e.Graphics.DrawString("Driver's License #: ", fntString,
//                Brushes.Black, 100, 300);
//        e.Graphics.DrawString("Name: ", fntString,
//                Brushes.Black, 420, 300);
//        fntString = new Font("Times New Roman", 12, FontStyle.Regular);
//        e.Graphics.DrawString(cbxCustomerID.Text, fntString,
//                Brushes.Black, 260, 300);
//        e.Graphics.DrawString(txtCustomerName.Text, fntString,
//                Brushes.Black, 540, 300);
//        e.Graphics.DrawLine(new Pen(Color.Black, 1), 100, 320, 720, 320);
//
//        fntString = new Font("Times New Roman", 12, FontStyle.Bold);
//        e.Graphics.DrawString("Address: ", fntString,
//                Brushes.Black, 100, 330);
//        fntString = new Font("Times New Roman", 12, FontStyle.Regular);
//        e.Graphics.DrawString(txtCustomerAddress.Text, fntString,
//                Brushes.Black, 260, 330);
//        e.Graphics.DrawLine(new Pen(Color.Black, 1), 100, 350, 720, 350);
//
//        strDisplay = txtCustomerCity.Text + " " +
//                cbxCustomerStates.Text + " " +
//                txtCustomerZIPCode.Text;
//        fntString = new System.Drawing.Font("Times New Roman",
//                12, FontStyle.Regular);
//        e.Graphics.DrawString(strDisplay, fntString,
//                Brushes.Black, 260, 360);
//        e.Graphics.DrawLine(new Pen(Color.Black, 1), 260, 380, 720, 380);
//
//        fntString = new Font("Times New Roman", 12, FontStyle.Bold);
//
//        e.Graphics.FillRectangle(Brushes.Gray,
//                new Rectangle(100, 410, 620, 20));
//        e.Graphics.DrawRectangle(Pens.Black,
//                new Rectangle(100, 410, 620, 20));
//
//        e.Graphics.DrawString("Car Information", fntString,
//                Brushes.White, 100, 410);
//
//        fntString = new Font("Times New Roman", 12, FontStyle.Bold);
//        e.Graphics.DrawString("Tag #: ", fntString,
//                Brushes.Black, 100, 450);
//        fntString = new Font("Times New Roman", 12, FontStyle.Regular);
//        e.Graphics.DrawString(cbxCarID.Text, fntString,
//                Brushes.Black, 260, 450);
//        e.Graphics.DrawLine(new Pen(Color.Black, 1), 100, 470, 380, 470);
//
//        fntString = new Font("Times New Roman", 12, FontStyle.Bold);
//        e.Graphics.DrawString("Year: ", fntString,
//                Brushes.Black, 420, 450);
//        fntString = new Font("Times New Roman", 12, FontStyle.Regular);
//        e.Graphics.DrawString(txtCarYear.Text, fntString,
//                Brushes.Black, 530, 450);
//        e.Graphics.DrawLine(new Pen(Color.Black, 1), 420, 470, 720, 470);
//
//        fntString = new Font("Times New Roman", 12, FontStyle.Bold);
//        e.Graphics.DrawString("Make: ", fntString,
//                Brushes.Black, 100, 480);
//        fntString = new Font("Times New Roman", 12, FontStyle.Regular);
//        e.Graphics.DrawString(txtMake.Text, fntString,
//                Brushes.Black, 260, 480);
//        e.Graphics.DrawLine(new Pen(Color.Black, 1), 100, 500, 380, 500);
//
//        fntString = new Font("Times New Roman", 12, FontStyle.Bold);
//        e.Graphics.DrawString("Model: ", fntString,
//                Brushes.Black, 420, 480);
//        fntString = new Font("Times New Roman", 12, FontStyle.Regular);
//        e.Graphics.DrawString(txtModel.Text, fntString,
//                Brushes.Black, 530, 480);
//        e.Graphics.DrawLine(new Pen(Color.Black, 1), 420, 500, 720, 500);
//
//        fntString = new Font("Times New Roman", 12, FontStyle.Bold);
//        e.Graphics.DrawString("Car Condition: ", fntString,
//                Brushes.Black, 100, 510);
//        fntString = new Font("Times New Roman", 12, FontStyle.Regular);
//        e.Graphics.DrawString(cbxCarConditions.Text, fntString,
//                Brushes.Black, 260, 510);
//        e.Graphics.DrawLine(new Pen(Color.Black, 1), 100, 530, 380, 530);
//
//        fntString = new Font("Times New Roman", 12, FontStyle.Bold);
//        e.Graphics.DrawString("Tank Level: ", fntString,
//                Brushes.Black, 420, 510);
//        fntString = new Font("Times New Roman", 12, FontStyle.Regular);
//        e.Graphics.DrawString(cbxTankLevels.Text, fntString,
//                Brushes.Black, 530, 510);
//        e.Graphics.DrawLine(new Pen(Color.Black, 1), 420, 530, 720, 530);
//
//        fntString = new Font("Times New Roman", 12, FontStyle.Bold);
//        e.Graphics.DrawString("Mileage Start:", fntString,
//                Brushes.Black, 100, 540);
//        fntString = new Font("Times New Roman", 12, FontStyle.Regular);
//        e.Graphics.DrawString(txtMileageStart.Text, fntString,
//                Brushes.Black, 260, 540);
//        e.Graphics.DrawLine(new Pen(Color.Black, 1),
//                100, 560, 380, 560);
//
//        fntString = new Font("Times New Roman", 12, FontStyle.Bold);
//        e.Graphics.DrawString("MileageEnd:", fntString,
//                Brushes.Black, 420, 540);
//        fntString = new Font("Times New Roman", 12, FontStyle.Regular);
//        e.Graphics.DrawString(txtMileageEnd.Text, fntString,
//                Brushes.Black, 530, 540);
//        e.Graphics.DrawLine(new Pen(Color.Black, 1),
//                420, 560, 720, 560);
//
//        e.Graphics.FillRectangle(Brushes.Gray,
//                new Rectangle(100, 590, 620, 20));
//        e.Graphics.DrawRectangle(Pens.Black,
//                new Rectangle(100, 590, 620, 20));
//
//        fntString = new Font("Times New Roman", 12, FontStyle.Bold);
//        e.Graphics.DrawString("Order Timing Information", fntString,
//                Brushes.White, 100, 590);
//
//        fntString = new Font("Times New Roman", 12, FontStyle.Bold);
//        e.Graphics.DrawString("Start Date:", fntString,
//                Brushes.Black, 100, 620);
//        fntString = new Font("Times New Roman", 12, FontStyle.Regular);
//        e.Graphics.DrawString(dtpStartDate.Value.ToString("D"),
//                fntString, Brushes.Black, 260, 620);
//        e.Graphics.DrawLine(new Pen(Color.Black, 1),
//                100, 640, 720, 640);
//
//        fntString = new Font("Times New Roman", 12, FontStyle.Bold);
//        e.Graphics.DrawString("End Date:", fntString,
//                Brushes.Black, 100, 650);
//        fntString = new Font("Times New Roman", 12, FontStyle.Regular);
//        e.Graphics.DrawString(dtpEndDate.Value.ToString("D"), fntString,
//                Brushes.Black, 260, 650);
//        e.Graphics.DrawLine(new Pen(Color.Black, 1),
//                100, 670, 520, 670);
//
//        fntString = new Font("Times New Roman", 12, FontStyle.Bold);
//        e.Graphics.DrawString("Days:", fntString,
//                Brushes.Black, 550, 650);
//        fntString = new Font("Times New Roman", 12, FontStyle.Regular);
//        e.Graphics.DrawString(txtDays.Text, fntString,
//                Brushes.Black, 640, 650);
//        e.Graphics.DrawLine(new Pen(Color.Black, 1),
//                550, 670, 720, 670);
//
//        e.Graphics.FillRectangle(Brushes.Gray,
//                new Rectangle(100, 700, 620, 20));
//        e.Graphics.DrawRectangle(Pens.Black,
//                new Rectangle(100, 700, 620, 20));
//
//        fntString = new Font("Times New Roman", 12, FontStyle.Bold);
//        e.Graphics.DrawString("Order Evaluation", fntString,
//                Brushes.White, 100, 700);
//
//        StringFormat fmtString = new StringFormat();
//        fmtString.Alignment = StringAlignment.Far;
//
//        fntString = new Font("Times New Roman", 12, FontStyle.Bold);
//        e.Graphics.DrawString("Rate Applied:", fntString,
//                Brushes.Black, 100, 740);
//        fntString = new Font("Times New Roman", 12, FontStyle.Regular);
//        e.Graphics.DrawString(txtRateApplied.Text, fntString,
//                Brushes.Black, 300, 740, fmtString);
//        e.Graphics.DrawLine(new Pen(Color.Black, 1),
//                100, 760, 380, 760);
//
//        fntString = new Font("Times New Roman", 12, FontStyle.Bold);
//        e.Graphics.DrawString("Tax Rate:", fntString,
//                Brushes.Black, 420, 740);
//        fntString = new Font("Times New Roman", 12, FontStyle.Regular);
//        e.Graphics.DrawString(txtTaxRate.Text, fntString,
//                Brushes.Black, 640, 740, fmtString);
//        e.Graphics.DrawString("%", fntString,
//                Brushes.Black, 640, 740);
//        e.Graphics.DrawLine(new Pen(Color.Black, 1),
//                420, 760, 720, 760);
//
//        fntString = new Font("Times New Roman", 12, FontStyle.Bold);
//        e.Graphics.DrawString("Sub-Total:", fntString,
//                Brushes.Black, 100, 770);
//        fntString = new Font("Times New Roman", 12, FontStyle.Regular);
//        e.Graphics.DrawString(txtSubTotal.Text, fntString,
//                Brushes.Black, 300, 770, fmtString);
//        e.Graphics.DrawLine(new Pen(Color.Black, 1),
//                100, 790, 380, 790);
//
//        fntString = new Font("Times New Roman", 12, FontStyle.Bold);
//        e.Graphics.DrawString("Tax Amount:", fntString,
//                Brushes.Black, 420, 770);
//        fntString = new Font("Times New Roman", 12, FontStyle.Regular);
//        e.Graphics.DrawString(txtTaxAmount.Text, fntString,
//                Brushes.Black, 640, 770, fmtString);
//        e.Graphics.DrawLine(new Pen(Color.Black, 1),
//                420, 790, 720, 790);
//
//        fntString = new Font("Times New Roman", 12, FontStyle.Bold);
//        e.Graphics.DrawString("Order Total:", fntString,
//                Brushes.Black, 420, 800);
//        fntString = new Font("Times New Roman", 12, FontStyle.Regular);
//        e.Graphics.DrawString(txtOrderTotal.Text, fntString,
//                Brushes.Black, 640, 800, fmtString);
//        e.Graphics.DrawLine(new Pen(Color.Black, 1),
//                420, 820, 720, 820);
//    }


    public void btnPrint_Click(ActionEvent event)
    {
//        if (dlgPrint.ShowDialog() == DialogResult.OK)
//            docPrint.Print();
    }

    public void btnPrintPreview_Click(ActionEvent event)
    {
//        dlgPrintPreview.ShowDialog();
    }

    public void btnNewRentalOrder_Click(ActionEvent event)
    {
        cbxEmployeeID.getSelectionModel().isSelected(-1);
        txtEmployeeName.setText("");
        cbxCustomerID.getSelectionModel().isSelected(-1);
        txtCustomerName.setText("");
        txtCustomerAddress.setText("");
        txtCustomerCity.setText("");
        cbxCustomerStates.getSelectionModel().select(8);
        txtCustomerZIPCode.setText("");
        cbxCarID.getSelectionModel().isSelected(-1);
        cbxCarConditions.getSelectionModel().isSelected(2);
        txtMake.setText("");
        txtModel.setText("");
        txtCarYear.setText("");
        cbxTankLevels.getSelectionModel().isSelected(0);
        txtMileageStart.setText("0");
        txtMileageEnd.setText("0");
        dtpDateProcessed.setValue(LocalDate.now());
        dtpStartDate.setValue(LocalDate.now());
        dtpEndDate.setValue(LocalDate.now());
        txtDays.setText("1");
        txtRateApplied.setText("0.00");
        txtSubTotal.setText("0.00");
        txtTaxAmount.setText("0.00");
        txtOrderTotal.setText("0.00");
        cbxOrderStatus.getSelectionModel().isSelected(0);
    }
}
