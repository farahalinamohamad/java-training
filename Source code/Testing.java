class Testing {
     
	     int x = 10;
	     static int y = 20;

	     void doIt (){
	         System.out.println("Hi");
     	     }

     
     static void dontDo () {
           System.out.println ("Bye");
     }


	public static void main (String args[]) {

        
            
        Testing t1 = new Testing ();

	System.out.println("x :" + t1.x);

        t1.doIt ();

        //doIt ();  //static

        dontDo (); //called
     }

}

