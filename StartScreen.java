/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coincollector;
 import java.awt.*;
 import javax.swing.JFrame;
/**
 *
 * @author samue
 */
public class StartScreen {
    Canvas startMenu = new Canvas();
    Dimension winSize = new Dimension(100, 100); //The size of the window
    public void displayScreen(){
        startMenu.setSize(100,100);
        JFrame startWindow = new JFrame();
        startWindow.setSize(winSize);
        startWindow.setVisible(true);
        
        String startTxt = "Play"; //Text for the Start button
        String highScore = "High Scores"; //Text for the High Scores
    }
    public void stopDisplay(JFrame j){
        j.dispose();
    }
}
