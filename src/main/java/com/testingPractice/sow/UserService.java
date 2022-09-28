package com.testingPractice.sow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> show(){
        return (List<User>) userRepository.findAll();
    }

    public User saveUser(User user){
       return userRepository.save(user);
    }

    public User updateUser(Integer id) throws UserNotFoundException{
        Optional<User> result = userRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new UserNotFoundException("Could not find " + id);
        }
    }

    public void delete(Integer id) throws UserNotFoundException
    {
        Long count = userRepository.countById(id);
        if(count == null || count == 0){
            throw new UserNotFoundException("Invalid User");
        }
        userRepository.deleteById(id);
    }


}
