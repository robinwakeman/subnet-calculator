
import java.net.Inet4Address;
public class SubnetCalculator {
	
	private char netClass;
	private Inet4Address ipAddr; 
	private Inet4Address networkAddr;
	private Inet4Address hostAddrMin;
	private Inet4Address hostAddrMax;
	private String hexAddr;
	private Inet4Address subnetMask;
	private Inet4Address wildCardMask;
	private String binaryMask;
	private Inet4Address broadcastAddress;
	private int cidr;
	private int subnetBits;
	private int maskBits;
	private int maxSubnets;
	private int hostsPerSubnet;
	private int firstOctetMin;
	private int firstOctetMax;

	public static void main(String[] args) {
		
		SubnetCalculator calc = new SubnetCalculator();

		System.out.print("Enter network class: ");
		
		System.out.println("Enter IP Address: ");
		
		System.out.println("Enter a valid subnet mask, or press \"L\" to choose from a list: ");

	}

}
