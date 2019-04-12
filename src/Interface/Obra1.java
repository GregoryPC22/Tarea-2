/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Obra1 extends JPanel{
    int size = 700;
    public Obra1() {
        this.setPreferredSize(new Dimension(size, size));
    } // constructor
    
    private void draw(Graphics g){
        // dibujar los ejes del plano cartesiano
        
        for (int i = 0; i < 900; i++) {
            int color1 = (int) (Math.random() * 255 + 0);
            int color2 = (int) (Math.random() * 255 + 0);
            int color3 = (int) (Math.random() * 255 + 0);
            g.setColor(new Color(color1, color2, color3));    
            int x1 = (int) (Math.random() * (size+20) + 0);
            int y1 = (int) (Math.random() * (size+20) + 0);
            int x2 = (int) (Math.random() * (size+20) + 0);
            int y2 = (int) (Math.random() * (size+20) + 0);
            g.drawLine(x1, y1, x2, y2); 
        }
        
    }
    

   @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);

    }
    
    public static void main(String[] args) {
        JFrame window = new JFrame("Obra #1");
        window.setContentPane(new Obra1());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        window.pack();
        window.setResizable(false);
        window.setLocation(150, 100);
        window.setVisible(true);      
        
    }  

} 



