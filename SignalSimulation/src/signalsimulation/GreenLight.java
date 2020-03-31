/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signalsimulation;

/**
 *
 * @author DELL
 */
public class GreenLight implements State{
    
     private static GreenLight light = new GreenLight();
    
    private GreenLight(){
    }
    public static GreenLight getInstance(){
        return light;
    }
    
    @Override
    public State nextState(){
        return RedToYellow.getInstance();
    }

    @Override
    public void showState() {
        System.out.println("Green Light");
    }
    
}