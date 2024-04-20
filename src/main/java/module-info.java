module com.khanhdew.testjfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires java.desktop;

    opens com.khanhdew.testjfx to javafx.fxml;
    exports com.khanhdew.testjfx;
}