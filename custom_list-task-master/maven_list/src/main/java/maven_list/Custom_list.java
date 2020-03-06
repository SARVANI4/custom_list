package maven_list;
import java.util.Arrays;

public class Custom_list {
	private Object[] ob=new Object[10];
	private int cnt=0;
	public void add(Object obj){
	if(cnt==ob.length)
	{
	increasecapacity();
	}
	ob[cnt]=obj;
	cnt++;
	}
	public void increasecapacity(){
	int newcapacity=ob.length*2;
	Object[] next=new Object[newcapacity];
	for(int i=0;i<ob.length;i++)
	{
	next[i]=ob[i];
	}
	ob=next;
	}
	public int size()
	{
	return cnt;
	}
	public void remove(int index)
	{
	if(index<0||index>=size())
	{
	throw new IndexOutOfBoundsException(""+index);
	}
	while(index<size()-1)
	{
	ob[index]=ob[index+1];
	index++;
	}
	ob[index]=null;
	cnt--;
	}
	public Object get(int index)
	{
	if(index<0||index>=size())
	{
	throw new IndexOutOfBoundsException(""+index);
	}
	return ob[index];
	}
	public String toString() 
	    {
	         StringBuilder sb = new StringBuilder();
	         sb.append('[');
	         for(int i = 0; i < size() ;i++) {
	             sb.append(ob[i].toString());
	             if(i<size()-1){
	                 sb.append(",");
	             }
	         }
	         sb.append(']');
	         return sb.toString();
	    }
	public static void main(String args[])
	{
	Custom_list l=new Custom_list();
	l.add(1);
	        l.add(2);
	        l.add(3);
	        System.out.println(l);
	         
	        l.remove(2);
	      System.out.println(l);
	         
	        System.out.println( l.get(0) );
	        System.out.println( l.get(1) );

	        System.out.println(l.size());
	    }
	}



