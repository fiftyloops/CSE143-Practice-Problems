import java.util.*;
public class IntTree {
   public IntTreeNode top;
   private Scanner console;
   
   public IntTree() {
      console = new Scanner(System.in);
      buildTree();
   }
   
   private void buildTree() {
      boolean done = false;
      System.out.print("data of overall root? ");
      String input = console.nextLine();
      if (!input.equals("empty")) {      
         top = new IntTreeNode(Integer.parseInt(input));
         while (!done) {
            System.out.print("path (return to quit)? ");
            String path = console.nextLine();
            if (path.length() == 0) {
               done = true;
            } else {
               System.out.print("data? ");
               int data = Integer.parseInt(console.nextLine());
               IntTreeNode curr = top;
               for (int i = 0; i < path.length(); i++) {
                  if (path.charAt(i) == '0') {
                     curr.left = check(curr.left);
                     curr = curr.left;
                  } else {
                     curr.right = check(curr.right);
                     curr = curr.right;
                  }
               }
               curr.data = data;
            }
         }
      }
   }
   
   private IntTreeNode check(IntTreeNode curr) {
      if (curr == null) {
         return new IntTreeNode(0);
      }
      return curr;
   }
   
   // alternateParity
   public boolean alternateParity() {
      return alternateParity(top);
   }
   
   private boolean alternateParity(IntTreeNode curr) {
      if (curr != null) {
         if (curr.left != null && (curr.data + curr.left.data) % 2 == 0) {
            return false;
         } else if (curr.right != null && (curr.data + curr.right.data) % 2 == 0) {
            return false;
         } else {
            return alternateParity(curr.left) && alternateParity(curr.right);
         }
      }
      return true;
   }
   
   // contains
   public boolean contains(IntTree other) {
      return contains(top, other.top);
   }
   
   private boolean contains(IntTreeNode curr1, IntTreeNode curr2) {
      if (curr1 != null && curr2 != null) {
         if (curr1.data == curr2.data) {
            return contains(curr1.left, curr2.left) && contains(curr1.right, curr2.right);
         } else {
            return false;
         }
      } else if (curr1 == null && curr2 != null) {
         return false;
      } else {
         return true;
      }
   }
   
   // countMultiples
   public int countMultiples(int n) {
      return countMultiples(n, top);
   }
   
   private int countMultiples(int n, IntTreeNode curr) {
      if (curr != null) {
         if (curr.data % n == 0) {
            return 1 + countMultiples(n, curr.left) + countMultiples(n, curr.right);
         } else {
            return countMultiples(n, curr.left) + countMultiples(n, curr.right);
         }
      }
      return 0;
   }
   
   // countOddBranches
   public int countOddBranches() {
      return countOddBranches(top);
   }
   
   private int countOddBranches(IntTreeNode curr) {
      if (curr != null && (curr.left != null || curr.right != null)) {
         if (curr.data % 2 == 1) {
            return 1 + countOddBranches(curr.left) + countOddBranches(curr.right);
         } else {
            return countOddBranches(curr.left) + countOddBranches(curr.right);
         }
      }
      return 0;
   }
   
   // countTwins
   public int countTwins() {
      return countTwins(top);
   }
   
   private int countTwins(IntTreeNode curr) {
      if (curr != null && curr.left != null && curr.right != null) {
         if (curr.left.data == curr.right.data) {
            return 1 + countTwins(curr.left) + countTwins(curr.right);
         } else {
            return countTwins(curr.left) + countTwins(curr.right);
         }
      }
      return 0;
   }
   
   // equals
   public boolean equals(IntTree other) {
      return equals(top, other.top);
   }
   
   private boolean equals(IntTreeNode curr1, IntTreeNode curr2) {
      if (curr1 != null && curr2 != null) {
         if (curr1.data == curr2.data) {
            return equals(curr1.left, curr2.left) && equals(curr1.right, curr2.right);
         } else {
            return false;
         }
      } else if (curr1 == null && curr2 == null) {
         return true;
      } else {
         return false;
      }
   }
   
   // evenBranches
   public int evenBranches() {
      return evenBranches(top);
   }
   
   private int evenBranches(IntTreeNode curr) {
      if (curr != null && (curr.left != null || curr.right != null)) {
         if (curr.data % 2 == 0) {
            return 1 + evenBranches(curr.left) + evenBranches(curr.right);
         } else {
            return evenBranches(curr.left) + evenBranches(curr.right);
         }
      }
      return 0;
   }
   
   // hasPath
   public boolean hasPath(int start, int end) {
      return findStart(start, end, top);
   }
   
   private boolean findStart(int start, int end, IntTreeNode curr) {
      if (curr != null) {
         if (curr.data == start) {
            return findEnd(end, curr);
         } else {
            return findStart(start, end, curr.left) || findStart(start, end, curr.right);
         }
      }
      return false;
   }
   
   private boolean findEnd(int end, IntTreeNode curr) {
      if (curr != null) {
         if (curr.data == end) {
            return true;
         } else {
            return findEnd(end, curr.left) || findEnd(end, curr.right);
         }
      }
      return false;
   }
   
   // hasPathSum
   public boolean hasPathSum(int n) {
      return hasPathSum(n, top);
   }
   
   private boolean hasPathSum(int n, IntTreeNode curr) {
      if (curr != null) {
         if (n == curr.data) {
            return true;
         } else {
            return hasPathSum(n - curr.data, curr.left) || hasPathSum(n - curr.data, curr.right);
         }
      }
      return false;
   }
   
   // inorderList
   public List<Integer> inorderList() {
      List<Integer> list = new ArrayList<Integer>();
      inorderList(top, list);
      return list;
   }
   
