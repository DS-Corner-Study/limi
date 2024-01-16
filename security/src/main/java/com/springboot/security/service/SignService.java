package com.springboot.security.service;

public interface SignService {

    SignUpResultDto signup(String id, String password, String name, String role);

    SignUpResultDto signIn(String id, String password) throws RuntimeException;
}
