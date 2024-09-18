package com.project.uber.UberApp.repositories;

import com.project.uber.UberApp.entities.Driver;
import com.project.uber.UberApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<Driver, Long> {
}
