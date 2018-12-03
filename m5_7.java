public class m5_7{
    public static void main(String[] args){
        double Val1=100.0d;
        double Val2=50.0d;
        double result;
        char opcode='d';
        if (opcode == 'a')
            result=Val1+Val2;
        else if (opcode=='s')
            result=Val1-Val2;
        else if (opcode== 'm')
            result= Val1*Val2;
        else if (opcode== 'd')
            result = Val2!=0.0d?Val1/Val2:0.0d;
        else{
            System.out.println("Error-invalid opcode"); 
            result = 0.0d;
                }
        System.out.println(result);
            }
}
 