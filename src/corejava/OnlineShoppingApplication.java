//Program to demonstrate Inter thread communication for a online shopping application using 2 synchronized methods 
package corejava;

class ProcessingOrder{
	boolean payment=false;
	
	//synchronized method for confirming the order
	synchronized void confirmOrder() {
		if(payment==false) {
			try {
				System.out.println("Please complete the payment of the order");
				wait();
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		if(payment==true) {
			System.out.println("Order confirmed successfully and Ready to be shipped");
			System.out.println("Track the order for further updates");
			
		}
	}
	
	//synchronized method for completing the payment
	synchronized void completePayment(int amt) {
		try {
			System.out.println("Processing payment of :"+amt+"\nplease wait.......");
			Thread.sleep(1000);
			System.out.println("Payment completed successfully");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		payment=true;
		notify();
	}
	
}



public class OnlineShoppingApplication {

	public static void main(String[] args) {
		final ProcessingOrder po = new ProcessingOrder();
		//creating anonymous threads
		new Thread() {
			public void run() {
				po.confirmOrder();
			}
		}.start();
		//creating anonymous threads
		new Thread() {
			public void run() {
				po.completePayment(1000);
			}
		}.start();


	}

}
