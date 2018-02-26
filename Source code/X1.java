
	import java.io.*;

	class X1 {

   		public static void main(String args[]) {

    			//System.out.println(args[0]);
  
    			//System.out.println(args[1]);
                try {

    		FileInputStream f = new FileInputStream("Input.txt");
        	f.read();
  
                }

    		catch(FileNotFoundException fe) {

        		System.out.println(fe);

                }

                catch(IOException ie) {

                       System.out.println(ie);
               }

	}
}