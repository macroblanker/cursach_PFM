module com.pfm.pfm {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.pfm.pfm to javafx.fxml;
    exports com.pfm.pfm;
}