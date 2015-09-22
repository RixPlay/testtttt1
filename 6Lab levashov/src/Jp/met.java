package Jp;

public class met {
	public void S(int s[]){
		int min = 0;
		int imin = 0;
		int temp = 0;
		for (int i = 0; i < s.length;i++){
			 min = s[i];
			 imin = i;
			 for (int d = i+1; d < s.length;d++){
				 if (s[d] < min){
					 min = s[d];
					 imin = d;
				 }
			 }
			 if (i != imin){
				 temp = s[i];
				 s[i] = s[imin];
				 s[imin] = temp;
			 }
		}
		for (int f = 0;f < s.length;f++){
			System.out.print("="+s[f]);
		}
	}
		public void S2(int s2[]){
		for ( int i = s2.length;i>=2; i--){
			boolean sorted = true;
			for (int j = 0; j < i;j++){
				 if (s2[j] > s2[j+1]) {
			            int temp = s2[j];
			            s2[j] = s2[j+1];
			            s2[j+1] = temp;
			            sorted = false;
			        }
			}
			 if(sorted) {
			        break;
			    }
		}
		for(int f = 0; f<s2.length;f++){
			System.out.println(" "+s2[f]);
		}
	}
}