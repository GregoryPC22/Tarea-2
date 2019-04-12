package Interface;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Obra2 extends Application{
    
    private final int WIDTH = 596;
    private final int HEIGHT = 600;
    private Pane pane;
    private Scene scene;
    private Canvas canvas;
    int circle=0;
    int count=1;
    float flo=1;
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Graphics");
        initComponents(primaryStage);
        primaryStage.show();
    }

    //inicializo componentes
    private void initComponents(Stage primaryStage) {
        //creo el pane y el scene para el primary stage
        this.pane = new Pane();
        this.scene = new Scene(this.pane, WIDTH, HEIGHT);
        
        //lienzo para pintar
        this.canvas = new Canvas(WIDTH, HEIGHT);
        this.pane.getChildren().add(this.canvas);
        GraphicsContext gc = this.canvas.getGraphicsContext2D();
        draw(gc, 1000, 1000);
        
        primaryStage.setScene(this.scene);
    }

    private void draw(GraphicsContext gc, int x, int z) {
        if(z>0){
            if(count%2==0){
                gc.setStroke(Color.rgb(230, 1, 242));
            }
            else{
                gc.setStroke(Color.rgb(1, 1, 1));
            }
            gc.strokeRect(1+z, 1+z, 1000+circle, 1000+circle);
            count++;
            circle+=10;
            draw(gc, x-=5, z-=5);
            
        }
    }
    
}
