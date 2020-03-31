/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signalsimulation;
import java.util.LinkedList; 
import java.util.Queue; 
/**
 *
 * @author DELL
 */
public class South implements SignalState{
        South signal = new South();
        Queue<Car> Cars=new LinkedList<>();

    private South() {
    }
    
    
    public  South getInstance()
    {
        openTraffic();
        return signal;
    }
    @Override
    public SignalState nextState()
    {
        return West.getInstance();
    }
    @Override
    public void showState() {
        System.out.println("South Signal");
    }
    @Override
    public void signalstatus()
    {
        
    }
    @Override
    public int timeToClearCars()
    {
        return 0;
    }
    public void openTraffic()
    {
            Light light = new Light();
        while(true){
            light.showState();
            light.changeState();
            light.getState();
        }
    }
}
