import java.util.*;  

class Solution {
    public boolean containsDuplicate(int[] nums) {
                Hashtable<Integer, Integer> table = new Hashtable<>();


        for (int i = 0; i < nums.length; i++) {
                 int x=nums[i];
            if (table.get(x) != null)
                table.put(x, table.get(x) + 1);
            else
                table.put(x, 1);
        }
        for (int i = 0; i < table.size(); i++) {
            if (table.get(nums[i]) > 1) {
return true;           
            }

        }
        return false;       
    }
}