package kr.co.fastcampus.eatgo.domain;

import kr.co.fastcampus.eatgo.domain.MenuItem;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MenuItemRepository extends CrudRepository<MenuItem, Long> {

    List<MenuItem> findAllByRestaurantId(Long restaurantId);

}
