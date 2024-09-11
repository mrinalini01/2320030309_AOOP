package com.loggingSystem;

public class Client {
    public static void main(String[] args) {
        // Create handlers
        InfoHandler infoHandler = new InfoHandler();
        DebugHandler debugHandler = new DebugHandler();
        ErrorHandler errorHandler = new ErrorHandler();

        // Set up chain of responsibility
        infoHandler.setNext(debugHandler);
        debugHandler.setNext(errorHandler);

        // Create logger
        Logger logger = new Logger();

        // Create commands with the appropriate handlers
        LogCommand infoCommand = new LogCommand(LogLevel.INFO, "Info message", infoHandler);
        LogCommand debugCommand = new LogCommand(LogLevel.DEBUG, "Debug message", debugHandler);
        LogCommand errorCommand = new LogCommand(LogLevel.ERROR, "Error message", errorHandler);

        // Add commands to logger
        logger.addCommand(infoCommand);
        logger.addCommand(debugCommand);
        logger.addCommand(errorCommand);

        // Process commands
        logger.processCommands();
    }
}

