package wrx.xing.response;


/**
 * Created by alei on 2015/4/2.
 */
public class SuccessResponse extends AbstractResponse {
  public SuccessResponse() {
    super(IResponse.STATUS_SUCCESS, IResponse.SUC_CODE);
  }

  public SuccessResponse(Object data) {
    this();
    this.setData(data);
  }
}
