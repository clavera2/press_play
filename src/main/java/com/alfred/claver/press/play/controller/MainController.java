package com.alfred.claver.press.play.controller;

import com.alfred.claver.press.play.entities.Subscriber;
import com.alfred.claver.press.play.entities.repository.SubscriberRepository;
import com.alfred.claver.press.play.service.SubscriberService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api")
public class MainController {

    private final SubscriberService service;


    public MainController(SubscriberService subService) {
        this.service = subService;
    }

    @GetMapping("/")
    public String home() {
        return "Hello User! welcome to Press_Play";
    }

    @PostMapping("/subscriber")
    public Subscriber createSubscriber(@RequestBody Subscriber subscriber) {
        return service.save(subscriber);
    }

    @GetMapping("/get-subscriber")
    public Subscriber getSubscriber(@RequestParam String id) {
        return service.getSubscriberWith(id);
    }
}
