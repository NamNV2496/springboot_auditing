package com.audittrail.controller;

import com.audittrail.domain.ItemTest;
import com.audittrail.domain.ItemTestFake;
import com.audittrail.repository.ItemFakeCreatedRepository;
import com.audittrail.repository.ItemRepository;
import com.audittrail.utils.CacheUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class AuditController {

    private final ItemRepository itemRepository;
    private final ItemFakeCreatedRepository itemFakeCreatedRepository;

    @PostMapping("/testAuditing")
    public ItemTest testAuditing(@RequestBody ItemTest item) {
        ItemTest itemTest = itemRepository.save(item);
        return itemTest;
    }

    @PatchMapping("/patch")
    public ItemTest patchMethod(@RequestBody ItemTest item) {
        ItemTest itemTest = itemRepository.findById(item.getId()).orElseThrow();
        itemTest.setName(item.getName());
        itemRepository.save(itemTest);
        return itemTest;
    }


    @GetMapping("/testImportStaticClass")
    public String testImportStaticClass() {
        return CacheUtils.getRedis();
    }


    @PostMapping("/testFakeCreatedDate")
    public ItemTestFake testFakeCreatedDate(@RequestBody ItemTestFake item) {
        ItemTestFake itemTest = itemFakeCreatedRepository.save(item);
        return itemTest;
    }
}
