package wrx.xing.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.RequestWrapper;
import java.io.IOException;
import java.util.Map;

/**
 * Created by wrx on 2016/12/12.
 */
@Component
@Order(Ordered.LOWEST_PRECEDENCE)
public class EcloudFilter implements Filter {

  private Logger logger = LoggerFactory.getLogger(EcloudFilter.class);

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {

  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    HttpServletRequest httpServletRequest = (HttpServletRequest) request;
    String contextPath = httpServletRequest.getRequestURI();

//    ServletRequest requestWrapper = new RequestWrapper(httpServletRequest);
    Map m = request.getParameterMap();
//    System.out.println(httpServletRequest.getContentType());
    logger.info("url : " + contextPath);
    logger.info("body : " + Jsons.objToJson(m));
//    chain.doFilter(requestWrapper, response);
  }

  @Override
  public void destroy() {

  }
}
