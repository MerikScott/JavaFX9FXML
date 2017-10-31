package sample;

import javafx.scene.control.Button;

public class Controller {

    public Button button;

    public void handleButtonClick() {
        System.out.println("User");
        button.setText("Stop it ");
    }
}
