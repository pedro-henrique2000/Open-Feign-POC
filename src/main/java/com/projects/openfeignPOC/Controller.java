package com.projects.openfeignPOC;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class Controller {

    private final ProductClient productClient;

    @GetMapping
    public ProductResponse findAll() {
        log.info("Searching All Products");
        ProductResponse posts = productClient.getPosts();
        return posts;
    }

}
