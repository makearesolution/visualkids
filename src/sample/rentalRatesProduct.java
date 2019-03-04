package sample;

import javafx.beans.property.SimpleStringProperty;

public class rentalRatesProduct {
    private SimpleStringProperty productCategory;
    private SimpleStringProperty productDaily;
    private SimpleStringProperty productWeekly;
    private SimpleStringProperty productMonthly;
    private SimpleStringProperty productWeekend;

    public rentalRatesProduct(String productCategory, String productDaily, String productWeekly, String productMonthly, String productWeekend) {
        this.productCategory = new SimpleStringProperty(productCategory);
        this.productDaily = new SimpleStringProperty(productDaily);
        this.productWeekly = new SimpleStringProperty(productWeekly);
        this.productMonthly = new SimpleStringProperty(productMonthly);
        this.productWeekend = new SimpleStringProperty(productWeekend);
    }

    public String getProductCategory() {
        return productCategory.get();
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = new SimpleStringProperty(productCategory);
    }

    public String getProductDaily() {
        return productDaily.get();
    }

    public void setProductDaily(String productDaily) {
        this.productDaily = new SimpleStringProperty(productDaily);
    }

    public String getProductWeekly() {
        return productWeekly.get();
    }

    public void setProductWeekly(String productWeekly) {
        this.productWeekly = new SimpleStringProperty(productWeekly);
    }

    public String getProductMonthly() {
        return productMonthly.get();
    }

    public void setProductMonthly(String productMonthly) {
        this.productMonthly = new SimpleStringProperty(productMonthly);
    }

    public String getProductWeekend() {
        return productWeekend.get();
    }

    public void setProductWeekend(String productWeekend) {
        this.productWeekend = new SimpleStringProperty(productWeekend);
    }
}
