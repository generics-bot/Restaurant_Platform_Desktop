package restaurant;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import restaurant.model.Product;

import java.util.LinkedList;

public class Main extends Application {

   static LinkedList<LinkedList<Product>> products = new LinkedList<>();
   static LinkedList<Product> cart = new LinkedList<>();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainPage.fxml"));
        primaryStage.setTitle("Restaurant_Desktop");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }

    public static void addProducts(){
        products.add(new LinkedList<>());
        products.add(new LinkedList<>());
        products.add(new LinkedList<>());
        products.add(new LinkedList<>());
        products.add(new LinkedList<>());

        products.get(0).add(Product.DEFAULT_PIZZA);
        products.get(0).add(Product.PIZZA_WITH_SHIT);
        products.get(1).add(Product.SUSPICIOUS_BURGER);
    }
}
