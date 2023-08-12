package com.umc.mada.custom.repository;

import com.umc.mada.custom.domain.CustomItem;
import com.umc.mada.custom.domain.HaveItem;
import com.umc.mada.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface HaveItemRepository extends JpaRepository<HaveItem, Long> {
//    Optional<HaveItem> findByCustomItemAndUser(CustomItem customItem, User user);
    Optional<HaveItem> findById(Long id);
    Optional<HaveItem> findByIdAndUser(Long id, User user);
    Optional<HaveItem> findByCustomItemAndUser(CustomItem customItem, User user);
    List<HaveItem> findByUser(User user);
    List<HaveItem> findByUserAndWearing(User user, boolean wearing);

    @Query("select h.customItem from HaveItem h where h.user = :user and h.wearing = :wearing")
    List<CustomItem> findCustomItemByUserAndWearing(@Param("user") User user, @Param("wearing") boolean wearing);
}
