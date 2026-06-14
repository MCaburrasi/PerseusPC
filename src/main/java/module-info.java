module caburrasi.marcos.perseus {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;
    requires java.logging;
    requires java.rmi;

    opens caburrasi.marcos.perseus to javafx.fxml;
    exports caburrasi.marcos.perseus;

    exports caburrasi.marcos.perseus.mainscreen;
    opens caburrasi.marcos.perseus.mainscreen to javafx.fxml;
}