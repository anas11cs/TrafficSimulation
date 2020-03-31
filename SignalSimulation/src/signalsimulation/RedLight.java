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
public class RedLight implements State{
      private static RedLight light = new RedLight();
    
    private RedLight(){
    }
    public static RedLight getInstance(){
        return light;
    }
     @Override
    public State nextState(){
        return YellowToGreen.getInstance();
    }
    @Override
    public void showState() {
        System.out.println("Red Light");
    }
    
}
