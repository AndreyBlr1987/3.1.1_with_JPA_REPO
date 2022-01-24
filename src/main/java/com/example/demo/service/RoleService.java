package com.example.demo.service;


import com.example.demo.entity.Role;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;

public interface RoleService {

    List<Role> getAllRoles();

    Role findByRole(String name);

    HashSet<Role> getSetOfRoles(String[] roleNames);



    Role getById(int id);

}
