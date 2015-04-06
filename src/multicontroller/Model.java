/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multicontroller;

import static multicontroller.PrimaryViewController.counter;

/**
 *
 * @author Brian
 */
public class Model {
    static int counter = 0;
    int myCounter;
    
    public Model() {
        myCounter = counter++;
        System.out.println("Model::ctor() " + myCounter);
    }
    public int getMyCounter() {
        return myCounter;
    }
}
