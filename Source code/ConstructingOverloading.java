//constructor overloading

class Testing {

    Testing(int x, int y) {
    System.out.println("x" + x + "y" + y);
    }

    Testing(int age, int marks) {
    System.out.println("age" + age + "marks" + marks);
    }

  public static void main(String args[]) {
  
    Testing (7,5);
    Testing (20,200);
  }
}


