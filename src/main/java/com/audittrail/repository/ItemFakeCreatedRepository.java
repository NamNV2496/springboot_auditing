package com.audittrail.repository;


import com.audittrail.domain.ItemTestFake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface ItemFakeCreatedRepository extends JpaRepository<ItemTestFake, Long> {

}
