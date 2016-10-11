import org.omg.Messaging.SyncScopeHelper;

public class BieberFever {
	public static void main(String[] args) {
		baby("OH");
		baby("No");
	}
	public static void baby(String input){
		for(int i = 0; i < 3; i++){
			System.out.println("baby");
		}
		System.out.println(input);
		
	}
}