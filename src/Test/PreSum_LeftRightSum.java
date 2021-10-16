package Test;

public class PreSum_LeftRightSum {

    public static void main(String[] args) {
        int[] array = new int[]{6,2,3,4,6,5,10};
        int[] front_pre = new int [array.length];
        front_pre[0] = array[0];
        for(int i = 1; i < array.length;i++ ){
            front_pre[i] = array[i] + front_pre[i - 1];
        }

        int[] back_pre = new int[array.length];
        back_pre[array.length - 1] = array[array.length - 1];
        for(int i = array.length - 2; i >= 0; i-- ){
           back_pre[i] = back_pre[i + 1] + array[i];
        }


        for (int value : front_pre) {
            System.out.print(value + " ");
        }

        System.out.println();

        for (int value: back_pre) {
            System.out.print(value + " ");
        }

        int ans = 0;
        for (int i = 0; i < front_pre.length; i++) {
            if (front_pre[i] == back_pre[i]){
                ans = i;
                break;
            }
        }

//        System.out.println();
//        System.out.println(ans + " " + (array.length - ans));
    }
}
