/*
 * Given two arrays, write a function to compute their intersection.
 *
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 *
 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 *
 * Difficulty: easy
*/

class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set_1 = new HashSet<Integer>();
        HashSet<Integer> set_2 = new HashSet<Integer>();
        int n = Math.min(nums1.length, nums2.length);
        List<Integer> nums = new ArrayList<Integer>();
        int j=0;
        for(int i=0; i<nums1.length; i++) {
            if(!set_1.contains(nums1[i]))
                set_1.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++) {
            if(set_1.contains(nums2[i]) && !set_2.contains(nums2[i])) {
                nums.add(nums2[i]);
                set_2.add(nums2[i]);
            }
                
        }
        int[] num_array = new int[nums.size()];
        for(int i=0; i<nums.size(); i++) {
            num_array[i] = nums.get(i);
        }
        return num_array;
    }
}