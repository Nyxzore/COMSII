//package s2950668;

import java.util.Scanner;
public class Program {
 public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     Dog[] dogs = new Dog[5];

     for (int i = 0; i < 5; i++) {
         String name = in.nextLine();
         
         String age_string = in.nextLine();
         int age = Integer.parseInt(age_string);
         
         dogs[i] = new Dog(name, age);
     }

     for (int i = 0; i < 5; i++) {
         dogs[i].bark();
     }
     
     in.close();
 }
}
