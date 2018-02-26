//equality operator

class Classroom1  {

    public static void main (String args[]) {

       Classroom1 c1 = new Classroom1 ();
       Classroom1 c2 = new Classroom1 ();
        System.out.println( c1 == c2);

       String s1 = "Malaysia";
           System.out.println(s1 + "is a country");
             System.out.println(s1);

       String x1 = "Japan";
       String x2 = "Japan";
           System.out.println(x1 == x2);

       String x3 = new String ("Japan");
           System.out.println(x1==x3);
   
      System.out.println(x1.equals(x2));
      System.out.println(x3.equals(x1));
       }
}

class Classroom2 {

      public static void main (String args[]) {

         int x = 5;
         int y = 15;
            System.out.println(x == y);
         x = y;
            System.out.println(x == y);
      }
}

      
 
      