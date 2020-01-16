package com.kamil.depependency.services;

import org.springframework.stereotype.Service;

@Service
public interface GreetingRepository {

    String getEnglishGreeting();

    String getSpanishGreeting();

    String getGermanGreeting();
}
