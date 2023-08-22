module com.PraktikumPAW {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.PraktikumPAW to javafx.fxml;
    exports com.PraktikumPAW;
}
