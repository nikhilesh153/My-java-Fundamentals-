public class m5_1{
    public static void main (String[] args){
        int V1 = 7;
        int V2 = 5;
        
        int Vmax = V1>V2 ? V1 : V2;
        
        System.out.println(Vmax);
        
        float students = 30;
        float rooms = 4;
        
        float studentsPerRoom = rooms == 0.0f ? 0.0f : students/rooms;
        
        System.out.println(studentsPerRoom);
    }
}

        