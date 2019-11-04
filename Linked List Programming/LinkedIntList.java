import java.util.*;
public class LinkedIntList {
   public ListNode front;
   private Scanner console;
   
   public LinkedIntList() {
      console = new Scanner(System.in);
      buildList();
   }
   
   public void buildList() {
      boolean done = false;
      System.out.print("data of front? (type \"empty\" to create an empty list) ");
      String input = console.nextLine();
      if (!input.equals("empty")) {
         front = new ListNode(Integer.parseInt(input));
         while (!done) {
            System.out.print("next? (return to quit) ");
            String data = console.nextLine();
            if (data.length() == 0) {
               done = true;
            } else {
               add(Integer.parseInt(data));
            }
         }
      }
   }
   
   public void add(int data) {
      if (front == null) {
         front = new ListNode(data);
      } else {
         ListNode curr = front;
         while (curr.next != null) {
            curr = curr.next;
         }
         curr.next = new ListNode(data);
      }
   }
   
   public void print() {
      if (front == null) {
         System.out.println("empty");
      } else {
         System.out.print(front.data);
         ListNode curr = front.next;
         while (curr != null) {
            System.out.print(" -> " + curr.data);
            curr = curr.next;
         }
         System.out.println();
      }
   }
}