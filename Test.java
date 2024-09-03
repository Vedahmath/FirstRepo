public class Test {
    private int contents;
    private boolean available = false;

    public synchronized int get() {
        while (available == false) {
            try {
                wait();
            } catch (InterruptedException e) { }
        }
        available = false;
        notifyAll();
        return contents;
    }

    public synchronized void put(int value) {
        while (available == true) {
            try {
                wait();
            } catch (InterruptedException e) { }
        }
        contents = value;
        available = true;
        notifyAll();
    }
    public static void main(String a[])
    {
     Test t = new Test();
     new Consumer(t,10).start();
     new Producer(t,10).start();
    }
}
    class Consumer extends Thread {
    private Test test;
    private int number;

    public Consumer(Test c, int number) {
        test = c;
        this.number = number;
    }

    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = test.get();
            System.out.println("Consumer " + this.number + " got: " + value);
        }
    }
}

    class Producer extends Thread {
    private Test test;
    private int number;
 
    public Producer(Test c, int number) {
        test = c;
        this.number = number;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            test.put(i);
            System.out.println("Producer " + this.number
                               + " put: " + i);
            try {
                sleep(1000);
            } catch (InterruptedException e) { }
        }
    }
}
