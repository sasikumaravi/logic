package arrayLogics;

public class CommonPrefix {
	public static void main(String[] args) {
		String[] g= {"ramara","ramanathan","rajan","rasath"};
		String com=g[1];
		for(int i=0;i<g.length;i++) {
			while(g[i].indexOf(com)!=0) {
				//System.out.println(g[i]);
				com=com.substring(0,com.length()-1);
				
			}
		}
		System.out.println(com);
		
	}
}
