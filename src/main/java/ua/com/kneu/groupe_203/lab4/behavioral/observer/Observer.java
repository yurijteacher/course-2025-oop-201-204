package ua.com.kneu.groupe_203.lab4.behavioral.observer;

import java.util.List;

// інтерфейс спостерігача(підписника), який очікуєдані від publisher'a.
public interface Observer {

    // Обробка подій (приймає список вакансій)
    void handleEvent(List<String> vacancies);

}
