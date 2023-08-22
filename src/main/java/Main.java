import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Main {


        public static void main(String[] args) {
                UnicornDAO unicornDAO = new UnicornDAO();

                // Create
                Unicorn newUnicorn = new Unicorn("Sparkle", 5, 90);
                Unicorn createdUnicorn = unicornDAO.save(newUnicorn);

                // Read
                Unicorn foundUnicorn = unicornDAO.findById(createdUnicorn.getId());
                System.out.println("Found Unicorn: " + foundUnicorn.getName());

                // Update
                foundUnicorn.setAge(6);
                Unicorn updatedUnicorn = unicornDAO.update(foundUnicorn);
                System.out.println("Updated Unicorn Age: " + updatedUnicorn.getAge());

                // Delete
                //unicornDAO.delete(createdUnicorn.getId());

                unicornDAO.close();
        }
}

