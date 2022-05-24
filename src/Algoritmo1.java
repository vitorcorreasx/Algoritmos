public class Algoritmo1 {
  public static void main(String[] args) {
    int a = 1;
    int b = 3;
    int c = 2;

    if (a > b && a > c) {
      System.out.println("A é o maior: " + a);
    } else if (b > c) {
      System.out.println("B é o maior: " + b);
    } else {
      System.out.println("C é o maior: " + c);
    }
    if (a < b && a < c) {
      System.out.println("A é o menor: " + a);
    } else if (b < c) {
      System.out.println("B é o menor: " + b);
    } else {
      System.out.println("C é o menor: " + c);
    }
  }
}
