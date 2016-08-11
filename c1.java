package guvi;

public class c1 {
	public static String longestCommonPrefix(String[] s) {
	    String longestPrefix = "";
	    if(s.length>0){
	        longestPrefix = s[0];
	    }
	    for(int i=1; i<s.length; i++){
	        String analyzing = s[i];
	        int j=0;
	        for(; j<Math.min(longestPrefix.length(), s[i].length()); j++){
	            if(longestPrefix.charAt(j) != analyzing.charAt(j)){
	                break;
	            }
	        }
	        longestPrefix = s[i].substring(0, j);
	    }
	    return longestPrefix;
	}
	public static void main(String[] args) {
		String ar[]={"hello","welcome","waterbottle"};
		System.out.println(longestCommonPrefix(ar));
	}
}
