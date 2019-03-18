import java.util.*;
public class IntTree {
   public IntTreeNode top;
   private Scanner console;
   
   public IntTree(IntTreeNode top) {
      this.top = top;
   }
   
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
   
   // add
   public void add(IntTree other) {
      top = add(top, other.top);
   }
   
   private IntTreeNode add(IntTreeNode curr1, IntTreeNode curr2) {
      if (curr1 != null && curr2 != null) {
         curr1.data += curr2.data;
         curr1.left = add(curr1.left, curr2.left);
         curr1.right = add(curr1.right, curr2.right);
      } else if (curr1 == null && curr2 != null) {
         curr1 = curr2;
      }
      return curr1;
   }
   
   // cloneLonelyChildren
   public void cloneLonelyChildren() {
      top = cloneLonelyChildren(top);
   }
   
   private IntTreeNode cloneLonelyChildren(IntTreeNode curr) {
      if (curr != null) {
         if (curr.left != null && curr.right != null) {
            curr.left = cloneLonelyChildren(curr.left);
            curr.right = cloneLonelyChildren(curr.right);
         } else if (curr.left == null && curr.right != null) {
            curr.left = new IntTreeNode(curr.right.data);
            curr.right = cloneLonelyChildren(curr.right);
         } else if (curr.left != null && curr.right == null) {
            curr.left = cloneLonelyChildren(curr.left);
            curr.right = new IntTreeNode(curr.left.data);;
         }
         return curr;
      }
      return null;
   }
      
   // combineWith
   public IntTree combineWith(IntTree other) {
      return new IntTree(combineWith(top, other.top));
   }
   
   private IntTreeNode combineWith(IntTreeNode curr1, IntTreeNode curr2) {
      if (curr1 == null && curr2 == null) {
         return null;
      }
      
      IntTreeNode curr = new IntTreeNode(0);
      if (curr1 != null && curr2 != null) {
         curr.data = 3;
         curr.left = combineWith(curr1.left, curr2.left);
         curr.right = combineWith(curr1.right, curr2.right);
      } else if (curr1 != null && curr2 == null) {
         curr.data = 1;
         curr.left = combineWith(curr1.left, null);
         curr.right = combineWith(curr1.right, null);
      } else if (curr1 == null && curr2 != null) {
         curr.data = 2;
         curr.left = combineWith(null, curr2.left);
         curr.right = combineWith(null, curr2.right);
      }
      return curr;
   }
   
   // completeToLevel
   public void completeToLevel(int n) {
      top = completeToLevel(n, top);
   }
   
   private IntTreeNode completeToLevel(int n, IntTreeNode curr) {
      if (n > 0) {
         if (curr == null) {
            curr = new IntTreeNode(-1);
         }
         curr.left = completeToLevel(n - 1, curr.left);
         curr.right = completeToLevel(n - 1, curr.right);
      }
      return curr;
   }
   
   // construct
   public void construct(int[] list) {
      top = construct(list, 0, list.length - 1, top);
   }
   
   private IntTreeNode construct(int[] list, int start, int end, IntTreeNode curr) {
      if (start <= end) {
         int mid = (start + end + 1) / 2;
         curr = new IntTreeNode(list[mid]);
         curr.left = construct(list, start, mid - 1, curr.left);
         curr.right = construct(list, mid + 1, end, curr.right);
         return curr;
      }
      return null;
   }
   
   // countBelow
   public int countBelow(int n) {
      if (n <= 0) {
         throw new IllegalArgumentException();
      }
      return countBelow(n, top);
   }
   
   private int countBelow(int n, IntTreeNode curr) {
      if (curr != null) {
         if (n <= 1) {
            return 1 + countBelow(n - 1, curr.left) + countBelow(n - 1, curr.right);
         } else {
            return countBelow(n - 1, curr.left) + countBelow(n - 1, curr.right);
         }
      }
      return 0;
   }
   
   // countNodes
   public int countNodes(int x, int y) {
      if (x < 0 || y < 0) {
         throw new IllegalArgumentException();
      }
      return countNodes(x, y, top);
   }
   
   private int countNodes(int x, int y, IntTreeNode curr) {
      if (curr == null) {
         return 0;
      } else if (x == 0 && y == 0) {
         return 1;
      } else {
         return countNodes(x - 1, y, curr.left) + countNodes(x, y - 1, curr.right);
      }
   }
   
   // countPathsOfLength
   public int countPathsOfLength(int n) {
      return countPathsOfLength(n, top);
   }
   
   private int countPathsOfLength(int n, IntTreeNode curr) {
      if (curr == null) {
         return 0;
      }  else if (n == 1) {
         if (curr.left == null && curr.right == null) {
            return 1;
         } else {
            return 0;
         }
      } else {
         return countPathsOfLength(n - 1, curr.left) + countPathsOfLength(n - 1, curr.right);
      }
   }
   
