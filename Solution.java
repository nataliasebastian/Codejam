import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class Solution {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int T = entrada.nextInt();

		for (int t=1; t<=T; t++) {
			int N=entrada.nextInt(), B=entrada.nextInt();
			
			int[] arr= new int[N];
			
			for (int i =0; i<arr.length; i++) {
				arr[i]= entrada.nextInt();
			}
			
			Arrays.sort(arr);
			int resultado=0;
			int p=0;
			int sum=0;
			while (sum<B && p<arr.length) {
				if (sum+arr[p]<=B) {
					sum+=arr[p];
					resultado++;
					p++;
				}
				else {
					sum=B;
				}
			}
			
		
		
			
			System.out.println("Case #" + (t) + ": " + resultado);
			
			
		}
		}
	}


