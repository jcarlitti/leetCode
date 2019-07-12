//Reverses a string using a char array
public class Tester{
    public static char[] reverse(String c){
        int len = c.length();
        char[] val = new char[len];

        for(int i = val.length - 1; i >= 0; i--){
            val[val.length-1-i] = (char)(c.charAt(i));
        }
        return val;
    }

    public static void main(String[] args){
        System.out.println(reverse("Hello"));
    }
}