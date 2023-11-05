import java.util.*;
public class Main {
    public static void main(String[] args) {
        String str1="Build";
        String str2="duBli";
        String result=isAnagram(str1,str2);
        System.out.println(result);
    }
    public static String isAnagram(String str1,String str2){
        str1=str1.replaceAll("//s","").toLowerCase();
        str2=str2.replaceAll("//s","").toLowerCase();
        if((sorted(str1)).equals(sorted(str2))){
            return "Yes";
        }
        else{
            return "No";
        }
    }
    public static String sorted(String str){
        char[] value=str.toCharArray();
        Arrays.sort(value);
        return new String(value);
    }
}
