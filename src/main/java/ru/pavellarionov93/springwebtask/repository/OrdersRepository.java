package ru.pavellarionov93.springwebtask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.pavellarionov93.springwebtask.entity.Order;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Order, Long> {

    @Modifying
    @Query("update Order t set t.title = :title where t.id = :id")
    void updateValue(@Param("id") Long id, @Param("title") String title);

    @Query(value = "select * from orders", nativeQuery = true)
    List<Order> getAll();


}
