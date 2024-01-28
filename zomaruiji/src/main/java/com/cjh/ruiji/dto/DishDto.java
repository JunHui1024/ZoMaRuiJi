package com.cjh.ruiji.dto;

import com.cjh.ruiji.entity.Dish;
import com.cjh.ruiji.entity.DishFlavor;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

/**
 * @author cjh
 */
@Data
public class DishDto extends Dish {

    //菜品对应的口味数据

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
