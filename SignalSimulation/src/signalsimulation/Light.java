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
public class Light {
    
    public State state;
   
    public Light(){
        state = RedLight.getInstance();
    }
    public void changeState(){
        
        state = state.nextState();
    }

    public void showState() {
        state.showState();
    }
    public State getState() {
        return state;
    }
    public void GetSignalStatus(){
        state.showState();
    }
}

