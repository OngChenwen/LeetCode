package Amazon;

// TODO: 2022-01-20 Need know the output format 
public class GroupAverage {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,2,3};
        System.out.println(helper(arr));
    }

    static int helper(int[] arr){
        int n = arr.length, min = Integer.MAX_VALUE,res = 0;
        int[] pre = new int[n];
        pre[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pre[i] = arr[i] + pre[i - 1];
        }

        for (int i = 0; i < n - 1; i++) {
            int leftAv = pre[i]/(i + 1);
            int rightAv = (pre[n - 1] - pre[i])/(n - i - 1);

             if(Math.abs(leftAv - rightAv) < min) {
                 min = Math.abs(leftAv - rightAv);
                 res = i;
             }
        }


        return res + 1;
    }
}
