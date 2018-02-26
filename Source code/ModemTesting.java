
interface Modem {
  public boolean open();                               
  public boolean close();
  public int read ();
  public int write();

}

class MindStickModem implements Modem {
                     public boolean open() {

                             System.out.println("Starting MindStick Modem");                             
                             return true;
                     }

                     public boolean close() {

                             System.out.println("Closing MindStick Modem");
                             return true;

                     }

                     public int read() {

                             System.out.println("Reading a MindStick modem");
                             return 100;

                     }

                     public int write() {

                             System.out.println("Writing a MindStick modem");
                             return 100;

                     }

}

class HuaweiModem implements Modem {
                     public boolean open() {

                             System.out.println("Starting Huawei Modem");                             
                             return true;
                     }

                     public boolean close() {

                             System.out.println("Closing Huawei Modem");
                             return true;

                     }

                     public int read() {

                             System.out.println("Reading a Huawei modem");
                             return 500;

                     }

                     public int write() {

                             System.out.println("Writing a Huawei modem");
                             return 500;

                     }

}

public class ModemTesting {

public static void main(String args[]){

Modem modem1 = new MindStickModem();
modem1.open();
modem1.write();
modem1.read();
modem1.close();


Modem modem2 = new HuaweiModem();
modem2.open();
modem2.write();
modem2.read();
modem2.close();
modem2.close();

        }
}