class ContinueDemo{

	public static void main(String args[]){

	/*
	for(int i=0;i<10;i++){
		continue;  // unreachable
		System.out.println("hii");
		continue;
	}*/ 
	
	/*for(int i=0;i<10;i++){
		if(i==5)
		{
			continue;  
		}

		System.out.println("hii " + i);
		
	}*/ 


	/*for(int i=0;i<10;i++){
		if(i%2==0)
		{
			continue;  
		}

		System.out.println("hii " + i);
		
	} 

	for(int i=1;i<10;i++){
		if(i%2==0)
		{
			break;
		}

		System.out.println("Hello " + i);
		
	} */

	/*for(int i=1;i<5;i++){
		for(int j=1;j<5;j++){
		
			if(j%2==0)
			{
			break;
			}

			System.out.println("Hello " + i);
		
		}
	System.out.println("inside first for loop");
	}
	*/



	/*
	for(int i=1;i<10;i++){
		if(i==1)
		{
			continue;
		}
		else{
			System.out.println("Hello " + i);
		}



		System.out.println("HII " + i);

		
		
	}*/

	/*for(int i=1;i<10;i++){
		if(i==1)
		{
			break;
		}
		else{
			System.out.println("Hello " + i);
		}



		System.out.println("HII " + i);

		
		
	}*/






	/*for(int i = 3 ; i>0 ; i--)
	{ 
		for(int j = 3 ; j>0 ; j--){
			if(j%2==0) {
				break ;
			}
			System.out.println("J "+ j );
		}
		System.out.println("I "+ i );
		
	}*/


	/*
	for(int i = 3 ; i>0 ; i--)
	{ 
		if(i%2==0) {
			continue;
			}
		for(int j = 3 ; j>0 ; j--){
			if(j%2==0) {
				continue;
			}
			System.out.println("J "+ j );
		}
		System.out.println("I "+ i );
		
	}*/

	

	/*for(int i=0;i<10;i++){
		
		if(true){
		 break;
		}
		System.out.println("hii");
		
	}*/


	for(int i=0;i<10;i++){
		 break;  // unreachable
		System.out.println("hii");
		
	}

	System.out.println("END");
	


}
}