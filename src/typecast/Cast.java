package typecast;

import java.util.Scanner;

public class Cast {

	public static void main(String[] args) {
	
		byte b;
		
		short s;
		
		int i;
		
		long l;
		
        float f;
        
        double d;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the byte variable ");
        
        b=sc.nextByte();
        
        System.out.println("Enter the short variable ");
        
        s=sc.nextShort();
        
        i= b+s;
        System.out.println("The sum of byte and short is:" +i);
        
        l=i+s;
        System.out.println("The sum of integer and short is:" +l);
        
        f=(float)(i+l);
        System.out.println("The sum of integer and long casted to float is:" +f );
        
        d=(double)(l+f);
        System.out.println("The sum of integer and float casted to double is:" +d );
        
        
        
        
        
        
        
        
        
        		
        		
        
        
	}

}
