package com.projects.openfeignPOC;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.web.bind.annotation.RestController
@RequiredArgsConstructor
@Slf4j
public class RestController {

    private final ProductClient productClient;

    @GetMapping
    public ProductResponse findAll() {
        log.info("Searching All Products");
        return productClient.getPosts();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable int id) {
        log.info("Searching All Products");
        return productClient.findById(id);
    }

}
