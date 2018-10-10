
public class IPv4Address {
	
	private int[] ipAddr;
	private int[] ipAddrBinary;
	
	public IPv4Address() {
		ipAddr = new int[4];
	}
	
	public static void decimalToBinary() {
		
	}
	
	public static void binaryToDecimal() {
		
	}
	
	public String toString() {
		return ipAddr[0]+"."+ipAddr[1]+"."+ipAddr[2]+"."+ipAddr[3];
	}
	
	public void setAddressComponent(int index, int addrComp) {
		ipAddr[index] = addrComp;
	}

}