   // doubleIt
   public void doubleIt() {
      top = doubleIt(top);
   }
   
   private IntTreeNode doubleIt(IntTreeNode curr) {
      if (curr != null) {
         curr.left = new IntTreeNode(2 * curr.data, doubleIt(curr.left), null);
         curr.right = new IntTreeNode(2 * curr.data, null, doubleIt(curr.right));
         return curr;
      }
      return null;
   }
   
   // evenLevels
   public void evenLevels() {
      top = evenLevels(1, top);
   }
   
   private IntTreeNode evenLevels(int level, IntTreeNode curr) {
      if (curr != null) {
         if (level % 2 == 1 && curr.left == null && curr.right == null) {
            return null;
         } else {
            curr.left = evenLevels(level + 1, curr.left);
            curr.right = evenLevels(level + 1, curr.right);
            return curr;
         }
      }
      return null;
   }
   
   // expand
   public void expand() {
      top = expand(top);
   }
   
   private IntTreeNode expand(IntTreeNode curr) {
      if (curr != null) {
         if (curr.left == null && curr.right != null) {
            curr.left = curr.right;
         } else if (curr.left != null && curr.right == null) {
            curr.right = curr.left;
         }
         curr.left = expand(curr.left);
         curr.right = expand(curr.right);
         return curr;
      }
      return null;
   }
   
   // fill
   public void fill() {
      fill(3, top);
   }
   
   private IntTreeNode fill(int n, IntTreeNode curr) {
      if (n > 0) {
         if (curr == null) {
            curr = new IntTreeNode(0);
         }
         curr.left = fill(n - 1, curr.left);
         curr.right = fill(n - 1, curr.right);
         return curr;
      }
      return null;
   }
   
   // flip
   public void flip() {
      top = flip(top);
   }
   
   private IntTreeNode flip(IntTreeNode curr) {
      if (curr == null) {
         return null;
      } else if (curr.left == null && curr.right == null) {
         return curr;
      } else {
         IntTreeNode temp = curr.left;
         curr.left = flip(curr.right);
         curr.right = flip(temp);
         return curr;         
      }
   }
   
   // grow
   public void grow() {
      top = grow(top);
   }
   
   private IntTreeNode grow(IntTreeNode curr) {
      if (curr != null) {
         if (curr.left == null || curr.right == null) {
            curr.data = 1;
         }
         curr.left = grow(curr.left);
         curr.right = grow(curr.right);
         return curr;
      }
      return new IntTreeNode(0);
   }
   
   // limitLeaves
   public void limitLeaves(int n) {
      top = limitLeaves(n, top);
   }
   
   private IntTreeNode limitLeaves(int n, IntTreeNode curr) {
      if (curr != null) {
         curr.left = limitLeaves(n, curr.left);
         curr.right = limitLeaves(n, curr.right);
         if (curr.left == null && curr.right == null) {
            if (curr.data <= n) {
               curr = null;
            }
         }
         return curr;
      }
      return null;
   }
   
   // limitPathSum
   public void limitPathSum(int n) {
      top = limitPathSum(n, 0, top);
   }
   
   private IntTreeNode limitPathSum(int n, int sum, IntTreeNode curr) {
      if (curr != null) {
         if (sum + curr.data > n) {
            curr = null;
         } else {
            curr.left = limitPathSum(n, sum + curr.data, curr.left);
            curr.right = limitPathSum(n, sum + curr.data, curr.right);
         }
         return curr;
      }
      return null;
   }
   
   // makeFull
   public void makeFull() {
      top = makeFull(top);
   }
   
   private IntTreeNode makeFull(IntTreeNode curr) {
      if (curr != null) {
         if (curr.left != null && curr.right != null) {
            curr.left = makeFull(curr.left);
            curr.right = makeFull(curr.right);
         } else if (curr.left == null && curr.right != null) {
            curr = makeFull(curr.right);
         } else if (curr.left != null && curr.right == null) {
            curr = makeFull(curr.left);
         }
         return curr;
      }
      return null;
   }
   
   // makePerfect
   public void makePerfect() {
      top = makePerfect(3, top);
   }
   
   private IntTreeNode makePerfect(int n, IntTreeNode curr) {
      if (n > 0) {
         if (curr == null) {
            curr = new IntTreeNode(0);
         }
         curr.left = makePerfect(n - 1, curr.left);
         curr.right = makePerfect(n - 1, curr.right);
         return curr;
      }
      return null;
   }
   
   // matches
   public int matches(IntTree other) {
      return matches(top, other.top);
   }
   
   private int matches(IntTreeNode curr1, IntTreeNode curr2) {
      if (curr1 != null && curr2 != null) {
         if (curr1.data == curr2.data) {
            return 1 + matches(curr1.left, curr2.left) + matches(curr1.right, curr2.right);
         } else {
            return matches(curr1.left, curr2.left) + matches(curr1.right, curr2.right);
         }
      }
      return 0;
   }
   
