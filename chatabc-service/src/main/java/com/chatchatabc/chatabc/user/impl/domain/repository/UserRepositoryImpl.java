package com.chatchatabc.chatabc.user.impl.domain.repository;

import com.chatchatabc.chatabc.user.domain.model.User;
import com.chatchatabc.chatabc.user.domain.repository.UserRepository;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Repository
public class UserRepositoryImpl implements UserRepository {
    private final Map<Long, User> users = new HashMap<>();

    public UserRepositoryImpl() {
        User user = new User();
        user.setId(1L);
        user.setNick("davao007");
        user.setCreatedAt(new Date());
        users.put(user.getId(), user);
    }

    @Override
    public @Nullable User findUserById(Long id) {
        return users.get(id);
    }

    @Override
    public Long create(@NotNull User user) {
        long id = users.size() + 1L;
        user.setId(id);
        user.setCreatedAt(new Date());
        users.put(id, user);
        return id;
    }

    @Override
    public void update(@NotNull User user) {
        users.put(user.getId(), user);
    }
}
