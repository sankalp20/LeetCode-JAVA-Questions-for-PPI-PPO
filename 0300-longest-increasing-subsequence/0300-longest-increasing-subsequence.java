class Solution {
    public int lengthOfLIS(int[] nums){
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(list.isEmpty() || list.get(list.size() - 1) < nums[i])
                list.add(nums[i]);
            else if(list.contains(nums[i]))
                continue;
            else{
                int l = 0, r = list.size() -1;
                while(l <= r){
                    int mid = (l+r)/2;
                    if(list.get(mid) == nums[i])
                        break;
                    else if(list.get(mid) < nums[i])
                        l = mid + 1;
                    else
                        r = mid - 1;
                }
                list.set(l, nums[i]);
            }
        }
        return list.size();
    }
}

// ArrayList<Integer>list = new ArrayList<Integer>();
//         for(int i = 0; i<nums.length; i++)
//         {
//           if(list.isEmpty()||list.get(list.size()-1)<nums[i])
//           list.add(nums[i]);
//           else if(list.contains(nums[i]))
//           continue;
//           else
//           {
//             int l = 0,r=list.size()-1;
//             while(l<=r)
//             {
//               int mid = (l+r)/2;
//               if(list.get(mid)==nums[i])
//               break;
//               else if(list.get(mid)<nums[i])
//               l = mid+1;
//               else
//               r = mid-1;
//             }
//             list.set(l,nums[i]);
//           }
//         }
//         return list.size();