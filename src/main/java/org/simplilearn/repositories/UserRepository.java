package org.simplilearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.simplilearn.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
