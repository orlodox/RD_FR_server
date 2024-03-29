package com.example.demo.repo

import com.example.demo.domain.Item
import org.springframework.data.jpa.repository.JpaRepository


interface ItemRepo : JpaRepository<Item, Int>
