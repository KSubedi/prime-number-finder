
public class PrimeNumbers {
	public static void main(String[] args){
		long num = 1000000000;
		long mod = 0;
		long tcount;
		long i;
		boolean isRunning;
		
		while(true){
			tcount = 0;
			i = 2;
			isRunning = true;
			
			while(isRunning){
				if(i>=num) isRunning = false;
				mod = num%i;
				if(mod == 0){
					isRunning = false;
				}else{
					tcount++;
					i++;
				}				
			}
			
			if(i==num && tcount != num){
				System.out.println("Prime Number Found: " + num);
			}
			
			
			num++;
		}
	}
}
