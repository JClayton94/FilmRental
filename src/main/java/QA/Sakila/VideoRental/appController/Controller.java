package QA.Sakila.VideoRental.appController;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import QA.Sakila.VideoRental.Repository.Repository;
import QA.Sakila.VideoRental.springBootModel.DataModel;



@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired 
	Repository myRepository;

	@CrossOrigin
	@GetMapping("/film")
	public List<DataModel> getAllFilms(){
		return myRepository.findAll();
	}
	
	
	

}
