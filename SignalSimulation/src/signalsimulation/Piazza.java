/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signalsimulation;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author DELL
 */
public class Piazza {
    
//            Light light = new Light();
//        while(true){
//            light.showState();
//            light.changeState();
//            light.getState();
//        }
    
    public SignalState CurrentSignalstate;
   
    public Piazza(){
        CurrentSignalstate = North.getInstance();
    }
    public void changeSignalState()
    {
        long seconds=CurrentSignalstate.timeToClearCars()+5;
        try{
        TimeUnit.SECONDS.sleep(seconds);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        CurrentSignalstate = CurrentSignalstate.nextState();
    }

    public void showSignalState() {
        CurrentSignalstate.showState();
    }
    public SignalState getSignalState() {
        return CurrentSignalstate;
    }
    public void GetSignalStatus(){
        CurrentSignalstate.showState();
    }
    
}
