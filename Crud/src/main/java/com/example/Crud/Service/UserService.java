package com.example.Crud.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Crud.Entity.User;
import com.example.Crud.Repository.UserRepository;

@Service
public class UserService {
	
@Autowired
private UserRepository userRepository;

	    public List<User> getAllUsers() {
	        return userRepository.findAll();
	    }

	    public Optional<User> getUserById(Long id) {
	        return userRepository.findById(id);
	    }

	    public User createUser(User user) {
	        return userRepository.save(user);
	    }
	    public User updateUser(Long id, User userDetails) {
	        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
	        user.setEmail(userDetails.getEmail());
	        user.setName(userDetails.getName());
	        return userRepository.save(user);
	    }

	    public void deleteUser(Long id) {
	        userRepository.deleteById(id);

}
}