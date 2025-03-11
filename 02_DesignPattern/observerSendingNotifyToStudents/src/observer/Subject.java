package observer;

/**
 * Subject interface defines the contract for the subject (ClassMonitor)
 * in the notification system.
 */
public interface Subject {
    /**
     * Attaches an observer to the subject
     * @param observer The observer to be attached
     */
    void attach(Observer observer);

    /**
     * Detaches an observer from the subject
     * @param observer The observer to be detached
     */
    void detach(Observer observer);

    /**
     * Notifies all attached observers with a message
     * @param message The message to be sent to all observers
     */
    void notify(String message);
}