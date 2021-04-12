
public class DataTypeDemo {

	public static void main(String[] args) {
		int count = 1;
		int hexVal = 0x1F;
		//System.out.println(hexVal);
		int octVal = 011;
		//System.out.println(octVal);
		
		
		
		byte bb = 100 + 10; // 
		float f = 123.45F; 
		double d = 124.56D;
		
		short s = 2345;
		int j = s; //implicit
		
		//byte -128 to 127
		
		int i = 130; // 4 bytes
		byte b1 = (byte) i; // 1 byte //explicit
		
		System.out.println(b1);
		long l = 1234; //8 bytes
		float val = l; // 4 bytes //implicit
		
	}
	
	public void getDetails() {
		
	}

}
