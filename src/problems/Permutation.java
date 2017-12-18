package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         */
        String st="BCDE";
        StringBuffer strbf= new StringBuffer(st);
        perm(strbf, st.length());
    }

    private static void perm(StringBuffer st, int index) {
        if(index<=0)
        System.out.println(st);
    else{
        perm(st, index-1);
        int currPos=st.length()-index;
        for(int i=currPos+1; i<st.length(); i++){
            swap(st, currPos, i);
            perm(st, index-1);
            swap(st, i, currPos);
        }
    }
    }

    private static void swap(StringBuffer st, int pos1, int pos2) {
        char t1=st.charAt(pos1);
        st.setCharAt(pos1, st.charAt(pos2));
        st.setCharAt(pos2, t1);
    }
}
