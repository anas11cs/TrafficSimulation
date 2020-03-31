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
public class East implements SignalState{
    private East signal = new East();
        Queue<Car> Cars=new LinkedList<>();

    private East() {
    }
    
    
    
    public East getInstance()
    {
        openTraffic();
        return signal;
    }
    @Override
    public SignalState nextState()
    {
        return South.getInstance();
    }
    @Override
    public void showState() {
        System.out.println("East Signal");
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
    public  void openTraffic()
    {
            Light light = new Light();
        while(true){
            light.showState();
            light.changeState();
            light.getState();
        }
    }
}
