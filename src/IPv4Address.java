
public class IPv4Address {
	
	private int[] address;
	private String[] addressBinary;
	private String[] addressHex;
	
	public IPv4Address() {
		address = new int[4]; // always has 4 8-bit components
		addressBinary = new String[4]; //always has 4 8-bit components
	}
	
	// convert any decimal address array(ints) to a binary address array(Strings)
	public String[] decimalToBinary(int[] decimalAddr) {
		String[] binaryAddr = new String[4];
		for(int i=0; i<4; i++) {
			binaryAddr[i] = Integer.toBinaryString(decimalAddr[i]);
		}
		return binaryAddr;
	}
	
	// convert any binary address array (Strings) into a decimal address array(ints)
	public static void binaryToDecimal() {
		
	}
	
	public void setAddressComponent(String addrComponent, int index) {
		address[index] = Integer.parseInt(addrComponent);
	}

	public String getaddress() {
		return address[0]+"."+address[1]+"."+address[2]+"."+address[3];
	}
	
	public String getBinaryAddress() {
		return addressBinary[0]+"."+addressBinary[1]+"."+addressBinary[2]+"."+addressBinary[3];
	}
	
	public String getHexAddress() {
		// hex conversion goes here 
		
		//return addressHex[0]+"."+addressHex[1]+"."+addressHex[2]+"."+addressHex[3];
		
		return null;
	}

}
