import java.util.*;

public class AddBinary{
    
    private String binary1;
    private String binary2;

    public AddBinary(String n, String m){
        this.binary1 = n;
        this.binary2 = m;
    }

    public String addBinary(){
        int b1 = Integer.parseInt(this.binary1, 2);
        int b2 = Integer.parseInt(this.binary2, 2);

        int sum = b1 + b2;

        String result = Integer.toBinaryString(sum);

        return result;
    }

    public static void main(String[] args){

        AddBinary test = new AddBinary("11", "1");
        
        System.out.println(test.addBinary());
    }
}