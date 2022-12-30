package Lab8F18JavaFX;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import Lab8F18.CipherGenerator;
import Lab8F18.Wrapper;

public class RandomSequence {

    private Alert alert = new Alert(Alert.AlertType.INFORMATION);

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnGenerate;

    @FXML
    private Button btnQuit;

    @FXML
    private Button btnSubset;

    @FXML
    private TextField txtSeed;

    @FXML
    private TextField txtSize;

    @FXML
    void btnGenerateOnAction(ActionEvent event) {
        int seed = Integer.parseInt(txtSeed.getText());
        int size = Integer.parseInt(txtSize.getText());

        Wrapper wrapper = new Wrapper(size);
        CipherGenerator cg = new CipherGenerator();

        String result = cg.countDistinct(wrapper.makeFixedRandom(), seed).toString();


        alert.setTitle("Generate random subset A-Z");
        alert.setHeaderText(String.format("Count distinct characters out of %d\n", size));
        alert.setContentText(result);
        alert.showAndWait();
    }

    @FXML
    void btnQuitOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void btnSubsetOnAction(ActionEvent event) {
        int seed = Integer.parseInt(txtSeed.getText());
        int size = Integer.parseInt(txtSize.getText());

        Wrapper wrapper = new Wrapper(size);
        CipherGenerator cg = new CipherGenerator();

        String result = cg.countDistinct(wrapper.makeFixedSelection(), seed).toString();


        alert.setTitle("Random subsequence of letters A-Z");
        alert.setHeaderText(String.format("Count distinct characters out of %d\n", size));
        alert.setContentText(result);
        alert.showAndWait();
    }

    @FXML
    void initialize() {
        assert btnGenerate != null : "fx:id=\"btnGenerate\" was not injected: check your FXML file 'random-chars.fxml'.";
        assert btnQuit != null : "fx:id=\"btnQuit\" was not injected: check your FXML file 'random-chars.fxml'.";
        assert btnSubset != null : "fx:id=\"btnSubset\" was not injected: check your FXML file 'random-chars.fxml'.";
        assert txtSeed != null : "fx:id=\"txtSeed\" was not injected: check your FXML file 'random-chars.fxml'.";
        assert txtSize != null : "fx:id=\"txtSize\" was not injected: check your FXML file 'random-chars.fxml'.";

    }

}

