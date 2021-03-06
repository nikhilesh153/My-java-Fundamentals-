public class MathEquation{
    private double leftVal;
    private double rightVal;
    private char opcode;
    private double result;
    
    public double getLeftVal(){return leftVal;}
    public void setLeftVal(double leftVal){this.leftVal=leftVal;}
    public double getRightVAl(){return rightVal;}
    public void setRightVal(double rightVal){this.rightVal=rightVal;}
    public char getOpcode(){return opcode;}
    public void setOpcode(char opcode){this.opcode = opcode;}
    public double getResult(){return result;}
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
 