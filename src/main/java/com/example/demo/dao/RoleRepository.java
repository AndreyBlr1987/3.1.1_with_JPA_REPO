package com.example.demo.dao;

import com.example.demo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;


@Repository
public interface RoleRepository extends JpaRepository <Role, Integer> {

    Optional<Role> findByRole(String name);

    @Query( "SELECT  r from Role r where r.role=:name")
    Role getRoleByRole(String name);


}
