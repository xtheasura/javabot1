package com.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public  class bot extends TelegramLongPollingBot{

    

    @Override
    public void onUpdateReceived(Update update) {
       if(update.hasMessage()){
        if(update.getMessage().getText().equals("/start")){
            String text = "Hello" + update.getMessage().getFrom().getFirstName();
            SendMessage message = new SendMessage(update.getMessage().getChatId().toString(),text);
             try {
                execute(message);
                
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

            }
        }
       }
    

    @Override
    public String getBotUsername() {
        return"javapractice1bot";
    }

    @Override
    public String getBotToken() {
        return"";
        }
}



    

