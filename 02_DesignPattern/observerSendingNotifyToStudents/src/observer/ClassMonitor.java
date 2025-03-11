package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassMonitor class implements the Subject interface and manages
 * notifications to all students in the class.
 */
public class ClassMonitor implements Subject {
    private List<Observer> observers;

    public ClassMonitor() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    /**
     * Sends a notification to all observers
     * @param message The message to be sent
     */
    public void sendNotification(String message) {
        System.out.println("\nClass Monitor sending notification: " + message);
        notify(message);
    }
}