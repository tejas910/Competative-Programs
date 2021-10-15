package Array;

// 1234006 = 1+2+3 = 6 and 0+0+6 = 6 so number is balanced
public class CheckNumberisBala {
	public static void main(String[] args) {
		String s = "1234006";
		char[] arr = s.toCharArray();
		int n = arr[arr.length/2];
		int left = 0;
		int right = 0;
		for(int i=0;i<arr.length;i++) {
			if(n == arr[i])
			{
				continue;
			}
			else if(i<arr.length/2) {
				left = left + arr[i];
			}
			else {
				right = right + arr[i];
			}
			
		}
		System.out.println(left + " " + right);
		if(left == right) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
