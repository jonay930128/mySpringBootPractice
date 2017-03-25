package wrx.xing.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import wrx.xing.mapper.SpringBootPracticeMapper;
import wrx.xing.mapper.SpringBootTest;

import java.util.List;

/**
 * Created by Administrator on 2017/2/22.
 */
@Controller
@RequestMapping(value = "test",method = RequestMethod.GET)
public class SpringBootPracticeController {
    @Autowired
    private SpringBootPracticeMapper mapper;

    @ApiOperation(value="根据名称获取用户信息", notes="")
    @ApiImplicitParam(name = "name", value = "用户名称", required = true, dataType = "String")
    @RequestMapping(value = "findById",produces = "application/json")
    public List<SpringBootTest> findById(String name) throws Exception {
        List<SpringBootTest> wrx = mapper.findByName(name);
        System.out.println(1);
        return wrx;
    }
}
