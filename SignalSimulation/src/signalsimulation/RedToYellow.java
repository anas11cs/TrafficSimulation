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
public class RedToYellow implements State{
    
     private static RedToYellow light = new RedToYellow();
    
    private RedToYellow(){
    }
    public static RedToYellow getInstance(){
        return light;
    }
    @Override
    public State nextState(){
        return RedLight.getInstance();
    }
    @Override
    public void showState() {
        System.out.println("Yellow Light");
    }
    
}

