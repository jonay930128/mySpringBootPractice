package wrx.xing.controller;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;
import wrx.xing.domain.ExampleTestModel;
import wrx.xing.utils.BeanValidators;
import wrx.xing.utils.ExportExcel;
import wrx.xing.utils.ImportExcel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;
import java.util.List;
import javax.validation.Validator;

/**
 * Created by Administrator on 2017/3/26.
 */
@Controller
@RequestMapping(value = "excel")
public class ExcelController {
    @Autowired
    private Validator validator;
    @RequestMapping(value = "import", method= RequestMethod.POST)
    public void importFile(MultipartFile file) {
        try {
            int successNum = 0;
//			int failureNum = 0;
            StringBuilder failureMsg = new StringBuilder();
            ImportExcel ei = new ImportExcel(file, 1, 0);
            List<ExampleTestModel> list = ei.getDataList(ExampleTestModel.class);
            for (ExampleTestModel logistics : list){
                try{
                    BeanValidators.validateWithException(validator, logistics);
//                    logisticsService.saveLogistics(logistics);
                    successNum++;
                }catch(ConstraintViolationException ex){
                    ex.printStackTrace();
                }catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
//            addMessage(redirectAttributes, "已成功导入 "+successNum+" 条数据"+failureMsg);
        } catch (Exception e) {
//            addMessage(redirectAttributes, "导入数据失败！失败信息："+e.getMessage());
        }

//        return "redirect:" + adminPath + "/cost/CostManage/list?repage";
    }

    @RequestMapping(value = "import/template",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public void importFileTemplate(HttpServletRequest request,HttpServletResponse response) {
        try {
            String fileName = "Excel测试模板.xlsx";
//            List<ExampleTestModel> list = Lists.newArrayList();
//    		list.add(UserUtils.getUser());
            new ExportExcel("Excel测试模板", ExampleTestModel.class, 2).write(request,response, fileName).dispose();
        } catch (Exception e) {
            e.printStackTrace();
//            addMessage(redirectAttributes, "导入模板下载失败！失败信息："+e.getMessage());
        }
//        return "redirect:" + adminPath + "/sys/user/list?repage";
    }
}
