public class m5_8{
    public static void main(String[] args){
        int kVal=5;
        int factorial=1;
        while(kVal>1){
           factorial *= kVal;
           kVal -=1;
        }
    //  while(kVal>1){
    //     factorial *= kVal--;
    //  }
        System.out.println(factorial);
     }
}