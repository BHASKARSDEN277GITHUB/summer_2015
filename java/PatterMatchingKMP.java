package algos.pattern.matching;
import java.io.*;

public class PatterMatchingKMP {
	String pattern;
	String text;
	
	
	public PatterMatchingKMP(String pattern,String text){
		this.pattern=pattern;
		this.text=text;
	}

	int[] findLPS(){
		int i=1;
		int j=0;
		int m=pattern.length();
		int[] lps = new int[m];
		lps[0]=0;

		while(i<m){
			if(pattern.charAt(i)==pattern.charAt(j)){
				lps[i]=j+1;
				i++;
				j++;
			}else {
				if(j!=0){
					j=lps[j-1];
				}else {
					lps[i]=j;
					i++;
				}
			}

		}
		for(i=0;i<m;i++){
			System.out.println(lps[i]);
		}
		return lps;
	}
	
	
	boolean match(){
		int[] lps = findLPS();
		int i=0;
		int j=0;
		int m=pattern.length();
		int n=text.length();
		
		while(i<m&&j<n){
			if(pattern.charAt(i)==text.charAt(j)){
				i++;
				j++;

				if(i==m-1){
					return true;
				}
			}else {
				if(i!=0){
					i=lps[i-1];
				}else{
					j++;
				}
			}
		}
		return false;
	}
}

class driver{
	public static void main(String[] args){
		String text="bhaskarkaliabhaskar";
		String pattern="alia";
		PatterMatchingKMP var = new PatterMatchingKMP(pattern,text);
		if(var.match()){
			System.out.println("Pattern Found");
		}else {
			System.out.println("Pattern Not Found");
		}
	}
}
