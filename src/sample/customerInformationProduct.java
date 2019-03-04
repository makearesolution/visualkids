package sample;

import javafx.beans.property.SimpleStringProperty;

public class customerInformationProduct {
    private SimpleStringProperty CustomerIDProduct;
    private SimpleStringProperty DrvLicNumberProduct;
    private SimpleStringProperty FullNameProduct;
    private SimpleStringProperty AddressProduct;
    private SimpleStringProperty CityProduct;
    private SimpleStringProperty StateProduct;
    private SimpleStringProperty ZIPCodeProduct;

    public customerInformationProduct(String customerIDProduct, String drvLicNumberProduct, String fullNameProduct, String addressProduct, String cityProduct, String stateProduct, String ZIPCodeProduct) {
        CustomerIDProduct = new SimpleStringProperty(customerIDProduct);
        DrvLicNumberProduct = new SimpleStringProperty(drvLicNumberProduct);
        FullNameProduct = new SimpleStringProperty(fullNameProduct);
        AddressProduct = new SimpleStringProperty(addressProduct);
        CityProduct = new SimpleStringProperty(cityProduct);
        StateProduct = new SimpleStringProperty(stateProduct);
        this.ZIPCodeProduct = new SimpleStringProperty(ZIPCodeProduct);
    }

    public String getCustomerIDProduct() {
        return CustomerIDProduct.get();
    }

    public void setCustomerIDProduct(String customerIDProduct) {
        CustomerIDProduct = new SimpleStringProperty(customerIDProduct);
    }

    public String getDrvLicNumberProduct() {
        return DrvLicNumberProduct.get();
    }

    public void setDrvLicNumberProduct(String drvLicNumberProduct) {
        DrvLicNumberProduct = new SimpleStringProperty(drvLicNumberProduct);
    }

    public String getFullNameProduct() {
        return FullNameProduct.get();
    }

    public void setFullNameProduct(String fullNameProduct) {
        FullNameProduct = new SimpleStringProperty(fullNameProduct);
    }

    public String getAddressProduct() {
        return AddressProduct.get();
    }

    public void setAddressProduct(String addressProduct) {
        AddressProduct = new SimpleStringProperty(addressProduct);
    }

    public String getCityProduct() {
        return CityProduct.get();
    }

    public void setCityProduct(String cityProduct) {
        CityProduct = new SimpleStringProperty(cityProduct);
    }

    public String getStateProduct() {
        return StateProduct.get();
    }

    public void setStateProduct(String stateProduct) {
        StateProduct = new SimpleStringProperty(stateProduct);
    }

    public String getZIPCodeProduct() {
        return ZIPCodeProduct.get();
    }

    public void setZIPCodeProduct(String ZIPCodeProduct) {
        this.ZIPCodeProduct = new SimpleStringProperty(ZIPCodeProduct);
    }
}
