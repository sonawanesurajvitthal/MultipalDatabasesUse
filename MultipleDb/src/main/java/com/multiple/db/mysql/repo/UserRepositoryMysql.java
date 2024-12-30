package com.multiple.db.mysql.repo;

import com.multiple.db.mysql.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryMysql extends JpaRepository<User, Integer> {
}
