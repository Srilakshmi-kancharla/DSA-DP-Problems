class LongestCommonSubString {
  public static int logestSubString(String a, String b) {
     int n = a.length();
     int m = a.length();
     int t[][] = new int[n+1][m+1];
     for(int i=0; i<n+1; i++) {
       for(int j=0; j<m+1; j++) {
         if(i==0 || j==0) t[i][j] = 0;
       }
     }
    int max = 0;
    for(int i=1; i<n+1; i++) {
      for(int j=1; j<m+1; j++) {
        if(a.charAt(i-1) == b.charAt(j-1)) {
          t[i][j] = 1 + t[i-1][j-1];
          max = Math.max(max, t[i][j]);
        } else{
          t[i][j] = 0;
        }
      }
    }
    return max;
  }
  public static void main(String args[]) {
    String a = "abcd";
    String b = "abfce";
    System.out.println(logestSubString(a,b));
  }
}
