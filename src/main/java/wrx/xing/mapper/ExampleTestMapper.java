package wrx.xing.mapper;


import wrx.xing.domain.ExampleTestModel;
import wrx.xing.domain.SqlTools;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/24.
 */
public interface ExampleTestMapper {
    List<Map> selectCustom(SqlTools sqlTools);
}
