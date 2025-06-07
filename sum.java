public class sum{
    public static int summation(){
        int sum = 0;
        for(int i = 0; i < 100; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(summation());
    }
}