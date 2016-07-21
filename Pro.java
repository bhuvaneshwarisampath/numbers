/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;

/**
 *
 * @author Student
 */
public class Pro {

    /**
     * @param args the command line arguments
     */
   // public String longestCommonPrefix(String[] strs) {
    public static void main(String[] args) {
        // TODO code application logic here
        public String longestCommonPrefix(String[] strs) {
    String longestPrefix = "";
    if(strs.length>0){
        longestPrefix = strs[0];
    }
    for(int i=1; i<strs.length; i++){
        String analyzing = strs[i];
        int j=0;
        for(; j<Math.min(longestPrefix.length(), strs[i].length()); j++){
            if(longestPrefix.charAt(j) != analyzing.charAt(j)){
                break;
            }
        }
       longestPrefix = strs[i].substring(0, j);
   }
    return longestPrefix;
}
    }

