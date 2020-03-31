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
public class West implements SignalState{
        private West signal = new West();
        Queue<Car> Cars=new LinkedList<>();

    private West() {
    }
    
    
    public West getInstance()
    {
        openTraffic();
        return signal;
    }
    @Override
    public SignalState nextState()
    {
        return North.getInstance();
    }
    @Override
    public void showState() {
        System.out.println("West Signal");
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
