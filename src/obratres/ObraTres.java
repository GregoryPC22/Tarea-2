/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obratres;

import Interface.Obra2;
import Interface.Obra3;
import javafx.application.Application;

/**
 *
 * @author pc
 */
public class ObraTres /*extends Application*/ {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception{
        Application.launch(Obra3.class, args);//Obra 3
        Application.launch(Obra2.class, args);//Obra 2
        //launch(args);
    }

    
}
