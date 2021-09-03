import java.util.Scanner;

public class student{

       int roll;
       String name;
       float marks;
    

      void input(){

         Scanner sc = new Scanner(System.in);
           System.out.println("Enter Student's Roll: ");
           roll = sc.nextInt();
           System.out.println("Enter Student's Name: ");
           name = sc.next();
           System.out.println("Enter Student's Marks: ");
           marks = sc.nextFloat();

       }
     
       void display(){
            System.out.println("Roll: "+ roll);
            System.out.println("Name: "+ name);
            System.out.println("Marks: "+ marks);

       }

       public static void main(String[] args) {
           student ob = new student();
            ob.input();
            ob.display();

           
       }
}