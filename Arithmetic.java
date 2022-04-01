package project.practice;
import java.util.Scanner;
class Arithmetic {
  public static void main(String[] args) {

    char operator;
    int a, b;
    int add;
    int subtract;
    double multiply;
    float divide;
    Scanner input = new Scanner(System.in);

    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    System.out.println("Enter a");
    a = input.nextInt();

    System.out.println("Enter b");
    b = input.nextInt();

    switch (operator) {

      case '+':
        add = a + b;
        System.out.println("answer is = " + add);
        break;

      case '-':
        subtract = a - b;
        System.out.println("answer is = " + subtract);
        break;

      case '*':
        multiply = a * b;
        System.out.println("answer is = " + multiply);
        break;

      case '/':
        divide = a / b;
        System.out.println("answer is  = " + divide);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}
