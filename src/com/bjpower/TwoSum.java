package com.bjpower;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	/**
	 * �������е� Ԫ�ش洢��map�У����鿴target��ȥ�����е�һ��Ԫ��֮�����ֵ�Ƿ�Ҳ������map��,
	 * �����ڣ���������������Ԫ�ص��±����������ʽ��
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if(nums == null || nums.length<2)
            return res;
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {                      
            if(map.containsKey(target-nums[i])) {
                res[0] = map.get(target-nums[i]);
                res[1] = i;
                return res;
            }
            map.put(nums[i],i); 
        }
        return res;
    }
	
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int[] twoSum = twoSum(nums, target);
		
		System.out.println(Arrays.toString(twoSum));
	}

}
