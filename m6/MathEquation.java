public class MathEquation{
    public double leftVal;
    public double rightVal;
    public char opcode;
    public double result;
    
    public void execute(){
        switch (opcode){
        case 'a':
            result=leftVal+rightVal;
            break;
        case 's':
            result=leftVal-rightVal;
            break;
        case 'm':
            result= leftVal*rightVal;
            break;
        case 'd':
            result= rightVal!=0 ? leftVal/rightVal : 0.0d;
            break;
        default: 
            System.out.println("invalid opcode encountered");
            result= 0.0d;
            break;
    }
    }
}
 