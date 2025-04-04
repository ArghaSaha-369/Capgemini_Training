package day_20_comparibleAndComparatorInterface;

class Leetcode34task {
    public int[] searchRange(int[] nums, int target) {
         int n=nums.length;
        if(n==0) return new int[]{-1,-1};
        // if(n==1) return new int[]{0,0};
        int f=first(nums,target);
        int l=last(nums,target);
        return new int[]{f,l};
    }
    public static int first(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                ans=Math.min(ans,mid);
                high=mid-1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else low=mid+1;
        }
        if (ans!=arr.length) return ans;
        return -1;
    }
    public static int last(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                ans=Math.max(ans,mid);
                low=mid+1;
            }
            else if(arr[mid]>target)
                high=mid-1;
            else 
                low=mid+1;
        }
        return ans;
        // return -1;
    }
}