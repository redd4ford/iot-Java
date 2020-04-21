package ua.lviv.iot.constructiongoods.rest.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.constructiongoods.model.Bath;

@Repository
public interface BathRepository extends JpaRepository<Bath, Integer> {
}
