public class Main {

    public static int getArea(int[] a, int i, int j){
        return Math.min(a[i],a[j])*(j-i);
    }

    public static int maxArea(int[] height){
        int len = height.length;
        int i=0;
        int j=len-1;
        int maxS=0;
        while (i<j){
            int s=getArea(height,i,j);
            if(maxS<s){
                maxS=s;
            }
            if(height[i]<height[j]){
                i++;
            }
            else {
                j--;
            }
        }
        return maxS;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

}
