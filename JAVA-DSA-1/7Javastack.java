import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		 
		while (sc.hasNext()) {
			String s=sc.next();
            
            Stack<Character>st=new Stack<>();
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch=='(' || ch=='{' || ch=='[')
                {
                   st.push(ch); 
                }
               else if(!st.isEmpty() && ch=='}' && st.peek()=='{')  
                {

                    st.pop();
                }
                else if(!st.isEmpty() && ch==')' && st.peek()=='(')
                {
                    st.pop();
                }
                else if(!st.isEmpty() && ch==']' && st.peek()=='[')
                {
                    st.pop();
                }
                 else if (ch=='}' || ch==']' ||ch==')'){
                    st.push(ch);
                }
               
            }
           if(st.isEmpty())
           {
               System.out.println("true");
           }
           else{
               System.out.println("false");
           }
            //Complete the code
		}
		
	}
}

