import java.util.Scanner;
public class Assignment8 {
	public static String rem(String string) {
		String result = "";
		if(string.charAt(0) == 'A') {
		}
		else{
			result += string.charAt(0);
		}
		if(string.charAt(1) == 'A') {
		}
		else{
			result += string.charAt(1);
		}
		result += string.substring(2);
		return result;
	}
    public static void main( String[] args ){
    	Scanner sc=new Scanner(System.in);
    	String str=sc.nextLine();
    	System.out.println(rem(str));
    }
}
