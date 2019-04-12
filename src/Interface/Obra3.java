/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author pc
 */
public class Obra3  extends Application{
   
       
    private final int WIDTH = 700;//ancho
    private final int HEIGHT = 500;//alto
    private Pane pane;
    private Scene scene;
    private Canvas canvas;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Obra Tres, paísaje");
         
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
        
        draw(gc);
        
        
        primaryStage.setScene(this.scene);
    }

    public void draw(GraphicsContext gc) {//dibujar
        //stroke: El Paint que se aplicará al límite de formas en una operación de trazo. MARGEN
        //fill: El Paint que se aplicará al interior de las formas en una operación de relleno. RELLENO
        /*
        //linea
         gc.strokeLine(25, 25, 175, 25);// Inicio: x,y Final: x,y
         //rectángulo
        gc.strokeRect(25, 50, 150, 100);
        //óvalo sin relleno
        gc.strokeOval(200, 200, 150, 150);
         //rectángulo con esquinas redondeadas
        gc.fillRoundRect(200, 25, 150, 150, 50, 50);
                      // x ,  y -Largo,Alto- rA   rL
        */
       gc.setFill(Color.BLUE);
       //rectángulo        ancho, largo
        gc.fillRect(5,5 , 800, 550);
       
       gc.setFill(Color.BLACK);
        //polígono Aves
        double x[] = new double[]{75, 100, 150, 90, 75};
        double y[] = new double[]{200, 240, 260, 245, 200};
        gc.fillPolygon(x, y, 5);
        double x2[] = new double[]{95, 120, 170, 110, 95}; //+20
        double y2[] = new double[]{190, 220, 240, 230, 190}; //-20
        gc.fillPolygon(x2, y2, 5);
        
        
        
        //Sol
        gc.setFill(Color.YELLOW);
        //óvalo            ancho, alto
        gc.fillOval(500, 2, 240, 220);
        
        gc.setFill(Color.GREEN);
        //óvalo Montañas  ancho, alto
        gc.fillOval(1, 330, 550, 270);
         gc.fillOval(300, 300, 500, 300);
       
         //CASA
         gc.setFill(Color.TOMATO);//   arriba
        double x3[] = new double[]{180, 225, 270, 180}; //+20
        double y3[] = new double[]{349, 310, 349, 349 }; //-20
        gc.fillPolygon(x3, y3, 4);
        gc.setFill(Color.MAROON);
       //rectángulo Casa-ancho, largo
        gc.fillRect(180,350 , 90, 70);
        //puerta
        gc.setFill(Color.TOMATO);
        gc.fillRect(215,380 , 20, 40);
        
        //NUBES
        gc.setFill(Color.ALICEBLUE);
        //óvalo            ancho, alto
        gc.fillOval(245, 50, 70, 50);
        gc.fillOval(275, 50, 70, 50);
        gc.fillOval(260, 65, 70, 50);
        //nube2
        gc.fillOval(120, 45, 70, 50);
        gc.fillOval(150, 45, 70, 50);
        gc.fillOval(140, 55, 70, 50);
        
        
        //ALBOL
        gc.setFill(Color.MAROON);
       //rectángulo         ancho, largo
        gc.fillRect(540,340 , 30, 60);
         gc.setFill(Color.GREENYELLOW);
        //ramas           ancho, alto
        gc.fillOval(520, 320, 40, 25);
        gc.fillOval(545, 320, 40, 25);
        gc.fillOval(535, 305, 40, 25);
        
        
    }

    
    
    
}//END
