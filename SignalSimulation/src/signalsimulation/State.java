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
public interface State {
      public State nextState();
      public void showState();
}