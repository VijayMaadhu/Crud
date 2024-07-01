package com.example.Crud.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Crud.Entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
