//Program to demonstrate  inter-thread communication
package corejava;

class BankTransaction {
	int balance = 5000;

	synchronized void withdraw(int amt) {
		if (amt > balance) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		balance = balance - amt;
		System.out.println("Amount withdrawn successfully: " + amt);
		System.out.println("Remaining Balance Amount : " + balance);

	}

	synchronized void deposit(int amt) {
		balance = balance + amt;
		System.out.println("Amount deposited Successfully: " + balance);
		notify();

	}
}

public class DemoInterThread {

	public static void main(String[] args) {
		final BankTransaction bt = new BankTransaction();
		new Thread() {
			public void run() {
				bt.withdraw(10000);
			}
		}.start();
		new Thread() {
			public void run() {
				bt.deposit(20000);
			}
		}.start();

	}

}
