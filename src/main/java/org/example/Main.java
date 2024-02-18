package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую сторону треугольника (a)");
        int a = scanner.nextInt();
        System.out.println("Введите вторую сторону треугольника (b)");
        int b = scanner.nextInt();
        System.out.println("Введите третию сторону треугольника (c)");
        int c = scanner.nextInt();
        if ((a*a+b*b == c*c) || (b*b+c*c ==a*a  )|| (c*c+a*a==b*b)){
            System.out.println("a, b и c являются сторонами прямоугольного треугольника");
        }
        else if((a==b) && (b==c) && (a==c)){
            System.out.println("a, b и c являются сторонами равностороннего треугольника");
        }
        else if(a==b || (b==c) || (c==a)){
            System.out.println("a, b и c являются сторонами равнобедренного треугольника");
        }
        else if((a+b<=c)|| (b+c<=a) || (c+a<=b)){
            System.out.println("a, b и c не являются сторонами треугольника" );
        }
        else {
            System.out.println("a, b и c являются сторонами обычного треугольника");
        }
        }
    }
