
class Multithreading extends Thread {  
  	public void run() {  
    		System.out.println("My thread is in running state.");  
  	}   

  	public static void main(String args[]) {  
     		Multithreading t1 = new Multithreading();   
     		t1.start();  
 	 	}  
}
