/*
 * package com.example.demo.config;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.http.MediaType; import
 * org.springframework.web.reactive.function.server.RouterFunction; import
 * org.springframework.web.reactive.function.server.RouterFunctions; import
 * org.springframework.web.reactive.function.server.ServerResponse; import
 * static
 * org.springframework.web.reactive.function.server.RequestPredicates.GET;
 * import static
 * org.springframework.web.reactive.function.server.RequestPredicates.POST;
 * import static
 * org.springframework.web.reactive.function.server.RequestPredicates.PUT;
 * import static
 * org.springframework.web.reactive.function.server.RequestPredicates.DELETE;
 * import static
 * org.springframework.web.reactive.function.server.RequestPredicates.accept;
 * 
 * import com.example.demo.handler.UserHandler;
 * 
 * @Configuration public class RouterConfig {
 * 
 * @Bean RouterFunction<ServerResponse> routes(UserHandler handler) { return
 * RouterFunctions.route(GET("/handler/users").and(accept(MediaType.
 * APPLICATION_JSON)), handler::getAllUsers)
 * .andRoute(GET("/handler/users/{userId}").and(accept(MediaType.
 * APPLICATION_JSON)), handler::getUserById)
 * .andRoute(POST("/handler/users").and(accept(MediaType.APPLICATION_JSON)),
 * handler::create)
 * .andRoute(PUT("/handler/users/{userId}").and(accept(MediaType.
 * APPLICATION_JSON)), handler::updateUserById)
 * .andRoute(DELETE("/handler/users/{userId}").and(accept(MediaType.
 * APPLICATION_JSON)), handler::deleteUserById);
 * 
 * 
 * 
 * }
 * 
 * }
 */