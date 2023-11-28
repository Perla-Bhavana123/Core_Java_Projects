
public class Program4 {
	
		public static void main(String[] args) {
				
			     int count=1;
				System.out.println("entert value");
				int n=5;
				for(int i=1;i<=n;i++) {
					for(int j=n;j>=i;j--) {
						System.out.print(count+" ");
						count++;
					}
					System.out.println();
				}
				
			}

		}