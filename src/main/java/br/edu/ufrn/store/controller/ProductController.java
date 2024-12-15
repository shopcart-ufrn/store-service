package br.edu.ufrn.store.controller;

import br.edu.ufrn.store.dto.ProductDTO;
import br.edu.ufrn.store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("{id}")
    public ResponseEntity<ProductDTO> getProduct(@PathVariable Long id) {
        ProductDTO product = productService.findById(id);

        if(product == null) return null;

        return ResponseEntity.ok(product);
    }

    @PostMapping("/sell")
    public ResponseEntity<Long> save(@RequestBody ProductDTO product) throws InterruptedException {
        return ResponseEntity.ok(productService.save(product));
    }
}
