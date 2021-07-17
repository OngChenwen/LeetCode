package Algorithm.LeetCodeOfferVersion6;

public class EditAway {

    public boolean oneEditAway(String first, String second) {
        int m = first.length() , n = second.length();
        if(Math.abs(m-n) > 1) return false;
        if(m == n){
            boolean bl = true;
            for(int i = 0 ; i < m ; i++){
                if(first.charAt(i) != second.charAt(i)){
                    if(bl){
                        bl = false;
                    }else{
                        return bl;
                    }
                }
            }
            return true;
        }
        if(m < n){
            int tmp = m;
            m = n;
            n = tmp;
            String s = first;
            first = second;
            second = s;
        }
        int index = 0;
        while(index < n){
            char f = first.charAt(index) , s = second.charAt(index);
            if(f != s){
                if(first.substring(index+1 , m).equals(second.substring(index,n))){
                    return true;
                }else{
                    return false;
                }
            }
            index++;
        }
        return true;
    }

}



