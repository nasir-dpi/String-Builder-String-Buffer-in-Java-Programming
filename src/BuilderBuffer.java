import java.util.Scanner;

public class BuilderBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	StringBuilder a = new StringBuilder();
		
			a.append("Roll ");
			a.append('A');
			a.append(01 );
			a.insert(5, "unit");
				System.out.println(a);
				System.out.println();
				
				a.reverse();
					System.out.println(a);
					System.out.println();
					
					a.delete(0, 10);
					System.out.println(a);
					System.out.println();
					
					a.replace(0, 10, "UNIT-A");
					System.out.println(a);
					System.out.println();
					
		StringBuffer b = new StringBuffer("You ");
	
	
		b.append("Should do it");
	
			System.out.println(b);*/
		StringBuffer b = new StringBuffer();
		Scanner sc = new Scanner(System.in);
			b.append(sc.nextLine());
			System.out.println();
			System.out.println(b);
	}

}
