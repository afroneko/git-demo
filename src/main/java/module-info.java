module com.lisa.gitdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lisa.gitdemo to javafx.fxml;
    exports com.lisa.gitdemo;
}