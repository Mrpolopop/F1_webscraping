module WebScrapping {
    requires transitive javafx.graphics;
    requires transitive javafx.controls;
    requires transitive javafx.fxml;
    requires transitive json.simple;
    requires jdk.dynalink;
    requires java.desktop;

    opens graphique;
}