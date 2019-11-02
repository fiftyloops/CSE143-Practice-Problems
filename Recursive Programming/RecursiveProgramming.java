public class RecursiveProgramming {
   public static void main(String[] args) {
      // collapseSequence
      System.out.println(collapseSequence("-this----has maaany--dashes---", '-'));
      System.out.println(collapseSequence("eecckk!!, he's meeeping meep", 'e'));
      System.out.println();
      
      // commonChars
      System.out.println(commonChars("foo", "oof"));
      System.out.println(commonChars("dog person", "cat perSon"));
      System.out.println(commonChars("hello", "jello"));
      System.out.println();
      
      // countToBy
      countToBy(34, 5);
      System.out.println();
      countToBy(3, 6);
      System.out.println();
      countToBy(17, 3);
      System.out.println();
      System.out.println();
      
      // dedup
      System.out.println(dedup("odegaard"));
      System.out.println(dedup("baz"));
      System.out.println(dedup("hissssssss"));
      System.out.println(dedup("zzzzzzz"));
      System.out.println(dedup("mississippi"));
      System.out.println(dedup("ooops"));
      System.out.println(dedup("apple"));
      System.out.println(dedup("theses"));
      System.out.println(dedup("shellless"));
      System.out.println(dedup("puppy"));
      System.out.println();
      
      // digitMatch
      System.out.println(digitMatch(38, 34));
      System.out.println(digitMatch(5, 5552));
      System.out.println(digitMatch(892, 892));
      System.out.println(digitMatch(298892, 7892));
      System.out.println(digitMatch(380, 0));
      System.out.println(digitMatch(123456, 654321));
      System.out.println(digitMatch(1234567, 67));
      System.out.println();
      
      // digitProduct
      System.out.println(digitProduct(1));
      System.out.println(digitProduct(19));
      System.out.println(digitProduct(108));
      System.out.println(digitProduct(62));
      System.out.println(digitProduct(-151));
      System.out.println(digitProduct(12345));
      System.out.println(digitProduct(-30551));
      System.out.println(digitProduct(-192));
      System.out.println();
      
      // doubleDigit
      System.out.println(doubleDigit(2, 2));
      System.out.println(doubleDigit(0, 0));
      System.out.println(doubleDigit(8, 6));
      System.out.println(doubleDigit(55, 2));
      System.out.println(doubleDigit(33, 3));
      System.out.println(doubleDigit(-101, 1));
      System.out.println(doubleDigit(323, 3));
      System.out.println(doubleDigit(2001, 0));
      System.out.println(doubleDigit(12345, 6));
      System.out.println(doubleDigit(72773, 7));
      System.out.println(doubleDigit(3445, 5));
      System.out.println(doubleDigit(54224, 4));
      System.out.println(doubleDigit(-624243, 4));
      System.out.println(doubleDigit(5340909, 0));
      System.out.println();
      
      // evens
      System.out.println(evens(8342116));
      System.out.println(evens(4109));
      System.out.println(evens(8));
      System.out.println(evens(-34512));
      System.out.println(evens(-163505));
      System.out.println(evens(3052));
      System.out.println(evens(7010496));
      System.out.println(evens(35179));
      System.out.println(evens(5307));
      System.out.println(evens(7));
      System.out.println();
      
      // groupChars
      System.out.println(groupChars("the"));
      System.out.println(groupChars("rain"));
      System.out.println(groupChars("in"));
      System.out.println(groupChars("Spain"));
      System.out.println(groupChars("falls"));
      System.out.println(groupChars("mainly"));
      System.out.println(groupChars("recursively!"));
      System.out.println(groupChars(""));
      System.out.println();
      
      // indexOf
      System.out.println(indexOf("Barack Obama", "Bar"));
      System.out.println(indexOf("Barack Obama", "ck"));
      System.out.println(indexOf("Barack Obama", "a"));
      System.out.println(indexOf("Barack Obama", "BAR"));
      System.out.println();
      
      // isPalindrome
      System.out.println(isPalindrome("radar"));
      System.out.println(isPalindrome("hah"));
      System.out.println(isPalindrome("peep"));
      System.out.println(isPalindrome("x"));
      System.out.println(isPalindrome(""));
      System.out.println(isPalindrome("123321"));
      System.out.println(isPalindrome("peer"));
      System.out.println(isPalindrome("ab"));
      System.out.println(isPalindrome("a ba"));
      System.out.println(isPalindrome("ABba"));
      System.out.println();
      
      // isReversal
      System.out.println(isReversal("foo", "oof"));
      System.out.println(isReversal("foaob", "boqof"));
      System.out.println();
      
      // isReverse
      System.out.println(isReverse("CSE143", "341esc"));
      System.out.println(isReverse("Madam", "MaDAm"));
      System.out.println(isReverse("Q", "Q"));
      System.out.println(isReverse("", ""));
      System.out.println(isReverse("e via n", "N aIv E"));
      System.out.println(isReverse("Go! Go", "OG !OG"));
      System.out.println(isReverse("Obama", "McCain"));
      System.out.println(isReverse("banana", "nanaba"));
      System.out.println(isReverse("hello!!", "olleh"));
      System.out.println(isReverse("", "x"));
      System.out.println(isReverse("madam I", "i m adam"));
      System.out.println(isReverse("ok", "oko"));
      System.out.println();
      
      // isSorted
      System.out.println(isSorted(0));
      System.out.println(isSorted(5));
      System.out.println(isSorted(2345));
      System.out.println(isSorted(-2345));
      System.out.println(isSorted(22334455));
      System.out.println(isSorted(4321));
      System.out.println(isSorted(23454));
      System.out.println();
      
      // largestDigit
      System.out.println(largestDigit(14263203));
      System.out.println(largestDigit(845));
      System.out.println(largestDigit(52649));
      System.out.println(largestDigit(3));
      System.out.println(largestDigit(0));
      System.out.println(largestDigit(-573026));
      System.out.println(largestDigit(-2));
      System.out.println();
      
      // mirrorString
      mirrorString("");
      System.out.println();
      mirrorString("a");
      System.out.println();
      mirrorString("bo");
      System.out.println();
      mirrorString("How are you?");
      System.out.println();
      System.out.println();
      
      // moveToEnd
      System.out.println(moveToEnd("hello", 'l'));
      System.out.println(moveToEnd("hello", 'e'));
      System.out.println(moveToEnd("hello there", 'e'));
      System.out.println(moveToEnd("hello there", 'q'));
      System.out.println(moveToEnd("HELLO there", 'e'));
      System.out.println(moveToEnd("", 'x'));
      System.out.println();
      
      // nthFromEnd
      System.out.println(nthFromEnd(2801, 3));
      System.out.println(nthFromEnd(5, 2));
      System.out.println(nthFromEnd(14978, 1));
      System.out.println(nthFromEnd(458, 0));
      System.out.println(nthFromEnd(0, 0));
      System.out.println(nthFromEnd(56, 2));
      System.out.println(nthFromEnd(1234567890, 9));
      System.out.println();
      
      // parenthesize
      parenthesize("Joe", 2);
      System.out.println();
      parenthesize("The University of Washington", 6);
      System.out.println();
      parenthesize("midterm", 1);
      System.out.println();
      parenthesize("CS143, Spring 2010", 0);
      System.out.println();
      System.out.println();
      
      // parenthesize additions
      parenthesize(0);
      System.out.println();
      parenthesize(1);
      System.out.println();
      parenthesize(2);
      System.out.println();
      parenthesize(3);
      System.out.println();
      parenthesize(4);
      System.out.println();
      parenthesize(5);
      System.out.println();
      parenthesize(6);
      System.out.println();
      parenthesize(7);
      System.out.println();
      parenthesize(8);
      System.out.println();
      parenthesize(9);
      System.out.println();
      System.out.println();
      
      // pattern
      System.out.println(pattern(0, 0));
      System.out.println(pattern(0, 1));
      System.out.println(pattern(0, 2));
      System.out.println(pattern(0, 3));
      System.out.println(pattern(1, 0));
      System.out.println(pattern(1, 1));
      System.out.println(pattern(1, 2));
      System.out.println(pattern(1, 3));
      System.out.println(pattern(2, 0));
      System.out.println(pattern(2, 1));
      System.out.println(pattern(2, 2));
      System.out.println(pattern(2, 3));
      System.out.println(pattern(3, 0));
      System.out.println(pattern(3, 1));
      System.out.println(pattern(3, 2));
      System.out.println(pattern(3, 3));
      System.out.println();
      
      // printDashed
      printDashed(-834);
      System.out.println();
      printDashed(-17);
      System.out.println();
      printDashed(-4);
      System.out.println();
      printDashed(0);
      System.out.println();
      printDashed(6);
      System.out.println();
      printDashed(42);
      System.out.println();
      printDashed(983);
      System.out.println();
      printDashed(29348);
      System.out.println();
      System.out.println();
      
      // printPattern
      printPattern(1);
      System.out.println();
      printPattern(2);
      System.out.println();
      printPattern(3);
      System.out.println();
      printPattern(4);
      System.out.println();
      printPattern(5);
      System.out.println();
      printPattern(6);
      System.out.println();
      printPattern(7);
      System.out.println();
      System.out.println();
      
      // printRange
      printRange(1, 9);
      System.out.println();
      printRange(8, 20);
      System.out.println();
      printRange(-8, -8);
      System.out.println();
      printRange(1, 10);
      System.out.println();
      printRange(13, 14);
      System.out.println();
      System.out.println();
      
      // printSequence
      printSequence(1);
      System.out.println();
      printSequence(2);
      System.out.println();
      printSequence(3);
      System.out.println();
      printSequence(4);
      System.out.println();
      printSequence(5);
      System.out.println();
      printSequence(6);
      System.out.println();
      printSequence(7);
      System.out.println();
      printSequence(8);
      System.out.println();
      System.out.println();
      
      // printTwos
      printTwos(80);
      System.out.println();
      printTwos(96);
      System.out.println();
      printTwos(1);
      System.out.println();
      printTwos(2);
      System.out.println();
      printTwos(32);
      System.out.println();
      System.out.println();
      
      // remove
      System.out.println(remove(1324353, 3));
      System.out.println(remove(1324353, 1));
      System.out.println(remove(333, 3));
      System.out.println(remove(-1324353, 3));
      System.out.println(remove(-1324353, 1));
      System.out.println(remove(-333, 3));
      System.out.println(remove(300432, 3));
      System.out.println(remove(300432, 4));
      System.out.println();
      
      // repeat
      System.out.println(repeat("hello", 3));
      System.out.println(repeat("this is fun", 1));
      System.out.println(repeat("wow", 0));
      System.out.println(repeat("hi ho!", 5));
      System.out.println();
      
      // replace
      System.out.println(replace("to be or not to be", 'e', 'o'));
      System.out.println(replace("to be or not to be", 'o', '-'));
      System.out.println(replace("to be or not to be", 'm', '!'));
      System.out.println(replace("Mississippi", 'i', 'e'));
      System.out.println(replace("hah!", 'h', '*'));
      System.out.println(replace("Hah!", 'h', '*'));
      System.out.println(replace("", 'g', 'h'));
      System.out.println();
      
      // sameDashes
      System.out.println(sameDashes("hi--there", "12--(343)"));
      System.out.println(sameDashes("-12--123", "-xy--xyz"));
      System.out.println(sameDashes("",""));
      System.out.println(sameDashes("56", "ab"));
      System.out.println(sameDashes("-hello-", "-hihi--"));
      System.out.println(sameDashes("---test-", "-test---"));
      System.out.println();
      
      // showSplit
      showSplit(1);
      System.out.println();
      showSplit(0);
      System.out.println();
      showSplit(2);
      System.out.println();
      showSplit(4);
      System.out.println();
      showSplit(8);
      System.out.println();
      showSplit(3);
      System.out.println();
      showSplit(7);
      System.out.println();
      System.out.println();
      
      // substring
      System.out.println(substring("hello", 0, 2));
      System.out.println(substring("hamburger", 4, 8));
      System.out.println(substring("smiles", 1, 5));
      System.out.println(substring("howdy", 3, 3));
      System.out.println();
      
      // times
      
      // undouble
      System.out.println(undouble("odegaard"));
      System.out.println(undouble("baz"));
      System.out.println(undouble("mississippi"));
      System.out.println(undouble("carry"));
      System.out.println(undouble("juggle"));
      System.out.println(undouble("little"));
      System.out.println(undouble("oops"));
      System.out.println(undouble("foobar"));
      System.out.println(undouble("apple"));
      System.out.println(undouble("berry"));
      System.out.println(undouble("theses"));
      System.out.println(undouble(""));
      System.out.println();
      
      // vowelsToEnd
      System.out.println(vowelsToEnd("hello"));
      System.out.println(vowelsToEnd("abracadabra"));
      System.out.println(vowelsToEnd("computer"));
      System.out.println();
      
      // weave
      System.out.println(weave(8, 5));
      System.out.println(weave(5, 8));
      System.out.println(weave(42, 95));
      System.out.println(weave(42, 7596));
      System.out.println(weave(7596, 42));
      System.out.println(weave(7, 0));
      System.out.println(weave(0, 7));
      System.out.println(weave(4723, 9815));
      System.out.println(weave(0, 0));
      System.out.println(weave(444, 318));
      System.out.println();
      
      // writeNumbers
      writeNumbers(5);
      System.out.println();
      writeNumbers(1);
      System.out.println();
      writeNumbers(8);
      System.out.println();
      System.out.println();
      
      // writeNums
      writeNums(5);
      System.out.println();
      writeNums(12);
      System.out.println();
      System.out.println();
      
      // writeSquares
      writeSquares(5);
      System.out.println();
      writeSquares(1);
      System.out.println();
      writeSquares(8);
      System.out.println();
   }
   
   public static String collapseSequence(String str, char ch) {
      if (str.length() == 0 || str.length() == 1) {
         return str;
      } else if (str.charAt(0) == ch && str.charAt(1) == ch) {
         return collapseSequence(str.substring(1), ch);
      } else {
         return str.charAt(0) + collapseSequence(str.substring(1), ch);
      }
   }
   
   public static String commonChars(String str1, String str2) {
      if (str1.length() != str2.length()) {
         throw new IllegalArgumentException();
      } else if (str1.length() == 0 && str2.length() == 0) {
         return "";
      } else if (str1.charAt(0) == str2.charAt(0)) {
         return str1.charAt(0) + commonChars(str1.substring(1), str2.substring(1));
      } else {
         return "." + commonChars(str1.substring(1), str2.substring(1));
      }
   }
   
   public static void countToBy(int n, int m) {
      if (n < 1 || m < 1) {
         throw new IllegalArgumentException();
      } else if (n <= m) {
         System.out.print(n);
      } else {
         countToBy(n - m, m);
         System.out.print(", " + n);
      }
   }
   
   public static String dedup(String str) {
      if (str.length() == 0) {
         throw new IllegalArgumentException();
      } else if (str.length() == 1) {
         return str;
      } else if (str.charAt(0) == str.charAt(1)) {
         return dedup(str.substring(1));
      } else {
         return str.charAt(0) + dedup(str.substring(1));
      }
   }
   
   public static int digitMatch(int n1, int n2) {
      if (n1 < 0 || n2 < 0) {
         throw new IllegalArgumentException();
      } else if ((n1 < 10 || n2 < 10) && n1 % 10 != n2 % 10) {
         return 0;
      } else if ((n1 < 10 || n2 < 10) && n1 % 10 == n2 % 10) {
         return 1;
      } else if (n1 % 10 == n2 % 10) {
         return 1 + digitMatch(n1 / 10, n2 / 10);
      } else {
         return digitMatch(n1 / 10, n2 / 10);
      }
   }
   
   public static int digitProduct(int n) {
      if (n == 0) {
         throw new IllegalArgumentException();
      } else if (n < 0) {
         return -digitProduct(-n);
      } else if (n < 10) {
         return n;
      } else if (n % 10 != 0) {
         return n % 10 * digitProduct(n / 10);
      } else {
         return digitProduct(n / 10);
      }
   }
   
   public static int doubleDigit(int n, int d) {
      if (d < 0 || d > 9) {
         throw new IllegalArgumentException();
      } else if (n < 0) {
         return -doubleDigit(-n, d);
      } else if (n == 0) {
         return 0;
      } else if (n % 10 != d) {
         return 10 * doubleDigit(n / 10, d) + n % 10;
      } else {
         return 100 * doubleDigit(n / 10, d) + 10 * d + d;
      }
   }
   
   public static int evens(int n) {
      if (n < 0) {
         return -evens(-n);
      } else if (n == 0) {
         return 0;
      } else if (n % 2 == 0) {
         return 10 * evens(n / 10) + n % 10;
      } else {
         return evens(n / 10);
      }
   }
   
   public static String groupChars(String str) {
      if (str.length() == 0) {
         return "*";
      } else if (str.length() == 1 || str.length() == 2) {
         return "[" + str + "]";
      } else {
         return "(" + str.charAt(0) + groupChars(str.substring(1, str.length() - 1)) + str.charAt(str.length() - 1) + ")";
      }
   }
   
   public static int indexOf(String str1, String str2) {
      return indexOf(str1, str2, str1.length());
   }
   private static int indexOf(String str1, String str2, int length) {
      if (str1.length() < str2.length()) {
         return str1.length() - length - 1;
      } else if (str1.substring(0, str2.length()).equals(str2)) {
         return 0;
      } else {
         return 1 + indexOf(str1.substring(1), str2, length);
      }
   }
   
   public static boolean isPalindrome(String str) {
      if (str.length() == 0 || str.length() == 1) {
         return true;
      } else if (str.charAt(0) != str.charAt(str.length() - 1)) {
         return false;
      } else {
         return isPalindrome(str.substring(1, str.length() - 1));
      }
   }
   
   public static boolean isReversal(String str1, String str2) {
      if (str1.length() != str2.length()) {
         throw new IllegalArgumentException();
      } else if (str1.length() == 0 && str2.length() == 0) {
         return true;
      } else if (str1.charAt(0) != str2.charAt(str2.length() - 1)) {
         return false;
      } else {
         return isReversal(str1.substring(1), str2.substring(0, str2.length() - 1));
      }
   }
   
   public static boolean isReverse(String str1, String str2) {
      if (str1.length() != str2.length()) {
         return false;
      } else if (str1.length() == 0 && str2.length() == 0) {
         return true;
      } else if (!str1.substring(0, 1).equalsIgnoreCase(str2.substring(str2.length() - 1))) {
         return false;
      } else {
         return isReverse(str1.substring(1), str2.substring(0, str2.length() - 1));
      }
   }
   
   public static boolean isSorted(int n) {
      if (n < 0) {
         return isSorted(-n);
      } else if (n < 10) {
         return true;
      } else if (n / 10 % 10 > n % 10) {
         return false;
      } else {
         return isSorted(n / 10);
      }
   }
   
   public static int largestDigit(int n) {
      if (n < 0) {
         return largestDigit(-n);
      } else if (n < 10) {
         return n;
      } else {
         return Math.max(largestDigit(n / 10), n % 10);
      }
   }
   
   public static void mirrorString(String str) {
      if (str.length() <= 1) {
         System.out.print(str);
      } else {
         System.out.print(str.charAt(0));
         mirrorString(str.substring(1));
         System.out.print(str.charAt(0));
      }
   }
   
   public static String moveToEnd(String str, char ch) {
      if (str.length() == 0) {
         return "";
      } else if (str.charAt(0) == ch) {
         return moveToEnd(str.substring(1), ch) + ch;
      } else {
         return str.charAt(0) + moveToEnd(str.substring(1), ch);
      }
   }
   
   public static int nthFromEnd(int n1, int n2) {
      if (n1 < 0 || n2 < 0) {
         throw new IllegalArgumentException();
      } else if (n2 == 0) {
         return n1 % 10;
      } else {
         return nthFromEnd(n1 / 10, n2 - 1);
      }
   }
   
   public static void parenthesize(String str, int n) {
      if (n < 0) {
         throw new IllegalArgumentException();
      } else if (n == 0) {
         System.out.print(str);
      } else {
         System.out.print("(");
         parenthesize(str, n - 1);
         System.out.print(")");
      }
   }
   
   public static void parenthesize(int n) {
      if (n == 0 || n == 1) {
         System.out.print(n);
      } else if (n % 2 == 0) {
         System.out.print("(" + n + " + ");
         parenthesize(n - 1);
         System.out.print(")");
      } else if (n % 2 == 1) {
         System.out.print("(");
         parenthesize(n - 1);
         System.out.print(" + " + n + ")");
      }
   }
   
   public static String pattern(int n, int m) {
      if (n < 0 || m < 0) {
         throw new IllegalArgumentException();
      } else if (n == 0 && m == 0) {
         return "";
      } else if (n == 0) {
         return "." + pattern(n, m - 1);
      } else {
         return "[" + pattern(n - 1, m) + "]";
      }
   }
   
   public static void printDashed(int n) {
      if (n < 0) {
         System.out.print("-");
         printDashed(-n);
      } else if (n < 10) {
         System.out.print(n);
      } else {
         printDashed(n / 10);
         System.out.print("-" + n % 10);
      }
   }
   
   public static void printPattern(int n) {
      if (n < 0) {
         throw new IllegalArgumentException();
      } else if (n == 0) {
         System.out.print("");
      } else if (n == 1) {
         System.out.print(".");
      } else if (n / 2 % 2 == 1) {
         System.out.print("(");
         printPattern(n - 2);
         System.out.print(")");
      } else { 
         System.out.print("[");
         printPattern(n - 2);
         System.out.print("]");
      }
   }
   
   public static void printRange(int x, int y) {
      if (x > y) {
         throw new IllegalArgumentException();
      } else if (x == y) {
         System.out.print(x);
      } else if (y - x == 1) {
         System.out.print(x + " - " + y);
      } else {
         System.out.print(x + " > ");
         printRange(x + 1, y - 1);
         System.out.print(" < " + y);
      }
   }
   
   public static void printSequence(int n) {
      if (n < 1) {
         throw new IllegalArgumentException();
      } else if (n == 1) {
         System.out.print("*");
      } else if (n == 2) {
         System.out.print("**");
      } else if ((n + 1) / 2 % 2 == 0) {
         System.out.print("<");
         printSequence(n - 2);
         System.out.print(">");
      } else {
         System.out.print(">");
         printSequence(n - 2);
         System.out.print("<");
      }
   }
   
   public static void printTwos(int n) {
      if (n < 1) {
         throw new IllegalArgumentException();
      } else if (n % 2 == 1) {
         System.out.print(n);
      } else if (n % 4 == 0) {
         System.out.print("2 * ");
         printTwos(n / 4);
         System.out.print(" * 2");
      } else {
         System.out.print("2 * ");
         printTwos(n / 2);
      }
   }
   
   public static int remove(int n, int d) {
      if (d < 0) {
         throw new IllegalArgumentException();
      } else if (n < 0) {
         return -remove(-n, d);
      } else if (n < 10 && n != d) {
         return n;
      } else if (n < 10 && n == d) {
         return 0;
      } else if (n % 10 == d) {
         return remove(n / 10, d);
      } else {
         return 10 * remove(n / 10, d) + n % 10;
      }
   }
   
   public static String repeat(String s, int n) {
      if (n < 0) {
         throw new IllegalArgumentException();
      } else if (n == 0) {
         return "";
      } else {
         return s + repeat(s, n - 1);
      }
   }
   
   public static String replace(String str, char ch1, char ch2) {
      if (str.length() == 0) {
         return "";
      } else if (str.charAt(0) == ch1) {
         return ch2 + replace(str.substring(1), ch1, ch2);
      } else {
         return str.charAt(0) + replace(str.substring(1), ch1, ch2);
      }
   }
   
   public static boolean sameDashes(String str1, String str2) {
      if (str1.length() != str2.length()) {
         throw new IllegalArgumentException();
      } else if (str1.length() == 0 && str2.length() == 0) {
         return true;
      } else if (str1.charAt(0) == '-' && str2.charAt(0) != '-') {
         return false;
      } else if (str1.charAt(0) != '-' && str2.charAt(0) == '-') {
         return false;
      } else {
         return sameDashes(str1.substring(1), str2.substring(1));
      }
   }
   
   public static void showSplit(int n) {
      if (n < 0) {
         throw new IllegalArgumentException();
      } else if (n == 0 || n == 1) {
         System.out.print(n);
      } else if (n % 2 == 0) {
         System.out.print(n + " = (");
         showSplit(n / 2);
         System.out.print(", ");
         showSplit(n / 2);
         System.out.print(")");
      } else {
         System.out.print(n + " = (");
         showSplit(n / 2 + 1);
         System.out.print(", ");
         showSplit(n / 2);
         System.out.print(")");
      }
   }
   
   public static String substring(String str, int start, int end) {
      if (start < 0 || end > str.length() || start > end) {
         throw new IllegalArgumentException();
      } else if (start == 0 && end == 0) {
         return "";
      } else if (start == 0) {
         return str.charAt(0) + substring(str.substring(1), 0, end - 1);
      } else {
         return substring(str.substring(1), start - 1, end - 1);
      }
   }
   
   public static int times(int a, int b) {
      if (a < 0 && b < 0) {
         return times(-a, -b);
      } else if (a < 0 || b < 0) {
         return -times(Math.abs(a), Math.abs(b));
      } else if (a == 0) {
         return 0;
      } else {
         return b + times(a - 1, b);
      }
   }
   
   public static String undouble(String str) {
      if (str.length() == 0 || str.length() == 1) {
         return str;
      } else if (str.charAt(0) == str.charAt(1)) {
         return undouble(str.substring(1));
      } else {
         return str.charAt(0) + undouble(str.substring(1));
      }
   }
   
   public static String vowelsToEnd(String str) {
      if (str.length() == 0) {
         return "";
      } else if (str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' ||
                 str.charAt(0) == 'o' || str.charAt(0) == 'u') {
         return vowelsToEnd(str.substring(1)) + str.charAt(0);
      } else {
         return str.charAt(0) + vowelsToEnd(str.substring(1));
      }
   }
   
   public static int weave(int n1, int n2) {
      if (n1 < 0 && n2 < 0) {
         throw new IllegalArgumentException();
      } else if (n1 == 0 && n2 == 0) {
         return 0;
      } else if (n1 == 0) {
         return 100 * weave(0, n2 / 10) + n2 % 10;
      } else if (n2 == 0) {
         return 100 * weave(n1 / 10, 0) + 10 * (n1 % 10);
      } else {
         return 100 * weave(n1 / 10, n2 / 10) + 10 * (n1 % 10) + n2 % 10;
      }
   }
   
   public static void writeNumbers(int n) {
      if (n < 1) {
         throw new IllegalArgumentException();
      } else if (n == 1) {
         System.out.print("1");
      } else if (n % 2 == 0) {
         writeNumbers(n - 1);
         System.out.print(", " + n);
      } else {
         System.out.print(n + ", ");
         writeNumbers(n - 1);
      }
   }
   
   public static void writeNums(int n) {
      if (n < 1) {
         throw new IllegalArgumentException();
      } else if (n == 1) {
         System.out.print("1");
      } else {
         writeNums(n - 1);
         System.out.print(", " + n);
      }
   }
   
   public static void writeSquares(int n) {
      if (n < 1) {
         throw new IllegalArgumentException();
      } else if (n == 1) {
         System.out.print("1");
      } else if (n % 2 == 0) {
         writeSquares(n - 1);
         System.out.print(", " + n * n);
      } else {
         System.out.print(n * n + ", ");
         writeSquares(n - 1);
      }
   }
}