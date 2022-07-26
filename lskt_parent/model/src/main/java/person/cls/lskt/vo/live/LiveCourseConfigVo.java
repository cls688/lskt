package person.cls.lskt.vo.live;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import person.cls.lskt.model.live.LiveCourseConfig;
import person.cls.lskt.model.live.LiveCourseGoods;

import java.util.List;

@Data
@ApiModel(description = "LiveCourseConfig")
public class LiveCourseConfigVo extends LiveCourseConfig {

    @ApiModelProperty(value = "商品列表")
    private List<LiveCourseGoods> liveCourseGoodsList;
}