package wrx.xing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import wrx.xing.domain.CustomColumn;
import wrx.xing.domain.ExampleTestModel;
import wrx.xing.domain.SqlTools;
import wrx.xing.mapper.ExampleTestMapper;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Created by Administrator on 2017/3/24.
 */
@RestController
@RequestMapping(value = "/exampleTest",method = RequestMethod.POST)
public class ExampleTestController {
    @Autowired
    private ExampleTestMapper exampleTestMapper;

    @RequestMapping("selectCustom")
    public Object selectCustom(){
        SqlTools sqlTools = new SqlTools();
        CustomColumn customColumn = CustomColumn.createCustomColumn()
                .add("company_name", "companyName")
                .add("company_id","companyId");
        sqlTools.setCustomColumn(customColumn);
        sqlTools.setTableName("example_test");
        sqlTools.createCriteria().andColumnEqualTo("leader","wrx");
        customColumn.selectColumn.forEach(e -> {
            sqlTools.or().andColumnEqualTo(e.get("column"),e.get("asName"));
        });
        List<Map> exampleTestModels = exampleTestMapper.selectCustom(sqlTools);
        exampleTestModels.forEach(item -> {
            System.out.println(item);
        });
        return exampleTestModels;
    }

}
