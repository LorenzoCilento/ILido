package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class indexView extends Application {

	
	private int width;
	private int height;
	private ArrayList<Button> listButtons;
	
	public indexView() {
		setDimensionAtView();
		listButtons = new ArrayList<Button>();
	}
	
	@Override
	public void start(Stage primaryStage) {
		
		Group root = new Group();
		addButtonAtListButtons(NameButtons.My_Lido.toString());
		addButtonAtListButtons(NameButtons.Settings.toString());
		addButtonAtListButtons(NameButtons.InitialSetup.toString());
		addButtonAtListButtons(NameButtons.Exit.toString());
		
		Scene scene = new Scene(root, width, height, Color.BLACK);
		insertAndAdaptButtonInView(root);
		primaryStage.setTitle("JavaFX Scene Graph Demo");
		primaryStage.setScene(scene);
		primaryStage.setMaximized(true);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	private void setDimensionAtView(){
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.width = dim.width;
		this.height = dim.height;		
	}
	
	public void addButtonAtListButtons(String name){
		Button b = new Button(name);	
		b.setPrefSize(width/10, Math.abs((height/NameButtons.class.getDeclaredFields().length) - 100) );
		addListenerAtButton(b);
		listButtons.add(b);		
	}
	
	public void insertAndAdaptButtonInView(Group root){
		
		int element = listButtons.size();
		
		GridPane box = new GridPane();
		int i=0;
		for(Button b : listButtons){
			box.add(b, 0, i);
			i++;
		}
		
		box.setLayoutX(width/3);
		box.setLayoutY(height/element);
		
		root.getChildren().add(box);
	}
	
	public void addListenerAtButton(final Button b){
		
		String nameBtn = b.getText();
		
		if(nameBtn.equals(NameButtons.My_Lido.toString())){
			b.setOnAction(e -> b.setText("premuto"));
		}
		else if(nameBtn.equals(NameButtons.Settings.toString())){
			b.setOnAction(e -> b.setText("premuto"));
		}
		else if(nameBtn.equals(NameButtons.InitialSetup.toString())){
			b.setOnAction(e -> b.setText("premuto"));
		}
		else if(nameBtn.equals(NameButtons.Exit.toString())){
			b.setOnAction(e -> b.setText("premuto"));
		}
		
	}
	
}
