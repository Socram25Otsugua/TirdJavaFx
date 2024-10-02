module org.example.tirdjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.tirdjavafx to javafx.fxml;
    exports org.example.tirdjavafx;
}