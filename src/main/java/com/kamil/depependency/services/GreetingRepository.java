package com.kamil.depependency.services;

import org.springframework.stereotype.Component;

@Component
public interface GreetingRepository {

    String getEnglishGreeting();

    String getSpanishGreeting();

    String getGermanGreeting();
}
