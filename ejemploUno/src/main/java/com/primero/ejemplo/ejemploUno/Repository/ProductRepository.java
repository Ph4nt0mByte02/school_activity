package com.primero.ejemplo.ejemploUno.Repository;

import com.primero.ejemplo.ejemploUno.Model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Collection;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long> {
    // Collection<Object> findByIdDTO(Long id);
    // Al heredar de JpaRepository, Spring genera automáticamente
    // métodos como .save(), .findAll(), .findById(), etc.
}

/* Para no escribir el método que extiende desde JpaRepository, y tiene el efecto de no heredar los métodos, por lo que deben implementarse
@Repository
public class ProductRepository {
}
*/
