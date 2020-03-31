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
    public class YellowToGreen implements State {
    
    private static YellowToGreen light = new YellowToGreen();
    
    private YellowToGreen(){
    }
    public static YellowToGreen getInstance(){
        return light;
    }
    @Override
    public State nextState(){
        return GreenLight.getInstance();
    }
    @Override
    public void showState() {
        System.out.println("Yellow Light");
    }
}
