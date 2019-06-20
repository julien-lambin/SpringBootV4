package com.kf.demo.model;

import java.util.List;

public class GameProduct {

    private List<Game> gameList;
    private List<Product> productList;


    public List<Game> getGameList() {
        return gameList;
    }

    public void setGameList(List<Game> gameList) {
        this.gameList = gameList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }


}
