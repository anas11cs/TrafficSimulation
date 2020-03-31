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
public class SignalSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
            // MY(17L-4252) COMMENTS
            // CTRL+SHIFT+DELETE = STOP the run file that donot have exit point
            // I HAVE MADE A PIAZZA HAVING 4 SIDES
            Piazza newYorkTimesSquare = new Piazza();
        while(true){
            // PIAZZA'S 4 SIGNALS ARE BEING SHIFTED TURN WISE[N->E->S->W->REPEAT]
            // BUT HOW FREQUENTLY THEY CHANGE DEPENDS ON THE CARS ON CURRENT SIGNAL,the delay is added accordingly
            // IF THERE ARE NO CARS AS SAID IN ASSIGNMENT SIGNAL WILL BE SHIFTED WITH WAIT OF 5 SECONDS
            newYorkTimesSquare.showSignalState();
            newYorkTimesSquare.changeSignalState();
            newYorkTimesSquare.getSignalState();
        }
    }
}
