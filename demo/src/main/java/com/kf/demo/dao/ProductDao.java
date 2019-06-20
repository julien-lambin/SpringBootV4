package com.kf.demo.dao;

import com.kf.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

    List <Product> findByPrixGreaterThan(int prixLimit);

    List <Product> findByNomLike(String recherche);

    @Query("SELECT id, nom FROM Product p WHERE p.prix > :prixLimit")
    List <Product> chercherUnProduitCher(@Param("prixLimit")int prix);
}