package com.example.demo.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.data.User;
import com.example.demo.repository.UserRepository;

import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@Service
@Transactional
public class UserService {

    public UserService(ReactiveMongoTemplate reactiveMongoTemplate, UserRepository userRepository) {
		super();
		this.reactiveMongoTemplate = reactiveMongoTemplate;
		this.userRepository = userRepository;
	}

	private final ReactiveMongoTemplate reactiveMongoTemplate;
    private final UserRepository userRepository;

    public Mono<User> createUser(User user){
        return userRepository.save(user);
    }

    public Flux<String> getAllUsers(){

    	List<String> users =  new ArrayList<String>();
    	users.add("Taqi");
    	CompletableFuture<List<String>> future = CompletableFuture.completedFuture(users);
    	Flux<String> flux = Mono.fromFuture(future).flatMapMany(Flux::fromIterable);
  return flux;
    	
    	
       /// return userRepository.findAll();
    }

    public Mono<User> findById(String userId){
        return userRepository.findById(userId);
    }

    public Mono<User> updateUser(String userId,  User user){
        return userRepository.findById(userId)
                .flatMap(dbUser -> {
                    dbUser.setAge(user.getAge());
                    dbUser.setSalary(user.getSalary());
                    return userRepository.save(dbUser);
                });
    }

    public Mono<User> deleteUser(String userId){
        return userRepository.findById(userId)
                .flatMap(existingUser -> userRepository.delete(existingUser)
                        .then(Mono.just(existingUser)));
    }

    public Flux<User> fetchUsers(String name) {
        Query query = new Query()
                .with(Sort
                        .by(Collections.singletonList(Sort.Order.asc("age")))
                );
        query.addCriteria(Criteria
                .where("name")
                .regex(name)
        );

        return reactiveMongoTemplate
                .find(query, User.class);
    }
}
