package daily;

public class Dates {
	public static void main(String[] args) throws InterruptedException {
		for(int i = 2002;i<=2003;i++) {
			for(int j =1;j<=12;j++) {
				for(int k = 1;k<=30;k++) {
					System.out.println("day: "+k+" month:"+j+" year: "+i);
					Thread.sleep(300);
				}
			}
		}
	}
}
