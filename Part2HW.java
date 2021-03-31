package p2;

public class Part2HW {
public static void main(String[] args) {
		
		Part2HW app = new Part2HW();
		
		int arr[] = new int[5];
		int i = 0;
		arr = app.insertIntoArray(arr, 77, i++);
		arr = app.insertIntoArray(arr, 66, i++);
		arr = app.insertIntoArray(arr, 55, i++);
		arr = app.insertIntoArray(arr, 44, i++);
		arr = app.insertIntoArray(arr, 33, i++);
		
		app.printArray(arr);
		int data = app.getInformation(arr, 0);
		System.out.println("\n Information "+data);
		
		data = app.getInformation(arr, 4545);
		if(data<0) System.out.println(" Wrong Index");
		
		arr = app.insertIntoArray(arr, 88, i++);
		
		int minmax[]=app.getMinMax(arr);
		System.out.println("MinMax Value is : ");
		app.printArray(minmax);
		
		int multiples[]= app.getMultiplesOf(arr, 5);
		System.out.println("\n Multiples of 5 :");
		app.printArray(multiples);
		
		
	}
	
	public void printUsingEnhanceForLoop(int arr[])
	{
		// from java 1.5 onwards
		for (int myElement : arr) {
			myElement = myElement/2; //business operation , 100 lines of code 
			System.out.println(myElement);
		}
	}
	
	
	public int[] insertIntoArray(int arr[],int information,int position)
	{
		
		arr[position] = information;
		return arr;
		
	}
	
	public void printArray(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]+" ");
		}
	}
	public int getInformation(int arr[],int position)
	{
		if(position>arr.length)
		{
			return -1;
		}
		return arr[position];
	}
	
	// This method accept an array and the element to be searched and return the index value if element found
	// otherwise return -1;
	// as well as return -2 if array is empty
	public int searchElement(int [] arr,int n)
	{
		if(arr.length==0)
			return -2;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n)
				return i;
		}
		return -1;
	}
	
	/*
	 * this method returns an array of size 2, containing min and max number of the given array, 
	  and below method cannot invoke any other method
	 * Note:- display the returned array using printArray() method 
	 *  */
	public int[] getMinMax(int arr[])
	{
		int max=0,min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]<min)
				min=arr[j];
		}
		int ar1[]= {min,max};
		return ar1;
	}
	
	/*
	 * this method returns an array which contains the multiples of x, 
	  and below method cannot invoke any other method
	 * Note:- display the returned array using printArray() method 
	 *  */
	public int[] getMultiplesOf(int arr[],int x)
	{
		int j=0;
		int ar1[] = new int[5];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%x==0) {
				ar1[j]=arr[i];
				j++;
			}
		
		}
		return ar1;
	}
}
