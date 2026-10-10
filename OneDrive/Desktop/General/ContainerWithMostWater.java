class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end = height.length-1;
        int max=0;
        while(start < end){
            int h = Math.min(height[start],height[end]);
            int w = end - start;
            int area = h*w;
            max=Math.max(max,area);
            if(area > max){
                max = area;
            }if(height[start] < height[end]){
                start++;
            } else {
                end--;
            }
        }
        return max;
    }
}