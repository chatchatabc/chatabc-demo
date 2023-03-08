package com.chatchatabc.chatabc.user.domain.repository;


import com.chatchatabc.chatabc.user.domain.model.User;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface UserRepository {
    @Nullable
    User findUserById(Long id);

    Long create(@NotNull User user);

    void update(@NotNull User user);
}
