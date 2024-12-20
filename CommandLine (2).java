package oops;
//Accept user input using command line args
class CommandLine{

public static void main(String[] args){

	int sum=0;
	for(String s : args){
		int num= Integer.parseInt(s);
		sum += num;
	}
	System.out.println("Addition "+ sum);
   }
}