package ua.ucu.edu.flowers;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FlowerService {

    public FlowerRepository flowerRepository;

    public FlowerService(FlowerRepository flowerRepository){
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }

    public void add(Flower flower) {
        flowerRepository.save(flower);
    }
    
}
