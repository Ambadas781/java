import java.util.*;
class book1{
    int price,num_pages;
    String name , author;
    public book1(){

    }
    public book1(String name , String author , int num_pages , int price){
        this.name = name;
        this.author=author;
        this.price=price;
        this.num_pages=num_pages;
    }
    void get(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the book: ");
        name = sc.nextLine();
        System.out.println("Enter the author of the book: ");
        author=sc.nextLine();
        System.out.println("Enter the number of pages: ");
        num_pages=sc.nextInt();
        System.out.println("Enter the price of the book: ");
        price=sc.nextInt();
        sc.close();
    }
    public String toString(){
    
        return("Name: " + name + "\nAuthor: " + author + "\nPrice: " + price + "\nNumber of pages " + num_pages );
    }
}
public class book{
    public static void main(String args[]){
        Scanner sc1 = new Scanner(System.in);
        int n;

        book1 obj=new book1("Harry Potter","J K Rowling",300,400);
        System.out.println("The detail of book is ");
        System.out.println(obj);
        System.out.println("ENter the number of books");
        n=sc1.nextInt();
        book1 obj1[] = new book1[n];
        for(int i=0;i<n;i++){
            obj1[i]=new book1();
            obj1[i].get();
        }
        for(int i=0;i<n;i++){
            System.out.println("The detail of book " + (i+1) + " :");
            System.out.println(obj1[i]);
        }
        
        sc1.close();
    }
    

    
}
