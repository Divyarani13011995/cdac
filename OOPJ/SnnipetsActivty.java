class Test
{
public static void main(String args[])

{

// int[] array = new int[-5];    
//System.out.println(new int[]{1, 2, 3, 4, 5}.length);
//System.out.println(new int[]{21, 14, 65, 24, 21}[5]);

	/*
	int[] array = new int[5];  
	int length = array.length;

	array = new int[length];

	System.out.println(length);
	*/

	/*int[] array = new int[5];  
	int[] arr = new int[10]; 
	System.out.println(array.length);
	System.out.println(arr.length);	
	array = arr; 

	System.out.println(array.length);
	System.out.println(arr.length);	*/

	// matrix operation  
	int[][] array1 = new int[2][2];  
	int[][] array2 = new int[2][2]; 
	int[][] addArray = new int[2][2];  
	
	for(int i = 0 ; i<2 ; i++){
	for(int j = 0 ; j<2 ; j++){
		array1[i][j]= 10;
	}
	}

	for(int i = 0 ; i<2 ; i++){
	for(int j = 0 ; j<2 ; j++){
		array2[i][j]= 20;
	}
	}

	for(int i = 0 ; i<2 ; i++){
	for(int j = 0 ; j<2 ; j++){
		System.out.print(array1[i][j]+" ");
		}
	System.out.println();
	}

	for(int i = 0 ; i<2 ; i++){
	for(int j = 0 ; j<2 ; j++){
		System.out.print(array2[i][j]+" ");
		}
	System.out.println();
	}
	

	for(int i = 0 ; i<2 ; i++){
		for(int j = 0 ; j<2 ; j++){
		addArray[i][j] = array1[i][j]+array2[i][j];
		}
	}
	
	for(int i = 0 ; i<2 ; i++){
	for(int j = 0 ; j<2 ; j++){
		System.out.print(addArray[i][j]+" ");
		}
	System.out.println();
	}
	
}
}
