public class m5_calc{
    public static void main (String[] args){
        double[] leftVals = {100.0d,25.0d,225.0d,11.0d};
        double[] rightVals = {50.0d,92.0d,17.0d,3.0d};
        char[] opcodes = {'d','a','s','m'};
        double[] results = new double[opcodes.length];
        
        for (int i=0;i<opcodes.length;i++){
            if(opcodes[i] == 'd')
                results[i]= rightVals[i]!=0.0d?leftVals[i]/rightVals[i]:0.0d;
            else if (opcodes[i] == 'a')
                results[i] = leftVals[i]+rightVals[i];
            else if (opcodes[i] == 's')
                results[i] =leftVals[i]-rightVals[i];
            else if (opcodes[i] == 'm')
                results[i] = rightVals[i]*leftVals[i];
            else 
                results[i] = 0.0d;
                }
            for (int i=0;i<opcodes.length;i++)
        // for (double result : results)
            System.out.println(results[i]);
    }
}
        