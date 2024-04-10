module troky.troky {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires java.sql;


    opens troky.troky.controllers.reclamation to javafx.fxml;

    opens troky.troky.FrontOffice.css to javafx.fxml;



    opens troky.troky to javafx.fxml;
    exports troky.troky;


}