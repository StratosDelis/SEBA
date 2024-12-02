package tum.seba.mobilityservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tum.seba.mobilityservices.entity.ServicePoint;
import tum.seba.mobilityservices.repository.ServicePointRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ServicePointService {
    @Autowired
    ServicePointRepository spRepository;

    //C : save service point
    public ServicePoint saveServicePoint(ServicePoint servicepoint){
        return spRepository.save(servicepoint);
    }

    //R: find all service points
    public List<ServicePoint> findAllServicePoints(){
        return spRepository.findAll();
    }

    //R : find service point by id
    public  ServicePoint findSpById(int spId){
        Optional<ServicePoint> foundSp = spRepository.findById(spId);
        return foundSp.orElse(null);

    }

    //D: delete service point
    public void deleteServicePoint(int spId){
        try{
        spRepository.deleteById(spId);
        }catch(Exception e){
            System.out.println("Unable to delete service point with id:"+spId);
        }
    }
    
}
