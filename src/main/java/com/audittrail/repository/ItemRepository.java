package com.audittrail.repository;


import com.audittrail.domain.ItemTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface ItemRepository extends JpaRepository<ItemTest, Long> {

}
