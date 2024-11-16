import java.util.ArrayList;
import java.util.List;

public class virtusaInterview {

	public static void main(String[] args) {
		
		Integer a [] = {2,24,36,46,52};
		
		
		// [2,24,52] = 62 [45,36] = 62+98 =160%2 = 80  { 
	
		Integer sum =0;
		for(int i=0; i<a.length; i++) {
			
			sum = sum+a[i];
			
		}
		if(sum % 2 == 0) {
			System.out.println("Breakable array");
			
			Integer sum2 = 0, i = 0;
			List<Integer> l1 = new ArrayList<>();
			List<Integer> l2 = new ArrayList<>();
			while(i < a.length)
			{
				sum2 = sum2+a[i];
				
				if(sum2 < sum/2)
				{
					
					
					l1.add(a[i]);
					i++;
					if(sum2 == sum%2)
						
						break;
	
				}
				else
				{
					l2.add(a[i]);
					i++;
				}
			}
			for(Integer b:l1) {
				System.out.println("List 1 "+b);
			}
			for(Integer c:l2) {
				System.out.println("List 2 "+c);
			}
		}
		else {
			System.out.println("Not Breakable array!");
		}
		
		
		

	}

}
