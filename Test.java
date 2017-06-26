package session8_assignment1;
 class ThreadDemo extends Thread {
	//overriding run method of thread class
	@Override
	public void run(){
		super.run();
		try {
			//timeout message print after small duration for ten times
			for(int i=1;i<=10;i++){
			Thread.sleep(1000);				
				System.out.println("countdown Time Out"+" "+i);
			    }
			}
		 catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
public class Test {
public static void main(String[] args) {
//creating object and start method of thread class is use to start the thread
ThreadDemo t=new ThreadDemo();
	t.start();
 }	
}