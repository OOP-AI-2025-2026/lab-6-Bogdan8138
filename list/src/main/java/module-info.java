module ua.opnu.list {
    requires javafx.controls;
    requires javafx.fxml;

    opens ua.opnu.list to javafx.fxml;
    exports ua.opnu.list;
}
