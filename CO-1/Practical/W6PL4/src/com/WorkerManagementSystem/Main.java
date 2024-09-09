package com.WorkerManagementSystem;

public class Main {
    public static void main(String[] args) {
        Worker robot = new Robot();
        Worker humanWorker = new Human();
        Eater humanEater = new Human();

        // Robot only works
        robot.work();

        // Human works and eats
        humanWorker.work();
        humanEater.eat();
    }
}

