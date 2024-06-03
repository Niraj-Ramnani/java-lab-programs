// java program to show inter thread communication 

class Item  {
	boolean produced = false ;
	public synchronized void produce () {
		while (produced) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Producer: Producing the item...");
        produced = true; 
        System.out.println("Producer: Waiting for consumer to consume the item...");
        notify();
	}
	public synchronized void consume() {
		while (!produced) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consumer: Consuming the item...");
        produced = true; 
        System.out.println("Consumer: Waiting for producer to produce the item...");
        notify();
	}
}
class Producer extends Thread {
    Item obj;

    public Producer(Item obj) {
        this.obj = obj;
    }

   
    public void run() {
        obj.produce();
    }
}

class Consumer extends Thread {
    Item obj;

    public Consumer(Item obj) {
        this.obj = obj;
    }

   
    public void run() {
        obj.consume();
    }
}

public class Program25 {
    public static void main(String[] args) {
    	System.out.println("This program is solved by Niraj Ramnani roll no 114");
        Item item = new Item(); 
        Producer producer = new Producer(item);
        Consumer consumer = new Consumer(item);

        producer.start(); 
        consumer.start(); 
    }
}
	 

	