package observer;

/**
 * Observer interface defines the contract for all observers (students)
 * in the notification system.
 */
public interface Observer {
    /**
     * Update method is called when the subject (ClassMonitor) sends a notification
     * @param notification The message to be received by the observer
     */
    void update(String notification);
}