package newfrist;

public class mayn {
	
	    public static void main(String[] args) {
	       
	        Chien chien = new Chien();
	        Chat chat = new Chat();
	        
	        chien.setNom("SOFFY");
	        chien.setAge(5);

	        chat.setNom("PIOVIA");
	        chat.setAge(3);
	        
	        System.out.println("Son du chien :");
	        chien.faireSon();

	        System.out.println("\nSon du chat :");
	        chat.faireSon();
	    }
}
