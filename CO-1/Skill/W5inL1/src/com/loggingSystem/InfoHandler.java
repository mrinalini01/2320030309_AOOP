package com.loggingSystem;

class InfoHandler extends LogHandler {
    @Override
    public void handle(LogLevel level, String message) {
        if (level == LogLevel.INFO) {
            System.out.println("INFO: " + message);
        } 
        else if (next != null) {
            next.handle(level, message);
        }
    }
}

