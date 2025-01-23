package aman;

public class SeriesNumber {

	public static void main(String[] args) {
		 series(1,20);
	        
    }
    public static void series(int start,int ends)
    {    if(start<=ends)
    {
        System.out.println(start);
        series(start+1,ends);

	}

}
}
