package QA.Sakila.VideoRental.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import QA.Sakila.VideoRental.springBootModel.DataModel;

public interface Repository extends JpaRepository<DataModel, Long> {

	 
}
