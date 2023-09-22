//You have given a string A having Uppercase English letters.
//
//You have to find how many times subsequence "AG" is there in the given string.
//
//NOTE: Return the answer modulo 109 + 7 as the answer can be very large.

 //A = "ABCGAG"
//output =3
public class Special_SubsequencesAG {
     public int solve(String A) {

         int c = 0;
         int ans = 0;
         for (int i = A.length() - 1; i >= 0; i--) {
             if (A.charAt(i) == 'G') {
                 c++;
             }
             if (A.charAt(i) == 'A') {
                 ans += c;
             }

         }
         return ans;
     }
 }
