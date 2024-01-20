package com.microservicos.java.Repository;

import com.microservicos.java.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    List<User> queryByNomeLike(String nome);

    User findByCpf(String cpf);
}
