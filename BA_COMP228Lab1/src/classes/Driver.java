package classes;

public class Driver {

	public static void main(String[] args) {
		Singers s1 = new Singers();

		System.out.println("Default Singer ID: " + s1.getID());
        System.out.println("Default Name: " + s1.getName());
        System.out.println("Default Address: " + s1.getAddress());
        System.out.println("Default Date of Birth: " + s1.getDOB());
        System.out.println("Default Published Albums: " + s1.getAlbums());
        
        System.out.println("------------------------------------");
        System.out.println("Individual Setters:");
        
        s1.setID(101);
        s1.setName("James Corden");
        s1.setAddress("Steet 227, XX Drive");
        s1.setDOB("August 22 1978");
        s1.setAlbums(99);
        
        System.out.println("Set Singer ID: " + s1.getID());
        System.out.println("Set Name: " + s1.getName());
        System.out.println("Set Address: " + s1.getAddress());
        System.out.println("Set Date of Birth: " + s1.getDOB());
        System.out.println("Set Published Albums: " + s1.getAlbums());
        
        System.out.println("------------------------------------");
        System.out.println("One Setter:");
        
        s1.setAllValues(102, "Elvis Presley", "Tupelo, Mississippi, United States", "August 16 1977", 57);
        
        System.out.println("Set Singer ID: " + s1.getID());
        System.out.println("Set Name: " + s1.getName());
        System.out.println("Set Address: " + s1.getAddress());
        System.out.println("Set Date of Birth: " + s1.getDOB());
        System.out.println("Set Published Albums: " + s1.getAlbums());
        
	}

}
