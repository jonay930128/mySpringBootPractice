package wrx.xing.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import wrx.xing.response.FailResponse;
import wrx.xing.response.IResponse;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理
 * Created by wrx on 2017/5/4.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public IResponse resolveException(HttpServletRequest request,Exception e){
        logger.error("报错请求路径:"+request.getRequestURL().toString(),e);
        return new FailResponse(e.getMessage());
    }
}
