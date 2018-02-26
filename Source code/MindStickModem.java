public class MindStickModem implements Modem {
                     public boolean open() {

                             System.out.println("Starting Modem");                             
                             return true;
                     }

                     public boolean close() {

                             System.out.println("Closing Modem");
                             return true;

                     }

                     public int read() {

                             System.out.println("Read");
                             return 122;

                     }

                     public int write(byte[] buffer) {

                             System.out.println("Write");
                             return 233;

                     }


public static void main(String args[]){

                    Modem modem1 = new MindStickModem();

                    modem1.open();

                    modem1.write();

                    modem1.read();

modem1.close();

        }
}