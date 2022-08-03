package com.example.demodockerakash;


import com.example.demodockerakash.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    MessageService messageServiceImpl;

    @GetMapping("")
    public String getMessage(){
        return messageServiceImpl.getMessage();
    }
}
