package ed.lab;

import java.util.HashMap;
import java.util.Map;

public class E02Logger {
    public final Map<String, Integer> messageTime;

    public E02Logger() {
        this.messageTime = new HashMap<>();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        if (!messageTime.containsKey(message) || timestamp >= messageTime.get(message)) {
            messageTime.put(message, timestamp + 10);
            return true;
        }
        return false;
        }
}
