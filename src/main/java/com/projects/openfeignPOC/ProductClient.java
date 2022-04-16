package com.projects.openfeignPOC;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "product", url = "http://localhost:8080/products", configuration = MyConfiguration.class)
public interface ProductClient {
    @RequestMapping(method = RequestMethod.GET, value = "/list")
    ProductResponse getPosts();

    @RequestMapping(method = RequestMethod.GET, value = "/normal/{id}")
    Product findById(@PathVariable int id);
}
