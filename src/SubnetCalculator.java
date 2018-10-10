/**
 *  hello yes hi what am I doing?????
 */
import java.util.Scanner;
import java.net.UnknownHostException;
public class SubnetCalculator {
	
	private char netClass;
	private IPv4Address ipAddr;
	private IPv4Address subnetMask;
	private IPv4Address networkAddr;
	private IPv4Address hostAddrMin;
	private IPv4Address hostAddrMax;
	private IPv4Address[] possibleSubnetMasks;
	private String wildCardMask;
	private String binaryMask;
	private String broadcastAddress;
	private int cidr;
	private int subnetBits;
	private int maskBits;
	private int maxSubnets;
	private int hostsPerSubnet;
	
	private Scanner addressInput = new Scanner(System.in).useDelimiter(".");
	
	public SubnetCalculator() {
		// TODO ipv4 address initialization goes here?
	}
	
	//TODO test this method
	public void calculateNetworkAddress() {
		networkAddr = ipAddr.bitwiseAnd(subnetMask);
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

	// TODO: issue: does the main class or does the subCalc hold instances of the addresses?
	public void print() {
		System.out.println();
		System.out.println("Network class: " + netClass);
		//System.out.println("IPv4 Address: " + ipAddr.getaddress());
		//System.out.println("Binary Address: " + ipAddr.getBinaryAddress());
		//System.out.println("Hex Address: " + ipAddr.getHexAddress());
		
		//System.out.println("Subnet Mask: " + subnetMask.toString());
		//System.out.println("Network address: " + networkAddr);
		//System.out.println("Host Address Range: " + hostAddrMin + " - " + hostAddrMax);
		//System.out.println("Hex Address:" + hexAddr);
		
	}
	
	// calculate and return a list of possible subnet masks based on network class and IP address
	public String[] calcSubnetMaskOptionsList() {
		return null; 
		
	}
	
	// TODO fix input - remove test values
	public void setAddress(IPv4Address addr, String addrType) {
		String addressByte;
		//for (int i=0; i<4; i++) {
			//do { TODO: input validation for each byte, as they are entered(?)
//			System.out.print("Enter a valid" + addrType + " in the format X.X.X.X : ");
//			addressByte = addressInput.next(); 
//			addr.setAddressComponent(addressByte, 0);
//			addressByte = addressInput.next(); 
//			addr.setAddressComponent(addressByte, 1);
//			addressByte = addressInput.next(); 
//			addr.setAddressComponent(addressByte, 2);
//			addressByte = addressInput.next(); 
//			addr.setAddressComponent(addressByte, 3);
			//} while()
		//}
		if(addrType.equals("IP address")) {
			addr.setAddressComponent("192", 0);
			addr.setAddressComponent("182", 1);
			addr.setAddressComponent("172", 2);
			addr.setAddressComponent("162", 3);
		}
		if(addrType.equals("subnet mask")) {
			addr.setAddressComponent("255", 0);
			addr.setAddressComponent("255", 1);
			addr.setAddressComponent("255", 2);
			addr.setAddressComponent("0", 3);
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
		
		//TODO move the address initialization to their own methods (?)
		
		SubnetCalculator calc = new SubnetCalculator();
		IPv4Address ipAddress = new IPv4Address();
		IPv4Address subnetMask = new IPv4Address();
		IPv4Address networkAddress = new IPv4Address();
		
		Scanner genInput = new Scanner(System.in);
		Scanner addressInput = new Scanner(System.in).useDelimiter("."); 

		// set network class
//		String netClassStr;
//		do { // allow only "A", "B", or "C" as input for network class; break from loop only after verification
//			System.out.print("Enter a valid network class (A, B, or C): ");
//			netClassStr = genInput.next();
//		} while (!(netClassStr.equalsIgnoreCase("A") || netClassStr.equalsIgnoreCase("B") || netClassStr.equalsIgnoreCase("C")) ); 
//		calc.setNetClass(netClassStr);
		
		// set IP address
		calc.setAddress(ipAddress, "IP address");
				
		// set subnet mask
		calc.setAddress(subnetMask, "subnet mask");
		
		//TODO deal with the issue of listing possible subnet masks based on input
		
		// set network address
		networkAddress = ipAddress.bitwiseAnd(subnetMask);
		
		System.out.println();
		System.out.println("IPv4 Address: " + ipAddress.getAddress());
		//System.out.println("Binary Address: " + ipAddress.getBinaryAddress());
		System.out.println("Subnet Mask: " + subnetMask.getAddress());
		
		
		System.out.println("Network Address: " + networkAddress.getAddress());

	}

}
