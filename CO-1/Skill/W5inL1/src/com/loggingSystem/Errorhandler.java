package com.loggingSystem;

class ErrorHandler extends LogHandler {
    @Override
    public void handle(LogLevel level, String message) {
        if (level == LogLevel.ERROR) {
            System.out.println("ERROR: " + message);
        } 
        else if (next != null) {
            next.handle(level, message);
        }
    }
}
