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
     
}
