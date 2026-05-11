class RecursiveMethod {
public static int knapsack(int wt[], int val[], int w, int n) {
   if(n==0 || w==0) {
     return 0;
   }
  
  if(wt[n-1] <= w) {
    return Math.max(val[n-1] + knapsack(wt, val, w-wt[n-1], n-1), knapsack(wt, val, w-wt[n-1], n-1));
  }
   else if(wt[n-1] > w) {
    return knapsack(wt, val, w-wt[n-1], n-1);
  }
}
  public static void main(String args[]) {
     int[] val = {1, 2, 3};
     int[] wt = {4, 5, 1};
     int w = 4;
     int n = val.length;
    System.out.println(knapsack(wt,val,w,n));
  }
}
