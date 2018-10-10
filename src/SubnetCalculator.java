/**
 *  hello yes hi what am I doing?????
 */
import java.util.Scanner;
import java.net.UnknownHostException;
public class SubnetCalculator {
	
	private char netClass;
	private IPv4Address ipAddr;
	private IPv4Address networkAddr;
	private IPv4Address hostAddrMin;
	private IPv4Address hostAddrMax;
	private IPv4Address[] possibleSubnetMasks;
	private String subnetMask;
	private String wildCardMask;
	private String binaryMask;
	private String broadcastAddress;
	private int cidr;
	private int subnetBits;
	private int maskBits;
	private int maxSubnets;
	private int hostsPerSubnet;

	public void print() {
		System.out.println();
		System.out.println("Network class: " + netClass);
		System.out.println("IPv4 Address: " + ipAddr.getaddress());
		System.out.println("Binary Address: " + ipAddr.getBinaryAddress());
		System.out.println("Hex Address: " + ipAddr.getHexAddress());
		
		//System.out.println("Subnet Mask: " + subnetMask.toString());
		//System.out.println("Network address: " + networkAddr);
		//System.out.println("Host Address Range: " + hostAddrMin + " - " + hostAddrMax);
		//System.out.println("Hex Address:" + hexAddr);
		
	}
	
	// calculate and return a list of possible subnet masks based on network class and IP address
	public String[] calcSubnetMaskOptionsList() {
		return null; 
		
	}
	
	// given a binary subnet mask and an ip address, both as strings,
	// determine the network part of the address and the host part of the address
	public void calcAddressComponents(String subnetMask, String ipAddress) {
		
		int[] result = new int[ipAddress.length()];
		
		for(int i=0; i<ipAddress.length(); i++) {
			result[i] = subnetMask.charAt(i) * ipAddress.charAt(i); //networkComponent = (subnetMask) AND (ipAddress)
			System.out.print(result[i]);
		}
		
	}
	
	public void setNetClass(String netClass) {
		this.netClass = netClass.charAt(0);
	}
	
	public void setIP(String ipAddrSectA, String i) {
	}
	
	public void setSubnetMask() {
		
	}

	public static void main(String[] args) {
		
		SubnetCalculator calc = new SubnetCalculator();
		IPv4Address ipAddress = new IPv4Address();
		
		Scanner genInput = new Scanner(System.in);
		Scanner addressInput = new Scanner(System.in).useDelimiter("."); 

		// prompt for network class
		String netClassStr;
		do { // allow only "A", "B", or "C" as input for network class; break from loop only after verification
			System.out.print("Enter a valid network class (A, B, or C): ");
			netClassStr = genInput.next();
		} while (!(netClassStr.equalsIgnoreCase("A") || netClassStr.equalsIgnoreCase("B") || netClassStr.equalsIgnoreCase("C")) ); 
		calc.setNetClass(netClassStr);
		
		// prompt for IP address
		String addressByte;
		for(int i=0; i<4; i++) { // address has 4 components which are stored as 4 separate array elements
		//do {
			System.out.print("Enter a valid IP Address in the format X.X.X.X : ");
			addressByte = addressInput.next(); 
			ipAddress.setAddressComponent(addressByte, i);
		//} while();
			//TODO add input validation		
		}
		
		//System.out.println("Enter a valid subnet mask, or press \"L\" to choose from a list: ");
		

	}

}
