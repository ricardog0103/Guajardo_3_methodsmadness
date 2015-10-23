/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodmadness;


 
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
 
public class Guajardo_3_MethodMadness extends Application {
 
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(1000, 1000);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        backGround(gc);
        inerLines(gc);
        outerlines(gc);
        draw4Circles(gc);
        drawRectAndCircle(gc);
       
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    
    private void draw4Circles(GraphicsContext gc)  {
        gc.setFill(Color.BLUE);
        gc.setStroke(Color.RED);
        gc.fillOval(0, 20, 200, 200);
        gc.fillOval(0,750, 200, 200);
        gc.fillOval(800, 20,200, 200);
        gc.fillOval(800, 750, 200, 200);
     }
    private void outerCircles(GraphicsContext gc)  {
        gc.setFill(Color.RED);
      
        gc.fillOval(-5, 13, 210, 210);
        
        gc.fillOval(-5,750, 210, 210);
        gc.fillOval(800, 20,200, 200);
        gc.fillOval(800, 750, 200, 200);
     }
   
    
    private void outerlines(GraphicsContext gc) {
        gc.setFill(Color.GOLD);
        gc.setStroke(Color.RED);
        gc.fillRoundRect(50, 160, 100,630, 50, 50);
        gc.fillRoundRect(855, 160, 100,630, 50, 50);
        gc.fillRoundRect(50, 75, 850,100, 50, 50);
        gc.fillRoundRect(50, 800, 850,100, 50, 50);
        
    }
    private void inerLines(GraphicsContext gc) {
        gc.setFill(Color.MEDIUMTURQUOISE);
        gc.fillRoundRect(50, 400, 305,100, 50, 50);
        gc.fillRoundRect(600, 400, 350,100, 50, 50);
        gc.fillRoundRect(430, 160, 100,200, 50, 50);
        gc.fillRoundRect(430, 585, 100,230, 50, 50);
    }
    
    private void backGround(GraphicsContext gc) {
        gc.setFill(Color.LIME);
        gc.fillRoundRect(-200, -5, 10000, 10000, 500, 500);

    }
    
    private void drawRectAndCircle(GraphicsContext gc) {
        gc.setFill(Color.BLUE);
        gc.setStroke(Color.BLUE);
        gc.fillRoundRect(325, 300, 300, 300, 50, 50);
        gc.strokeRoundRect(325, 300, 300, 300, 50, 50);
        gc.setFill(Color.RED);
        gc.fillOval(320, 300,300,270 );
    }

    
}
     //void is a return tyIn the  project MethodMadness we had to create a picture on javaFX. To be honest i didn't know what do, i didn't know where to start.But that's why i think my project is cool because it came from someone who didn't have no clue of what to do. So after i started playing with the example you gave us i wanted to create was a circle inside a square. To do this i created a method that i called Private void drawRectAndCircle(gc); this public method is calling a private method Private void drawRectAndCircle(GraphicsContext gc); that is encapsulated..
