/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author tanujamahajan
 */
public class Product {
    
    private String name;
    private int price;
    private int id;
    private ImageIcon prdlogo;
    
    private ArrayList<Feature> features;    
    
    private static int count = 0;
    
    public Product() {
        count=count+1;
        id = count;
        features = new ArrayList<Feature>();
    }
    
    public ImageIcon getProductImage() {
        return prdlogo;
    }

    public void setProductImage(ImageIcon prdlogo) {
        this.prdlogo = prdlogo;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }
    
    public Feature addFeatures(Product product, String feature_name, Object value) {
        Feature new_features;
        new_features = new Feature(product,feature_name,value);
        this.features.add(new_features);
        return new_features;
        
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
