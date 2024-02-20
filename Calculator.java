import java.util.*;
Class Calculator{
    void addition(int num1, int num2){
        System.out.println(num1+num2);
    }
    void subtraction(it num1, int num2){

    }
    public static void main(String[] args){
        Scanner scanner=new Scanner();
        int num1, num2;
        System.out.println("Input two numbers for performing mathematical operations");
        num1=scanner.nextInt();
        num2=scanner.nextInt();
        addition(num1, num2);
        subtraction(num1, num2);
    }
}