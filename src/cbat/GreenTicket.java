package cbat;

public class GreenTicket {
	public int greenTicket(int a, int b, int c) {
		  if(a==b && b==c)
			  return 20;
		  return (a!=b && (a!=c) && (b!=c)) ? 0 : 10;
		  }
}