   // mirror
   public void mirror() {
      top = mirror(top);
   }
   
   private IntTreeNode mirror(IntTreeNode curr) {
      if (curr != null) {
         IntTreeNode temp = curr.left;
         curr.left = mirror(curr.right);
         curr.right = mirror(temp);
         return curr;
      }
      return null;
   }
   
   // removeLeaves
   public void removeLeaves() {
      top = removeLeaves(top);
   }
   
   private IntTreeNode removeLeaves(IntTreeNode curr) {
      if (curr != null) {
         if (curr.left == null && curr.right == null) {
            curr = null;
         } else {
            curr.left = removeLeaves(curr.left);
            curr.right = removeLeaves(curr.right);
         }
         return curr;
      }
      return null;
   }
   
   // removeLeftLeaves
   public void removeLeftLeaves() {
      top = removeLeftLeaves(top);
   }
   
   private IntTreeNode removeLeftLeaves(IntTreeNode curr) {
      if (curr != null) {
         curr.left = removeLeftLeaves(curr.left);
         curr.right = removeLeftLeaves(curr.right);
         if (curr.left != null && curr.left.left == null && curr.left.right == null) {
            curr.left = null;
         }
         return curr;
      }
      return null;
   }
   
   // removeMatchingLeaves
   public void removeMatchingLeaves(IntTree other) {
      top = removeMatchingLeaves(top, other.top);
   }
   
   private IntTreeNode removeMatchingLeaves(IntTreeNode curr1, IntTreeNode curr2) {
      if (curr1 != null && curr2 != null) {
         if (curr1.left == null && curr1.right == null && curr1.data == curr2.data) {
            curr1 = null;
         } else {
            curr1.left = removeMatchingLeaves(curr1.left, curr2.left);
            curr1.right = removeMatchingLeaves(curr1.right, curr2.right);
         }
         return curr1;
      } else if (curr1 != null) {
         return curr1;
      } else {
         return null;
      }
   }
   
   // removeRightLeaves
   public void removeRightLeaves() {
      top = removeRightLeaves(top);
   }
   
   private IntTreeNode removeRightLeaves(IntTreeNode curr) {
      if (curr != null) {
         curr.left = removeRightLeaves(curr.left);
         curr.right = removeRightLeaves(curr.right);
         if (curr.right != null && curr.right.left == null && curr.right.right == null) {
            curr.right = null;
         }
         return curr;
      }
      return null;
   }
   
   // removeSmallLeaves
   public void removeSmallLeaves(int n) {
      top = removeSmallLeaves(n, top);
   }
   
   private IntTreeNode removeSmallLeaves(int n, IntTreeNode curr) {
      if (curr != null) {
         curr.left = removeSmallLeaves(n, curr.left);
         curr.right = removeSmallLeaves(n, curr.right);
         if (curr.left == null && curr.right == null) {
            if (curr.data < n) {
               curr = null;
            }
         }
         return curr;
      }
      return null;
   }
   
   // stretch
   public void stretch() {
      top = stretch(top);
   }
   
   private IntTreeNode stretch(IntTreeNode curr) {
      if (curr != null) {
         if (curr.left != null && curr.right == null) {
            curr = new IntTreeNode(1, curr, null);
         } else if (curr.left == null && curr.right != null) {
            curr = new IntTreeNode(1, null, curr);
         } else {
            curr.left = stretch(curr.left);
            curr.right = stretch(curr.right);
         }
         return curr;
      }
      return null;
   }
   
   // sumLeaves
   public int sumLeaves() {
      return sumLeaves(top);
   }
   
   private int sumLeaves(IntTreeNode curr) {
      if (curr != null) {
         if (curr.left == null && curr.right == null) {
            return curr.data + sumLeaves(curr.left) + sumLeaves(curr.right);
         } else {
            return sumLeaves(curr.left) + sumLeaves(curr.right);
         }
      }
      return 0;
   }
   
   // tighten
   public void tighten() {
      top = tighten(top);
   }
   
   private IntTreeNode tighten(IntTreeNode curr) {
      if (curr != null) {
         if (curr.left != null && curr.right == null) {
            curr = tighten(curr.left);
         } else if (curr.left == null && curr.right != null) {
            curr = tighten(curr.right);
         } else {
            curr.left = tighten(curr.left);
            curr.right = tighten(curr.right);
         }
         return curr;
      }
      return null;
   }
   
   // trim
   public void trim(int min, int max) {
      top = trim(min, max, top);
   }
   
   private IntTreeNode trim(int min, int max, IntTreeNode curr) {
      if (curr != null) {
         if (curr.data >= min && curr.data <= max) {
            curr.left = trim(min, max, curr.left);
            curr.right = trim(min, max, curr.right);         
         } else if (curr.data < min) {
            curr = trim(min, max, curr.right);
         } else {
            curr = trim(min, max, curr.left);
         }
         return curr;
      }
      return null;
   }
}