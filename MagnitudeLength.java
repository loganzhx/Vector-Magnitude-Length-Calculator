import java.util.Scanner; 

public class VectorLength {
  public static void main( String [ ] args ) {
    double a, b, c;
    Scanner scan = new Scanner( System.in ); 
    System.out.println( "Enter value a of vector (a,b,c): " );
    a = scan.nextDouble(); 
    System.out.println( "Enter value b of vector (a,b,c): " );
    b = scan.nextDouble(); 
    System.out.println( "Enter value c of vector (a,b,c): " );
    c = scan.nextDouble(); 
    System.out.println(Math.sqrt(a*a+b*b+c*c));
      
  }
}