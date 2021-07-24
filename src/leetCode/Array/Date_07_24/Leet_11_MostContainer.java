package leetCode.Array.Date_07_24;

public class Leet_11_MostContainer {
    public int maxArea(int[] height){
        int left = 0, right = height.length - 1;
        int area = 0;
        while (left< right){
            area = Math.max((right - left) * Math.min(height[left],height[right]),area);
            if (height[left]<height[right]){
                left++;
            }
            if (height[left] > height[right]){
                right--;
            }
            left++;
        }
        return area;
    }
}
