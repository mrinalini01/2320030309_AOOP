package com.MessageServiceInterface;

public class MyApplication {
    private MessageService messageService;

    // Constructor injection
    public MyApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String recipient) {
        // Delegate the task of sending the message to the message service
        messageService.sendMessage(message, recipient);
    }
}

