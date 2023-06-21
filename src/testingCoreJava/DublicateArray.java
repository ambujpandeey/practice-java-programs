package testingCoreJava;

class DublicateArray {
	public static void main(String[] args) {      
        
        //Initialize array   
        int [] arr =  {1, 2, 3, 4, 2, 7, 8, 8, 5, 7, 3};   
          
        System.out.println("Duplicate elements in given array: ");
        
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[i]);  
            }  
        }  
    }
	
}

