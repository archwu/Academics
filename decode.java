import java.util.*;
public class lol {

	public static void main(String[] args) {
//		String hex = "CD2D64B8163FBB3BAE30D2FF8F27E34E128909669F74BBC26B032D339A850EB189F8F337942FB3B060DA8F33C892EB68414B0A87C66BFA2936CDFDBC38D2526C8061B7924C3B6E1EF4210E403239239B0A";
//	    StringBuilder output = new StringBuilder();
//	    for (int i = 0; i < hex.length(); i+=2) {
//	        String str = hex.substring(i, i+2);
//	        output.append((char)Integer.parseInt(str, 16));
//	    }
//	    System.out.println(output);
		hex2d();
		
	}
	
	public static void hex2d(){
		int inbyte;
		int[] counter = new int[256];
		for (int i=0;i<256;i++) counter[i]=0;

		String hex = "CD2D64B8163FBB3BAE30D2FF8F27E34E128909669F74BBC26B032D339A850EB189F8F337942FB3B060DA8F33C892EB68414B0A87C66BFA2936CDFDBC38D2526C8061B7924C3B6E1EF4210E403239239B0A";
		//int hexed = Integer.parseInt(hex, 16);
		ArrayList<String> hexarray  = new ArrayList<String>();
		ArrayList<Integer> hextodec = new ArrayList<Integer>();
		for (int i = 0; i < hex.length()-1; i+=2){
			hexarray.add(hex.substring(i, i+2));
			hextodec.add(Integer.parseInt(hex.substring(i, i+2), 16));
			
		}
		for(int j = 0; j<hextodec.size(); j++){
			System.out.println(hextodec.get(j)^32);
			counter[hextodec.get(j)^32]++;
		}
		System.out.println("");
	}
	
	
}
