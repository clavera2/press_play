package com.alfred.claver.press.play.service;

import com.alfred.claver.press.play.entities.repository.SubscriberRepository;
import com.alfred.claver.press.play.entities.Subscriber;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;

@Service
public class SubscriberService {   
    private SubscriberRepository repository;

    public SubscriberService(SubscriberRepository repository) {
        this.repository = repository;
    }

    public Subscriber save(Subscriber subscriber) {
        return repository.save(subscriber);
    }

    public Subscriber getSubscriberWith(String id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("no such subscriber"));
    }
}
