import java.util.Scanner;

class Main{
  public static void main(String[] args){
    // ax^2 + bx + c 
    Scanner scanner = new Scanner(System.in);
    double a,b,c;
    System.out.println("Insert value for a: ");
    a = scanner.nextDouble();
    System.out.println("Insert value for b: ");
    b = scanner.nextDouble();
    System.out.println("Insert value for c: ");
    c = scanner.nextDouble();
    double discriminant = Math.pow(b,2) - 4*a*c;
    if (discriminant > 0){
      double root1 = (-b + Math.sqrt(discriminant)) / 2*a;
      double root2 = (-b - Math.sqrt(discriminant)) / 2*a;
      System.out.println("Root 1 : "+root1);
      System.out.println("Root 2 : "+root2);
    }else if (discriminant == 0){
      System.out.println("Root : " + (-b / 2*a));
    }else{
      System.out.println("The equation has no real roots.");
    }
  }
}
