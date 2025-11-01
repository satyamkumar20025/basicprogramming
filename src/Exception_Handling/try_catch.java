package Exception_Handling;

//*******************
//*******************Arithmetic_exception
class try_catch {
	public static void main(String[] args) {

try {
	int a = 100;
	int b = 1;
    int don = 100/1;

    System.out.print("Answer is"+don);
}
catch(Exception e) {
	System.out.println("ans hai"+e);
}
finally {
	int num =110/0;
	System.out.print("finally is alway executes"+num);
}
     }
}

	
