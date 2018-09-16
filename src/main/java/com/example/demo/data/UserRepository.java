package com.example.demo.data;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author churinaav
 * @since 14.09.2018
 **/
public interface UserRepository extends JpaRepository<Chapter, Long> {
}
