/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_presencial_unidad2;

import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author invitado
 */
public class EXAMEN_PRESENCIAL_UNIDAD2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
      int Numero1;
        int CPU;
        System.out.println("ESCOGE 1 PARA PIEDRA 2 PARA PAPEL Y 3 PARA AGUILA");
        Scanner captu = new Scanner(System.in);
        Numero1 = captu.nextInt();
        CPU = (int) (Math.random()/3);
        if (Numero1 == 1)
            System.out.println("Piedra");
        else if (Numero1 == 2)
            System.out.println ("Papel");
        else if (Numero1 == 3)
            System.out.println ("Tijeras ");
        
        Double Juego;
        Juego = Math.random();
        System.out.println("La eleccion del juego = " + Juego);
        if(Juego == 1)
        System.out.println("Piedra");
        else if (Numero1 == 2)
        System.out.println("Papel");
        else if (Numero1 == 3)
            System.out.println("Tijeras");
        
      if(Numero1 == CPU) 
                System.out.println("Ganaste!");
             else 
                System.out.println("Empate!");
   
                
                   
            

   }}

     
    
 
     
       
        
     
    

