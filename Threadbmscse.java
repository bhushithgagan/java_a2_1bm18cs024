import java.util.*;
class thread1 implements Runnable {
	Thread t;
	thread1() {
	t = new Thread (this,"T1");
	t.start();
	}
	public void run () {
	while(true) {
	System.out.println("BMSCE\n");
	try {
	Thread.sleep(10000);
	}
	catch(InterruptedException e){
	System.out.println("BMS thread interrupted\n");
	}
	}
	}
}

class thread2 implements Runnable {
	Thread t;
	thread2() {
	t = new Thread(this,"T2");
	t.start();
	}
	public void run () {
	while(true) {
	System.out.println("CSE\n");
	try {
	Thread.sleep(2000);
	}
	catch(InterruptedException e) {
	System.out.println("CSE thread interrupted\n");
	}
	}
	}
}

class Threadbmscse {
	public static void main(String args[]) {
	Thread ob = new Thread();
	new thread1();
	new thread2();
	}
}
