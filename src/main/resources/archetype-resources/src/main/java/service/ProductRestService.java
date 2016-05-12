package ${groupId}.${artifactId}.web;

import ${groupId}.${artifactId}.domain.Product;


public interface ProductRestService {

    public Payload getProductList();

    Payload getProductById(Integer id);

    public Payload createProduct(Product product);

    Payload updateProductById(Integer id, Product product);

    Payload deleteProductById(Integer id);
}
