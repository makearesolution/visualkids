package sample;

import javafx.beans.property.SimpleStringProperty;

public class employeesRecordProduct {
    private SimpleStringProperty productEmployeeID;
    private SimpleStringProperty productEmployeeNumber;
    private SimpleStringProperty productFirstName;
    private SimpleStringProperty productLastName;
    private SimpleStringProperty productFullName;
    private SimpleStringProperty productTitle;

    public employeesRecordProduct(String productEmployeeID, String productEmployeeNumber, String productFirstName, String productLastName, String productFullName, String productTitle) {
        this.productEmployeeID = new SimpleStringProperty(productEmployeeID);
        this.productEmployeeNumber = new SimpleStringProperty(productEmployeeNumber);
        this.productFirstName = new SimpleStringProperty(productFirstName);
        this.productLastName = new SimpleStringProperty(productLastName);
        this.productFullName = new SimpleStringProperty(productFullName);
        this.productTitle = new SimpleStringProperty(productTitle);
    }

    public String getProductEmployeeID() {
        return productEmployeeID.get();
    }

    public void setProductEmployeeID(String productEmployeeID) {
        this.productEmployeeID = new SimpleStringProperty(productEmployeeID);
    }

    public String getProductEmployeeNumber() {
        return productEmployeeNumber.get();
    }

    public void setProductEmployeeNumber(String productEmployeeNumber) {
        this.productEmployeeNumber = new SimpleStringProperty(productEmployeeNumber);
    }

    public String getProductFirstName() {
        return productFirstName.get();
    }

    public void setProductFirstName(String productFirstName) {
        this.productFirstName = new SimpleStringProperty(productFirstName);
    }

    public String getProductLastName() {
        return productLastName.get();
    }

    public void setProductLastName(String productLastName) {
        this.productLastName = new SimpleStringProperty(productLastName);
    }

    public String getProductFullName() {
        return productFullName.get();
    }

    public void setProductFullName(String productFullName) {
        this.productFullName = new SimpleStringProperty(productFullName);
    }

    public String getProductTitle() {
        return productTitle.get();
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = new SimpleStringProperty(productTitle);
    }
}
