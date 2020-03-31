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
public class North implements SignalState{
        private static North signal = new North();
        Queue<Car> Cars=new LinkedList<>();

    private North() {
    }
    
    
    public static North getInstance()
    {
        opentraffic();
        return signal;
    }
    @Override
    public SignalState nextState()
    {
        return East.getInstance();
    }
    @Override
    public void showState() {
        System.out.println("North Signal");
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
