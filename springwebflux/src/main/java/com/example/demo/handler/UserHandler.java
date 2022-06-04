/*
 * package com.example.demo.handler;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.MediaType; import
 * org.springframework.stereotype.Component; import
 * org.springframework.web.reactive.function.server.ServerRequest; import
 * org.springframework.web.reactive.function.server.ServerResponse;
 * 
 * 
 * import com.example.demo.data.User; import
 * com.example.demo.service.UserService;
 * 
 * import reactor.core.publisher.Mono;
 * 
 * @Component public class UserHandler {
 * 
 * @Autowired private UserService userService;
 * 
 * public Mono<ServerResponse> getAllUsers(ServerRequest request) { return
 * ServerResponse .ok() .contentType(MediaType.APPLICATION_JSON)
 * .body(userService.getAllUsers(), User.class); }
 * 
 * public Mono<ServerResponse> getUserById(ServerRequest request) { return
 * userService .findById(request.pathVariable("userId")) .flatMap(user ->
 * ServerResponse .ok() .contentType(MediaType.APPLICATION_JSON) .body(user,
 * User.class) ) .switchIfEmpty(ServerResponse.notFound().build()); }
 * 
 * public Mono<ServerResponse> create(ServerRequest request) { Mono<User> user =
 * request.bodyToMono(User.class);
 * 
 * return user .flatMap(u -> ServerResponse .status(HttpStatus.CREATED)
 * .contentType(MediaType.APPLICATION_JSON) .body(userService.createUser(u),
 * User.class) ); }
 * 
 * public Mono<ServerResponse> updateUserById(ServerRequest request) { String id
 * = request.pathVariable("userId"); Mono<User> updatedUser =
 * request.bodyToMono(User.class);
 * 
 * return updatedUser .flatMap(u -> ServerResponse .ok()
 * .contentType(MediaType.APPLICATION_JSON) .body(userService.updateUser(id, u),
 * User.class) ); }
 * 
 * public Mono<ServerResponse> deleteUserById(ServerRequest request){ return
 * userService.deleteUser(request.pathVariable("userId")) .flatMap(u ->
 * ServerResponse.ok().body(u, User.class))
 * .switchIfEmpty(ServerResponse.notFound().build()); }
 * 
 * }
 */