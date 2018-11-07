public class ArrayMethods{

  // Part 1

   public static int rowSum(int[][] ary, int x){
     int sum = 0;
     for ( int i = 0; i < ary[x].length; i++) {
       sum += ary[x][i];
     }
     return sum;
   }

    public static int columnSum(int[][] ary, int x){
      int sum = 0;
      for ( int i = 0; i < ary.length; i++) {
        if (ary[i].length > x )
        sum += ary[i][x];
      }
      return sum;
    }



    // Part 2

    public static int[] allRowSums(int[][] ary){
      int[] sums = new int[ary.length];
      for(int i = 0; i < ary.length; i++) {
        sums[i] = rowSum(ary,i);
      }
      return sums;
    }

     public static int[] allColSums(int[][] ary){
       int max = 0;
        for(int i = 0; i < ary.length; i++) {
          if(ary[i].length > max)
           max = ary[i].length;
          }

        int[] output = new int[max];
        for(int x =0 ; x < max; x++) {
          output[x] = columnSum(ary,x);
        }
        return output;
     }

     // Part 3

     public static boolean isRowMagic(int[][] ary){
       int[] c = allRowSums(ary);
       for(int i=0; i<c.length; i++) {
         if(c[i] != c[0])
         return false;
      }
     return true;
 }

    public static boolean isColumnMagic(int[][] ary){
      int[] c = allColSums(ary);
      for(int i=0; i<c.length; i++) {
        if(c[i] != c[0])
        return false;
     }
     return true;
   }


   public static String printArray(int[] ary) {
    String output = "[";
    for(int i=0; i<ary.length-1; i++) {
      output += ary[i] + ", ";
    }

    return output += ary[ary.length-1] + "]";

  }

  public static String printArray(int[][] ary) {
    String output = "[" + printArray(ary[0]) + ",\n";
    for(int i=1; i<ary.length-1; i++) {
      output += " " + printArray(ary[i]) + ",\n";
    }

    return output += " " + printArray(ary[ary.length-1]) + "]";

  }

  public static void main(String[] args) {
      int[][] a = {{1, 2, 3, 4}, {2, 1, 1, 2}, {4, 2}, {1, 3, 5}};
      System.out.println("int[][] a : ");
      System.out.println(printArray(a));
      /*
        [[1, 2, 3, 4],
         [2, 1, 1, 2],
         [4, 2],
         [1, 3, 5]]
      */

      System.out.println();

      System.out.println("rowSum(a,0) : " + rowSum(a,0));                        // 10
      System.out.println("rowSum(a,2) : " + rowSum(a,2));                        // 6
      System.out.println("rowSum(a,3) : " + rowSum(a,3));                        // 9
      System.out.print("allRowSums(a) : " + printArray(allRowSums(a)) + "\n");   // [10, 6, 6, 9]

      System.out.println();

      System.out.println("columnSum(a,0) : " + columnSum(a,0));                  // 8
      System.out.println("columnSum(a,2) : " + columnSum(a,2));                  // 9
      System.out.println("columnSum(a,3) : " + columnSum(a,3));                  // 6
      System.out.print("allColSums(a) : " + printArray(allColSums(a)) + "\n");   // [8, 8, 9, 6]

      System.out.println();

      int[][] b = {{1, 2, 3, 4}, {5, 5}, {2, 2, 4, 2}, {2, 1, 3, 4}};
      System.out.println("int[][] b : ");
      System.out.println(printArray(b));
      /*
        [[1, 2, 3, 4],
         [5, 5],
         [2, 2, 4, 2],
         [2, 1, 3, 4]]
      */

      System.out.println();

      System.out.println("isRowMagic(a) : " + isRowMagic(a));                    // false
      System.out.println("isRowMagic(b) : " + isRowMagic(b));                    // true
      System.out.print("allRowSums(b) : " + printArray(allRowSums(b)) + "\n");   // [10, 10, 10, 10]

      System.out.println();

      System.out.println("isColumnMagic(a) : " + isColumnMagic(a));              // false
      System.out.println("isColumnMagic(a) : " + isColumnMagic(b));              // true
      System.out.print("allColSums(b) : " + printArray(allColSums(b)) + "\n");   // [10, 10, 10, 10]

    }

}
