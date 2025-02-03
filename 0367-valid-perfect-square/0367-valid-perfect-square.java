// class Solution {
//     public boolean isPerfectSquare(int num) {
//         int i=1;
//         while(num>=i)
//         {
//             if(i*i==num)
//               return true;
//           i++;
//         }
//       return false;
//     }
// }
class Solution {
    public boolean isPerfectSquare(int num) { 
        long i = 1;
            while(num >= i)
            {
                if(i*i == num)
                    return true;
            i++;
           }
        return false;     
    }
}