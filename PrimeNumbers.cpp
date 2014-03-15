#include <iostream>

main()
{
	long num = 1000000000;
	long mod = 0;
	long tcount = 0;
	long i = 2;
	bool isRunning = true;

	while (true){
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
			std::cout << "Prime Number Found: " << num << "\n";
		}
		
		num++;
	}

	

	return 0;
}
