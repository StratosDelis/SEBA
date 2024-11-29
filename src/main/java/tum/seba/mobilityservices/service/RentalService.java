package tum.seba.mobilityservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import tum.seba.mobilityservices.entity.Rental;
import tum.seba.mobilityservices.repository.RentalRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RentalService  {
    @Autowired
    private RentalRepository rentalRepository;

    //C : save a rental
    public Rental saveRental(Rental rental){
        return rentalRepository.save(rental);
    }
    //R: find all rentals
    public List<Rental> findAll(){
        return rentalRepository.findAll();
    }
    //R: find rental by id
    public Rental findRentalbyId(int rentalid){
         Optional<Rental> foundrental = rentalRepository.findById(rentalid);
         return foundrental.orElse(null);
    }
    //D: delete rental by id
    public void deleteRentalById(int rentalid){
        try{
            rentalRepository.deleteById(rentalid);
        }catch(Exception e){
            System.out.println("Unable to delete rental with id:"+rentalid);
        }
    }

    
}
