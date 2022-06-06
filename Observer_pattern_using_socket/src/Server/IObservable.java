package Server;

import java.io.IOException;

public interface IObservable {
    void addObserver(IObserver newObserver);
    void removeObserver(IObserver observer);
    void notifyObserver(String message) throws IOException;
}
