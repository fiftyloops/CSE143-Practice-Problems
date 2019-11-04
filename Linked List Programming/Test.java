public class Test {
   public static void main(String[] args) {
      LinkedIntList list1 = new LinkedIntList();
      LinkedIntList list2 = new LinkedIntList();
      
      System.out.println();
      System.out.println("before: ");
      System.out.print("p -> ");
      list1.print();
      System.out.print("q -> ");
      list2.print();
      System.out.println();
      
      ListNode p = list1.front;
      ListNode q = list2.front;
      
      // your code here
      p.next.next.next = q.next;
      ListNode temp = q;
      q = p.next.next;
      p.next.next = p;
      p = p.next;
      p.next.next = temp;
      temp.next = null;
      
      list1.front = p;
      list2.front = q;
      System.out.println("after: ");
      System.out.print("p -> ");
      list1.print();
      System.out.print("q -> ");
      list2.print();
   }
}