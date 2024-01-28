package com.cjh.ruiji.dto;

import com.cjh.ruiji.entity.Setmeal;
import com.cjh.ruiji.entity.SetmealDish;
import lombok.Data;
import java.util.List;

/**
 * @author cjh
 */
@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
