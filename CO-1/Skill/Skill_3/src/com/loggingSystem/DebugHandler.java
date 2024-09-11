package com.loggingSystem;

class DebugHandler extends LogHandler {
    @Override
    public void handle(LogLevel level, String message) {
        if (level == LogLevel.DEBUG) {
            System.out.println("DEBUG: " + message);
        } 
        else if (next != null) {
            next.handle(level, message);
        }
    }
}

