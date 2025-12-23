
public class String_Concept_2 {

	public static void main(String[] args) {
		String str1="visa";
		String str2="visa";
		String str3=new String("Visa");
		String str4=new String("visa");
		if(str1.equalsIgnoreCase(str3)) {
			System.out.println("eql");
		}
		else {
			System.out.println("not eql");
		}

	}

}
