package kr.co.fastcampus.eatgo.domain;

import kr.co.fastcampus.eatgo.domain.MenuItem;

import java.util.List;

public interface MenuItemRepository {
    List<MenuItem> findAllByRestaurantId(Long restaurantId);

}
