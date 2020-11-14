import java.util.Scanner;
public class MyClass {
  public static int temperatureConvert(double fahrenheit) {
    double celsius = fahrenheit * 1.8 + 32; // temperature conversion
    return celsius;
  }
  public static void main(String[] args) {
    Scanner myObj = new.Scanner(System.in);
    System.out.println("Temperature in Fahrenheit:");
    
    double f = myObj.nextLine();
    System.out.println(temperatureConvert(f));
}
