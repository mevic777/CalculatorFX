import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @FXML
    private TextField rightNumber;

    @FXML
    private TextField leftNumber;

    @FXML
    private Label resultLabel;


    @FXML
    void decrease(ActionEvent event) {
        if (rightNumber.getText() != null && !rightNumber.getText().isEmpty() &&
                leftNumber.getText() != null && !leftNumber.getText().isEmpty()) {
            Double rightNumberD = Double.parseDouble(String.valueOf(rightNumber.getText()));
            Double leftNumberD = Double.parseDouble(String.valueOf(leftNumber.getText()));
            String result = String.valueOf(rightNumberD - leftNumberD);

            System.out.println(result);
            resultLabel.setText(result);
        } else {
            resultLabel.setText("!!!");
        }
    }
    @FXML
    void divide(ActionEvent event) {
        if (rightNumber.getText() != null && !rightNumber.getText().isEmpty() &&
                leftNumber.getText() != null && !leftNumber.getText().isEmpty()) {
            Double rightNumberD = Double.parseDouble(String.valueOf(rightNumber.getText()));
            Double leftNumberD = Double.parseDouble(String.valueOf(leftNumber.getText()));
            String result = String.valueOf(rightNumberD / leftNumberD);

            System.out.println(result);
            resultLabel.setText(result);
        } else {
            resultLabel.setText("!!!");
        }
    }

    @FXML
    void multiply(ActionEvent event) {
        if (rightNumber.getText() != null && !rightNumber.getText().isEmpty() &&
                leftNumber.getText() != null && !leftNumber.getText().isEmpty()) {
            Double rightNumberD = Double.parseDouble(String.valueOf(rightNumber.getText()));
            Double leftNumberD = Double.parseDouble(String.valueOf(leftNumber.getText()));
            String result = String.valueOf(rightNumberD * leftNumberD);

            System.out.println(result);
            resultLabel.setText(result);
        } else {
            resultLabel.setText("!!!");
        }
    }

    @FXML
    void sum(ActionEvent event) {
        if (rightNumber.getText() != null && !rightNumber.getText().isEmpty() &&
                leftNumber.getText() != null && !leftNumber.getText().isEmpty()) {
            Double rightNumberD = Double.parseDouble(String.valueOf(rightNumber.getText()));
            Double leftNumberD = Double.parseDouble(String.valueOf(leftNumber.getText()));
            String result = String.valueOf(rightNumberD + leftNumberD);

            System.out.println(result);
            resultLabel.setText(result);
        } else {
            resultLabel.setText("!!!");
        }
    }

    @FXML
    void clear(ActionEvent event) {
        rightNumber.setText("");
        leftNumber.setText("");
        resultLabel.setText("");
    }

    @Override
    public void start(Stage mainStage) throws Exception {
        AnchorPane mainContainer = FXMLLoader.load(getClass().getResource("/fxml/calculator.fxml"));

        mainStage.setScene(new Scene(mainContainer));
        mainStage.setTitle("CALCULATOR");
        mainStage.show();
    }
}
