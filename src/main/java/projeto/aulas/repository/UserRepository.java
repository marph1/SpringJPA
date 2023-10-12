package projeto.aulas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.aulas.model.User;

public interface UserRepository  extends JpaRepository<User, Integer>{
    
}
