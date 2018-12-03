public class m5_3{
    public static void main (String[] args){
        int V1=10,V2 = 4, diff;
        if(V1>V2){
            diff = V1-V2;
            System.out.println("V1 is bigger");
            System.out.println(diff);
        }
        else if (V2>V1){
            diff = V2-V1;
            System.out.println("V2 is bigger");
            System.out.println(diff);
        }
        else
            System.out.println("V1 and V2 are equal");
    }
}
