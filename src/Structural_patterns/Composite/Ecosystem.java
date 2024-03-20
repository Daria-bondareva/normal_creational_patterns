package Structural_patterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class Ecosystem implements Plants{
    private List<Plants> plantsList = new ArrayList<Plants>();

    @Override
    public void Grow() {
        for(Plants plants: plantsList){
            plants.Grow();
        }
    }

    @Override
    public void Wilt() {
        for(Plants plants: plantsList){
            plants.Wilt();
        }
    }
    public void addPlants(Plants plant){
        plantsList.add(plant);
    }
    public void digUpPlants(Plants plant){
        plantsList.remove(plant);
    }
//    public void createEcosystem(){
//        System.out.println("An ecosystem is formed...\n");
//        for(Plants plant: plantsList){
//            plant.Grow();
//            plant.Wilt();
//        }
//    }
    public List<Plants> getPlantsList(){
        return plantsList;
    }

    public Plants getPlant(int index){
        return plantsList.get(index);
    }

}