   private void inorderList(IntTreeNode curr, List<Integer> list) {
      if (curr != null) {
         inorderList(curr.left, list);
         list.add(curr.data);
         inorderList(curr.right, list);        
      }
   }
   
   // isFull
   public boolean isFull() {
      return isFull(top);
   }
   
   private boolean isFull(IntTreeNode curr) {
      if (curr != null) {
         if (curr.left == null && curr.right != null) {
            return false;
         } else if (curr.left != null && curr.right == null) {
            return false;
         } else {
            return isFull(curr.left) && isFull(curr.right);
         }
      }
      return true;
   }
   
   // leavesAtDepthN
   public int leavesAtDepthN(int n) {
      return leavesAtDepthN(n, top);
   }
   
   private int leavesAtDepthN(int n, IntTreeNode curr) {
      if (curr != null) {
         if (n == 1 && curr.left == null && curr.right == null) {
            return 1;
         } else {
            return leavesAtDepthN(n - 1, curr.left) + leavesAtDepthN(n - 1, curr.right);
         }
      }
      return 0;
   }
   
   // nodesAtLevels
   public int nodesAtLevels(int min, int max) {
      return nodesAtLevels(min, max, 1, top);
   }
   
   private int nodesAtLevels(int min, int max, int n, IntTreeNode curr) {
      if (curr != null) {
         if (n >= min && n <= max) {
            return 1 + nodesAtLevels(min, max, n + 1, curr.left) + nodesAtLevels(min, max, n + 1, curr.right);
         } else {
            return nodesAtLevels(min, max, n + 1, curr.left) + nodesAtLevels(min, max, n + 1, curr.right);
         }
      }
      return 0;
   }
   
   // numEmpty
   public int numEmpty() {
      return numEmpty(top);
   }
   
   private int numEmpty(IntTreeNode curr) {
      if (curr != null) {
         return numEmpty(curr.left) + numEmpty(curr.right);
      }
      return 1;
   }
   
   // oddDepthSum
   public int oddDepthSum() {
      return oddDepthSum(1, top);
   }
   
   private int oddDepthSum(int d, IntTreeNode curr) {
      if (curr != null) {
         if (d % 2 == 1) {
            return curr.data + oddDepthSum(d + 1, curr.left) + oddDepthSum(d + 1, curr.right);
         } else {
            return oddDepthSum(d + 1, curr.left) + oddDepthSum(d + 1, curr.right);
         }
      }
      return 0;
   }
   
   // oddPathSum
   public int oddPathSum() {
      return oddPathSum(0, top);
   }
   
   private int oddPathSum(int sum, IntTreeNode curr) {
      if (curr != null) {
         if ((sum + curr.data) % 2 == 1) {
            return 1 + oddPathSum(sum + curr.data, curr.left) + oddPathSum(sum + curr.data, curr.right);
         } else {
            return oddPathSum(sum + curr.data, curr.left) + oddPathSum(sum + curr.data, curr.right);
         }
      }
      return 0;
   }
   
   // pairsOfTwins
   public int pairsOfTwins() {
      return pairsOfTwins(top);
   }
   
   private int pairsOfTwins(IntTreeNode curr) {
      if (curr != null) {
         if (curr.left != null && curr.right != null && curr.left.data == curr.right.data) {
            return 1 + pairsOfTwins(curr.left) + pairsOfTwins(curr.right);
         } else {
            return pairsOfTwins(curr.left) + pairsOfTwins(curr.right);
         }
      }
      return 0;
   }
   
   // print
   public void print() {
      print(top);
   }
   
   private void print(IntTreeNode curr) {
      if (curr == null) {
         System.out.print("empty");
      } else if (curr.left != null || curr.right != null) {
         System.out.print("(");
         print(curr.left);
         System.out.print(", " + curr.data + ", ");
         print(curr.right);
         System.out.print(")");
      } else {
         System.out.print(curr.data);
      }
   }
   
   // printLeaves
   public void printLeaves() {
      System.out.print("leaves:");
      printLeaves(top);
   }
   
   private void printLeaves(IntTreeNode curr) {
      if (curr != null) {
         if (curr.left == null && curr.right == null) {
            System.out.print(" " + curr.data);
         } else {
            printLeaves(curr.right);
            printLeaves(curr.left);
         }
      }
   }
   
   // printLevel
   public void printLevel(int n) {
      printLevel(n, top);
   }
   
   private void printLevel(int n, IntTreeNode curr) {
      if (curr != null) {
         if (n == 1) {
            System.out.println(curr.data);
         } else {
            printLevel(n - 1, curr.left);
            printLevel(n - 1, curr.right);
         }
      }
   }
   
   //purebredOdds
   public int purebredOdds() {
      return purebredOdds(top);
   }
   
   private int purebredOdds(IntTreeNode curr) {
      if (curr != null) {
         if (curr.data % 2 == 0) {
            return 0;
         } else {
            return 1 + purebredOdds(curr.left) + purebredOdds(curr.right);
         }
      }
      return 0;
   }
   
   // sameStructure
   public boolean sameStructure(IntTree other) {
      return sameStructure(top, other.top);
   }
   
   private boolean sameStructure(IntTreeNode curr1, IntTreeNode curr2) {
      if (curr1 == null && curr2 == null) {
         return true;
      } else if (curr1 == null || curr2 == null) {
         return false;
      } else {
         return sameStructure(curr1.left, curr2.left) && sameStructure(curr1.right, curr2.right);
      }
   }
   
   // toString
   public String toString() {
      return toString(top);
   }
   
   private String toString(IntTreeNode curr) {
      if (curr == null) {
         return "empty";
      } else if (curr.left == null && curr.right == null) {
         return "" + curr.data;
      } else {
         return "(" + curr.data + ", " + toString(curr.left) + ", " + toString(curr.right) + ")";
      }
   }
}