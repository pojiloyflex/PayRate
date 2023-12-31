package com.hse.java.payrate.view.navigation;

import com.hse.java.payrate.PayRateApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import java.io.IOException;

public class NavigationConfig {
    public static final String LOGIN_SCREEN = "Login.fxml";
    public static final String SIGN_UP_SCREEN = "Registration.fxml";

    public static final String MAIN_SCREEN = "Main.fxml";
    private static final Class<PayRateApplication> applicationClass = PayRateApplication.class;


    public static Scene getScene(String destination) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(applicationClass.getResource(destination));
        return new Scene(fxmlLoader.load(), 1280, 720);
    }
}
