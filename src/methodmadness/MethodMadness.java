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
 
public class MethodMadness extends Application {
 
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(1000, 1000);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        example(gc);
        inerLines(gc);
        outerlines(gc);
        draw4Circles(gc);
        drawRectAndCircle(gc);
       
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    
    private void draw4Circles(GraphicsContext gc)  {
        gc.setFill(Color.GOLD);
        gc.setStroke(Color.RED);
        gc.fillOval(0, 20, 200, 200);
        gc.fillOval(0,750, 200, 200);
        gc.fillOval(800, 20,200, 200);
        gc.fillOval(800, 750, 200, 200);
     }
    /*private void outerCircles(GraphicsContext gc)  {
        gc.setFill(Color.RED);
      
        gc.fillOval(-5, 13, 210, 210);
        
        gc.fillOval(-5,750, 210, 210);
        gc.fillOval(800, 20,200, 200);
        gc.fillOval(800, 750, 200, 200);
     }
    */
    
    private void outerlines(GraphicsContext gc) {
        gc.setFill(Color.GOLD);
        gc.setStroke(Color.RED);
        gc.fillRoundRect(50, 160, 100,630, 50, 50);
        gc.fillRoundRect(855, 160, 100,630, 50, 50);
        gc.fillRoundRect(50, 75, 850,100, 50, 50);
        gc.fillRoundRect(50, 800, 850,100, 50, 50);
        
    }
    private void inerLines(GraphicsContext gc) {
        gc.setFill(Color.RED);
        gc.fillRoundRect(50, 400, 305,100, 50, 50);
        gc.fillRoundRect(600, 400, 350,100, 50, 50);
        gc.fillRoundRect(430, 160, 100,200, 50, 50);
        gc.fillRoundRect(430, 585, 100,230, 50, 50);
    }
    
    private void example(GraphicsContext gc) {
        gc.setFill(Color.BLACK);
        gc.fillRoundRect(-200, -5, 10000, 10000, 500, 500);

    }
    
    private void drawRectAndCircle(GraphicsContext gc) {
        gc.setFill(Color.GOLD);
        gc.setStroke(Color.RED);
        gc.fillRoundRect(325, 300, 300, 300, 50, 50);
        gc.strokeRoundRect(325, 300, 300, 300, 50, 50);
        gc.setFill(Color.RED);
        gc.fillOval(320, 300,300,300 );
    }

    
}
      /*  gc.strokeRoundRect(160, 60, 30, 30, 10, 10);
        gc.fillArc(10, 110, 30, 30, 45, 240, ArcType.OPEN);
        gc.fillArc(60, 110, 30, 30, 45, 240, ArcType.CHORD);
        gc.fillArc(110, 110, 30, 30, 45, 240, ArcType.ROUND);
        gc.strokeArc(10, 160, 30, 30, 45, 240, ArcType.OPEN);
        gc.strokeArc(60, 160, 30, 30, 45, 240, ArcType.CHORD);
        gc.strokeArc(110, 160, 30, 30, 45, 240, ArcType.ROUND);
        gc.fillPolygon(new double[]{10, 40, 10, 40},
                       new double[]{210, 210, 240, 240}, 4);
        gc.strokePolygon(new double[]{60, 90, 60, 90},
                         new double[]{210, 210, 240, 240}, 4);
        gc.strokePolyline(new double[]{110, 140, 110, 140},
                          new double[]{210, 210, 240, 240}, 4);
    }

    private void drawLotsOfCircles(GraphicsContext gc, int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
*/