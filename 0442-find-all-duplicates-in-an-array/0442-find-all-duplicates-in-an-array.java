
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int n = nums.length;

        while (i < n) {
            int ele = nums[i];

            if (ele != i + 1 && ele != nums[ele - 1]) {
                int temp = nums[i];
                nums[i] = nums[ele - 1];
                nums[ele - 1] = temp;
            } else {
                i++;
            }
        }

        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                list.add(nums[i]);
            }
        }

        return list;
    }
}
