/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.elevator;

/**
 *
 * @author ASUS
 */
public class Elevator {
    public boolean doorOpen = false;
    public int currentFloor = 5;
    public final int TOP_FLOOR = 5;
    public final int BOTTOM_FLOOR = 1;
    
    public void openDoor() {
        System.out.println("Opening Door.");
        doorOpen = true;
        System.out.println("Door is open.");
    }
    
    public void closeDoor() {
        System.out.println("Closing Door.");
        doorOpen = false;
        System.out.println("Door is closed.");
    }
    
    public void goUp() {
        if (currentFloor < TOP_FLOOR) {
            System.out.println("Going up one floor.");
            currentFloor++;
            System.out.println("Floor: " + currentFloor);
        } else {
            System.out.println("Already at the top floor.");
        }
    }
    
    public void goDown() {
        if (currentFloor > BOTTOM_FLOOR) {
            System.out.println("Going down one floor.");
            currentFloor--;
            System.out.println("Floor: " + currentFloor);
        } else {
            System.out.println("Already at the bottom floor.");
        }
    }
    
    public void setFloor(int desiredFloor) {
        while (currentFloor != desiredFloor) {
            if (currentFloor < desiredFloor) {
                goUp();
            } else {
                goDown();
            }
        }
    }

    public int getFloor() {
        return currentFloor;
    }
    
    public boolean checkDoorStatus() {
        return doorOpen;
    }
}
