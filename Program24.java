// java program to demonstrate daemon thread 

class DaemonThread extends Thread{
	public DaemonThread ( String name ) {
		super(name);
	}
	public void run () {
		if (Thread.currentThread().isDaemon()) {
			System.out.println( getName() + " is a Daemon Thread ");
		}
		else {
			System.out.println( getName() + " is not a daemon thread it is a user thread ");
		}
	}
}

public class Program24 {

	public static void main(String[] args) {
		System.out.println("This program is solved by Niraj Ramnani roll no 114");
		DaemonThread t1 = new DaemonThread("t1");
		DaemonThread t2 = new DaemonThread("t2");
		DaemonThread t3 = new DaemonThread("t3");
		t1.setDaemon(true); 
		t2.setDaemon(true); 
		t1.start();
		t2.start();
		t3.start();
	}

}
