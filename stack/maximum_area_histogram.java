import java.util.*;

class maximum_area_histogram {
    public static int[] nsr(int[] arr,int n){
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            if(s.isEmpty()){
                ans[i] =n;
            }else if(!s.isEmpty() && arr[s.peek()] < arr[i]){
                ans[i] = s.peek();
            }else if(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    ans[i] = n;
                }else{
                    ans[i] = s.peek();
                }
            }
            s.push(i);
        }
        return ans;
    }
    
    public static int[] nsl(int[] arr,int n){
         Stack<Integer> s = new Stack<Integer>();
        int[] ans= new int[n];
        for(int i=0;i<n;i++){
            if(s.isEmpty()){
                ans[i]=-1;
            }else if(!s.isEmpty() && arr[s.peek()] < arr[i]){
                ans[i] = s.peek();
            }else if(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    ans[i] = -1;
                }else{
                    ans[i] = s.peek();
                }
            }
            s.push(i);
        }
        return ans;   
    }
    
    public static int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int[] nsr_arr = nsr(arr,n);
        int[] nsl_arr = nsl(arr,n);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int diff = (nsr_arr[i] - nsl_arr[i] - 1)*arr[i];    
            if(diff>max)
                max = diff;
        }
        return max;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println(largestRectangleArea(arr));
    }
}