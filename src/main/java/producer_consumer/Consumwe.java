package producer_consumer;

class Consumer implements Runnable {
    private shareResource resource = null;
    public Consumer(shareResource resource)
    {
        this.resource = resource;
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
            resource.popup();
        }
    }
}
