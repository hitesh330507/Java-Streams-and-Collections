
// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
//         ArrayList<Integer> a=new ArrayList<>();
//         Arrays.sort(nums);
//         int n=nums.length;
//         int count=1;
//         int lim=n/3;
//         for(int i=0;i<n;i++)
//         {
//             if(n==0)
//             return a;
//             if(n==1){
//             a.add(nums[i]);
//             return a;
//             }
//             if(nums[i]!=nums[i-1]){
//             count=1;
//             continue;
//             }
//             else
//             count++;
//             if(count>lim)
//             a.add(nums[i]);
//         }
//         return a;
//     }
// }

// public class leetcode {
//     public static void main(String[] args) {
//         int[] nums = {1};
//         Solution solution = new Solution();
//         List<Integer> result = solution.majorityElement(nums);
//         System.out.println(result); // Output: [3]
//     }

// }
