package com.loggingSystem;

class LogCommand implements Command {
    private LogLevel level;
    private String message;
    private LogHandler handler;

    public LogCommand(LogLevel level, String message, LogHandler handler) {
        this.level = level;
        this.message = message;
        this.handler = handler;
    }

    @Override
    public void execute() {
        if (handler != null) {
            handler.handle(level, message);
        }
    }
}
