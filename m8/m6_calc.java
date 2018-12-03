public class m6_calc{
    public static void main (String[] args)
    {
         // MathEquation testequation = new MathEquation();
         //testequation.execute();
         //System.out.println(testEquation.getResult());
        
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d',100.0d,50.0d);
        equations[1] = new MathEquation('a',25.0d,92.0d);
        equations[2] = new MathEquation('s',225.0d,17.0d);
        equations[3] = new MathEquation('m',11.0d,3.0d);
                        
    for(MathEquation equation : equations)
        {
        equation.execute();
        System.out.println(equation.getResult());
        }
        double leftdouble=9.0d;
        double rightdouble=4.0d;
        //int leftint = 9;
        //int rightint=4;
        
        MathEquation equationoverload = new MathEquation('d');
        
        equationoverload.execute(leftdouble,rightdouble);
        System.out.println(equationoverload.getResult());
    }
    
  
    }


        