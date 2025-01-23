package Practice;

public class WordIndexReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Hi good evening"; 
		
		String [] arr=name.split(" ");
		String rev="";
		
		for(int i=arr.length-1;i>=0;i--) {
			rev=rev+arr[i]+" ";
			
		}
		System.out.print(rev);
	}

}
