package producer_consumer;

public class App {
    public static void main(String[] args) {
        shareResource resource = new shareResource();
        new Thread(new Producer(resource)).start();new Thread(new Consumer(resource)).start();
    }
}
