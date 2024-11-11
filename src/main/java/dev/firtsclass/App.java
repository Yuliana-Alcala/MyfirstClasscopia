package dev.firtsclass;

import controller.ProgramController;
import models.Person;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
    
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

       ProgramController controller = new ProgramController();
       
        Person person1 = new Person("Luisa", "Alcalá", "z12345v", 1990, "España", 'H' );

        String personAttributes = controller.getPersonAttributes(person1);
        
        //llamar a la view para que me imprima        
        //printAtributesPerson(personAttributes);
      
         System.out.println(personAttributes);
        
    }

   
}
