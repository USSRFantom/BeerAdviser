package com.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    List<String> getBrands (String color){
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")){
            brands.add("jack Amber");
            brands.add("red Moose");
        }else{
            brands.add("jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
