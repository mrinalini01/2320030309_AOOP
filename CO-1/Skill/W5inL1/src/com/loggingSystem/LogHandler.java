package com.loggingSystem;

abstract class LogHandler {
    protected LogHandler next;

    public void setNext(LogHandler next) {
        this.next = next;
    }

    public abstract void handle(LogLevel level, String message);
}

