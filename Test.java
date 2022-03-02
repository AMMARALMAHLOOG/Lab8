import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by Arabic on 02/03/22.
 */
public class Test {
    public static void main(String[] args) {
        DoublyLinkedList<String>list=new DoublyLinkedList<>();
        Scanner in=new Scanner(System.in);
        int choice=-1;
        while (choice!=0){
            System.out.println("your choice");
            switch (choice){
                case 0:System.exit(0);
                case 1:
                    System.out.print("input name :");
                    list.addFirst(in.next());break;
                case 2:
                    System.out.print("input name :");
                    list.addLast(in.next());break;
                case 3:
                    System.out.print("deleted is :"+list.removeFirst());break;
                case 4:
                    System.out.print("deleted is :"+list.removeLast());break;
            }
            System.out.println("first "+list.first()+"\tlast "+"\tsize "+list.size());
        }
    }
}
