import java.util.*;
public class LibrarySystem{

    public static void main(String arg[])
    {

        ArrayList<String> books=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        books.add("Java");
        books.add("C++");
        books.add("Python");
        books.add("HTML");
        int ch;

        do{
            System.out.println("-----MENU-----");
            System.out.println("1:ISSUE BOOK");
            System.out.println("2:RETURN BOOK");
            System.out.println("3:EXIT");
            System.out.println("Enter your choice=");
             ch=sc.nextInt();
             sc.nextLine();
             try{
            switch(ch)
            {
                case 1:
                System.out.println("Enter the book that you want to issue=");
                String b=sc.nextLine();
                
                if (books.contains(b))
                { books.remove(b);
                    System.out.println("Books issued......");
                }
                else
                {
                    System.out.println("cannot find book");

                }
                break;
                case 2:
                System.out.println("Enter the book that you want to returned=");
                String x=sc.nextLine();
                books.add(x);
                System.out.println("Books returned......");
                break;
                case 3:
                System.out.println("GoodBye......");
                break;
                default:
                System.out.println("You entered wrong choice....");

            }
        }catch(Exception e)
        {
            System.out.println(e);
        }

        }while(ch != 3);

    }
}