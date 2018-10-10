
public class IPv4Address {
	
	private int[] address;
	private String[] addressBinary;
	private String[] addressHex;
	
	public IPv4Address() {
		address = new int[4]; // always has 4 8-bit components
		addressBinary = new String[4]; //always has 4 8-bit components
	}
	
	// calculate and return network address
	public IPv4Address bitwiseAnd(IPv4Address subnetMask) {
		IPv4Address result = new IPv4Address();
		for(int i=0; i<4; i++) {
			int resultByte;
			resultByte = address[i] & subnetMask.getComponent(i);
			result.setAddressComponent(resultByte, i);
		}
		return result;
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
	
	private int getComponent(int index) { // for use in the IPv4Address bitwise AND comparison method 
		return address[index];
	}
	
	public void setAddressComponent(int addrComponent, int index) {
		address[index] = addrComponent;
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
