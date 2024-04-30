package edu.iu.habahram.coffeeorder.security;

import edu.iu.habahram.coffeeorder.model.Customer;

import java.io.IOException;

public interface IAuthenticationService {
    boolean register(Customer customer) throws IOException;
    boolean login(String username, String password) throws IOException;
}