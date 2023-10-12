package projeto.aulas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import projeto.aulas.model.User; 
import projeto.aulas.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Isabella");
        user.setUsername("Isa"); // Corrigido
        user.setPassword("123");

        repository.save(user);

        for (projeto.aulas.model.User u : repository.findAll()) {
            System.out.println(u);
        }
    }
}
