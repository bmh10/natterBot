package api;

import service.IMessageService;

public class MessagingApi {

    private IMessageService messageService;

    public MessagingApi(IMessageService messageService)
    {
        this.messageService = messageService;
    }

    public void send(int fromId, int toId, String message)
    {

    }
}
