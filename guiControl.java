package main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.text.Text;

public class guiControl extends Application {
	
	int[] cardNumber = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,};
	int[] suit = new int[] {1, 2, 3, 4};
	//1 = Clubs
	//2 = Diamonds
	//3 = Spades
	//4 = Hearts
	
	Color cardBacking = Color.rgb(31, 97, 141);
	Color board = Color.rgb(169, 204, 227);
	
	public Shape cardBack(Group c, int x, int y) {
		Rectangle n = new Rectangle();
		Rectangle cardBack = new Rectangle(60, 90);
		cardBack.setX(x - 30);
		cardBack.setY(y - 45);
		cardBack.setFill(Color.WHITE);
		cardBack.setStroke(cardBacking);
		cardBack.setStrokeWidth(10);
		
		Rectangle patterning = new Rectangle(40, 60);
		patterning.setX(x - 20);
		patterning.setY(y - 30);
		patterning.setFill(cardBacking);
		patterning.setArcWidth(20);
		patterning.setArcHeight(20);
		
		c.getChildren().add(cardBack);
		c.getChildren().add(patterning);
		
		//null to avoid errors
		return n;
	}
	
	public Shape cardFront(int num, int suit, Group c, int x, int y) {
		Rectangle n = new Rectangle();
		Rectangle cardFront = new Rectangle(70, 100);
		cardFront.setX(x - 35);
		cardFront.setY(y - 50);
		cardFront.setFill(Color.WHITE);
		if (suit == 2 || suit == 4) {
			//cardFront.setStroke(Color.RED);
			//cardFront.setStrokeWidth(5);
			
			c.getChildren().add(cardFront);
		}
		
		return n;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Card Testing (To be Changed)");
		Group root = new Group();
		primaryStage.setScene(new Scene(root, 800, 800, board));
		
		
		Text test = new Text();
		test.setText("Test");
		test.setX(10);
		test.setY(10);
		
		Shape back = cardBack(root, 60, 60);
		Shape cardTestOne = cardFront(5, 2, root, 140, 60);
		//root.getChildren().add(back);
		//root.getChildren().add(test);
		primaryStage.show();
	}
	
	public void handle(ActionEvent event) {
		;
	}
}