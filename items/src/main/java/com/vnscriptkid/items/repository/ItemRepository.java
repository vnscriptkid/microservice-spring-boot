package com.vnscriptkid.items.repository;

import com.vnscriptkid.items.entity.Item;

import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}