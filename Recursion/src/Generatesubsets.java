public class Generatesubsets {
    static void printSub(String str, String curr, int index){
        if(index==str.length()){
            System.out.println(curr);
            return;
        }
        printSub(str, curr, index+1);
        printSub(str, curr+str.charAt(index), index+1);
    }
    public static void main(String args[]){
        String str= "ABC";
        printSub(str, " ", 0);
    }
}
