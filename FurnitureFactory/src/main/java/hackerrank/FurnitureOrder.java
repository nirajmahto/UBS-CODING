package hackerrank;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    private final HashMap<Furniture, Integer> orderedFurniture;


    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
      orderedFurniture = new HashMap<>();
    }
@override
    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the metho
        orderedFurniture.put(type, orderedFurniture.getOrDefault(type, 0) + furnitureCount);

    
    }
    
@override
    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the methodreturn 

        return orderedFurniture;
    }
@override
    public float getTotalOrderCost() {
        // TODO: Complete the method
        
        float totalOrderCost = 0.0f;

        for (Entry<Furniture, Integer> e : orderedFurniture.entrySet()) {

            int tatalUnits = e.getValue();

            float cost = e.getKey().cost();

            totalOrderCost += tatalUnits * cost;

        }

        return totalOrderCost;
    }
@override
    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        return orderedFurniture.getOrDefault(type, 0);

 
    }
@override
    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        if (!orderedFurniture.containsKey(type)) {

            return 0.0f;

        }

        int tatalUnits = orderedFurniture.get(type);

        return tatalUnits * type.cost();
    }
@override
    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        return orderedFurniture.values().stream().mapToInt(Integer::intValue).sum();
}
    }


   
