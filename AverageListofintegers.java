import java.util.*;
public class AverageListofintegers
{
    public static void main(String args[]){
        
        List<Integer> l= Arrays.asList(12,15,16,37,98,35);
        
        int sum=0;
        if(l.isEmpty()){
            System.out.println("List is empty");
        }
        else{
            for(int i : l){
                sum=sum+i;
        }
        System.out.println("The average of the list is:"+ sum/(float)l.size());
    }

    }
}