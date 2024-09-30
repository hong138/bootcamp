package com.bootcamp.demo;

import java.util.HashMap;
import java.util.Map;

public class FurnitureOrder implements FurnitureOrderInterface {
      /**
     * TODO: Create a map of Furniture items to order quantities
     */
    HashMap<Furniture, Integer> ordersOfFurnitures = new HashMap<>();

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
      this.ordersOfFurnitures = new HashMap<>();
        // TODO: Complete the constructor

    }
  @Override
    public void addToOrder(final Furniture type, final int furnitureCount) {
    if (ordersOfFurnitures == null)
      throw new IllegalArgumentException("No order add.");
    if (furnitureCount > 0) {
      int currentCount = ordersOfFurnitures.get(type);
      ordersOfFurnitures.put(type, currentCount + furnitureCount);
    } else {
      ordersOfFurnitures.put(type, furnitureCount);
    }
        // TODO: Complete the method
    }

  @Override
    public HashMap<Furniture, Integer> getOrderedFurniture() {
      // TODO: Complete the method
      return new HashMap<>(ordersOfFurnitures);
  }

  @Override
    public float getTotalOrderCost() {
    float totalCost = 0.0f;
    
    for (Map.Entry<Furniture, Integer> entry : ordersOfFurnitures.entrySet()) {
        Furniture type = entry.getKey();
        int quantity = entry.getValue();
        
        if (quantity > 0) { 
            totalCost += type.cost() * quantity;
        }
    }
    
    return totalCost;
}

  @Override
    public int getTypeCount(Furniture type) {
      int count = 0;

      if (ordersOfFurnitures.containsKey(type)) {
        count = ordersOfFurnitures.get(type); //
      }
        // TODO: Complete the method
        return count;
    }

  @Override
    public float getTypeCost(Furniture type) {
      float cost = 0.0f;
      if (ordersOfFurnitures.containsKey(type)) {
        cost = type.cost() * ordersOfFurnitures.get(type);
      }
      return cost;
        // TODO: Complete the method
    }

  @Override
    public int getTotalOrderQuantity() {
      int totalQuantity = 0;
      for (int quantity : ordersOfFurnitures.values()) {
        totalQuantity += quantity;
      }
        // TODO: Complete the method
        return totalQuantity;
    }
}
