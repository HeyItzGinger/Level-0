
public class ForLoops {
	public static void main(String[] args) {
		for (int a = 0; a < 101; a++) {
			System.out.print(a + " ");
		}
		System.out.println();
		for(int b = 100; b>=0; b--){
			System.out.print(b + " ");
		}
		System.out.println();
		for(int c = 2; c<102; c+=2){
			System.out.print(c +" ");
		}
		System.out.println();
		for(int d = 1; d<100; d+= 2){
			System.out.print(d +" ");
		}
		System.out.println();
		for(int e = 1; e<502; e++)
			if(e%2 == 0){
				System.out.println(e + " even");
			}
				else if(e%2 == 1){
					System.out.println(e + " odd");
				}
			}
	}

