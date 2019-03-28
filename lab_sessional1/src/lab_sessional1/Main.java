package lab_sessional1;

public class Main {
	
	public static int[] getIndex(String s,char ch) {
		int size=getArrayIndex(s,ch);
		int[] arr=new int[size];
		int j=0;
		for(int i=0 ;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				arr[j]=i;;
				j++;
			}
			else {
				return null;
			}
		}
		return arr;
	}
	public static int getArrayIndex(String s,char ch) {
		int size=0;
	
		for(int i=0 ;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				size++;
			}
			else {
				return 0;
			}
		}
		return size;
	}

	public static void main(String[] args) {
		
		int[] c=getIndex("ali",'e');
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}

	}

}
