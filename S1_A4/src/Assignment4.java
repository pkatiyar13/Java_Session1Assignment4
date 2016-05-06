
public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	a. x + y * 2
		b. x - y + 2
		c. (x+y) * 2
		d. y % x*/
		int x = 5;
		int y = 10;
		int ans;
		
		//output of expression 1
		ans = x+(y*2);
		System.out.println("Output of expression (x + y * 2) is: "+ans);
		//output of expression 2
		ans = x-y+2;
		System.out.println("Output of expression (x - y + 2) is: "+ans);
		//output of expression 3
		ans = (x+y)*2;
		System.out.println("Output of expression ((x+y) * 2) is: "+ans);
		//output of expression 4
		ans = y%x;
		System.out.println("Output of expression (y % x) is: "+ans);
	}

}
