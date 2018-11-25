package pl.sda;


public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5,9));
        System.out.println(calculator.divide(5,0));
    }

}
