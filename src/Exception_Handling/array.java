package Exception_Handling;


//555555555555555555
//ArrayIndexOutOfBoundsException

class array {
	public static void main(String[] args) {


try {
	int arr[] = new int [5]; //5 element ke liye memory
	int boss = arr[9];

  System.out.print("Answer is"+arr[9]);
}
catch(Exception e) {
	System.out.println("ans hai"+e);
}
finally {
	int num[]=new int [1];
	int kala=num[5];
	System.out.print("finally is alway executes"+num);
}
   }
}

	



