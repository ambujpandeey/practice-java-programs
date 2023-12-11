package aa;

public class TESTing {
	
	public static void main(String[] args) {
		
//        String input = "S/O: Abdul Majid Warshi, =sekhwaniya bujurg nari tol, Kushinagar, Uttar Pradesh - 274402";
//        String input = "C/O: Banshi Lal, 216 ward no 9 harjan colony jawad darvaja Nimbahera   Chittorgarh Rajasthan 312601";
        String input = "S/O @Lallan Prasad Upadhyay. * sohanpur, Kurmaut Urf Schanpur. Kuchinagar. Utx Pradesh, - 274304";

        String result = input.replaceAll("(?<![SWMDC]/)[^a-zA-Z0-9/, ]", "");
        result = result.replaceAll("\\s+", " ");
        
        System.out.println(result);
    }
}
