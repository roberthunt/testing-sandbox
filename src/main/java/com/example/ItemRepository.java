package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by rob on 29/01/2016.
 */
public interface ItemRepository extends JpaRepository<Item, Integer>
{
    List findByCheckedTrue();
}
