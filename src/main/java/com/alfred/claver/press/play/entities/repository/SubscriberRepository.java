package com.alfred.claver.press.play.entities.repository;

import com.alfred.claver.press.play.entities.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriberRepository extends JpaRepository<Subscriber, String> {
    
}
