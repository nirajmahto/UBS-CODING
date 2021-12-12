package hackerrank;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    private final HashMap<Furniture, Integer> ordrdFurniture;


    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
      ordrdFurniture = new HashMap<>();
    }
@override
    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the metho
        ordrdFurniture.put(type, ordrdFurniture.getOrDefault(type, 0) + furnitureCount);

    
    }
    
@override
    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the methodreturn 

        return ordrdFurniture;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
        
        float totalOrderCost = 0.0f;

        for (Entry<Furniture, Integer> e : ordrdFurniture.entrySet()) {

            int tatalUnits = e.getValue();

            float cost = e.getKey().cost();

            totalOrderCost += tatalUnits * cost;

        }

        return totalOrderCost;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        return ordrdFurniture.getOrDefault(type, 0);

 
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        if (!ordrdFurniture.containsKey(type)) {

            return 0.0f;

        }

        int tatalUnits = ordrdFurniture.get(type);

        return tatalUnits * type.cost();
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        return ordrdFurniture.values().stream().mapToInt(Integer::intValue).sum();
}
    }


   
