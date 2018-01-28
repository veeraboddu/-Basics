package Core;

public class Solut {

	
	public static void main (String arg[]){
		
		String st= "()h[]e{}(((((((())))<<<<>>>><>";
		char c[] = st.toCharArray();
		int x=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0;
		for(int i=0;i<st.length();i++){
			
			if(c[i] == '>'){
				x=x+1;
				System.out.println(""+c[i]);
			}else if (c[i] == '<') {
				j=j+1;
			}else if (c[i] == '{') {
				k++;
			}else if (c[i] == '}') {
				l++;
			}else if (c[i] == '[') {
				m++;
			}else if (c[i] == ']') {
				n++;
			}else if (c[i] == '(') {
				o++;
			}else if (c[i] == ')') {
				p++;
			}
		}
		
		if (x == j )System.out.println("<> are equal");
		if (k == l )System.out.println("{} are equal");
		if (m == n )System.out.println("[] are equal");
		if (o == p )System.out.println("() are equal");
		
		
	}
}
