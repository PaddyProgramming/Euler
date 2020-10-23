
public class EulerProblem1
{
    public static void main(String[] args){
        boolean[] array = new boolean[1000];
        int sum = 0;
        
        for(int i = 3; i<array.length; i=i+3){
            array[i] = true;
        }
        
        for(int i = 5; i<array.length; i=i+5){
            array[i] = true;
        }
        
        for(int i = 0; i<array.length; i++){
            if(array[i] == true){
                sum += i;
                // System.out.println(array[i] + " " + i);
            }
        }   
        
        System.out.println(sum);
    }
}
