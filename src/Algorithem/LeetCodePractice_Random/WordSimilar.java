package Algorithem.LeetCodePractice_Random;

public class WordSimilar {
    public boolean halvesAreAlike(String s) {

        String left = s.substring(0,s.length()/2);
        String right = s.substring(s.length()/2);

        int counter1 = count(left);
        int counter2 = count(right);

        if (counter1==counter2){
            return true;
        }else{
            return false;
        }
    }

    public int count(String s){
        int counter = 0;
        String newString = s.toLowerCase();
        for (int i = 0; i < newString.length(); i++) {
            if(newString.charAt(i) == 'a' || newString.charAt(i) == 'e' || newString.charAt(i) == 'i'
                    || newString.charAt(i) == 'o'|| newString.charAt(i) == 'u'
            ){
                counter++;
            }
        }
        return counter;
    }

}
