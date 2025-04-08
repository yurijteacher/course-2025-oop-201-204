package ua.com.kneu.groupe_203.lab4.behavioral.observer;

// інтерфейс видавця
public interface Publisher {

    // Додавання підписника (спостерігача)
    void addObserver(Observer observer);

    // Видалення підписника (спостерігача)
    void removeObserver(Observer observer);

    // повідомлення підписникам
    void notifyObservers();
}
