package wrx.xing.myEnum;

/**
 * Created by wrx on 2017/3/30.
 */
public enum MyEnumTest implements IEnum{

    SUCCESS(1, "成功"),
    PERMISSION_DENIED(2, "没有权限"),
    BIG_INDEX_ERROR(3, "bigIndex指定错误"),
    UPLOAD_VERIFY_FAIL(4, "上传文件校验失败"),
    TASK_END(5, "任务结束"),
    LOSE_SHEET(6, "文件SHEET缺失"),
    FILE_DATA_ERROR(7, "文件数据错误");


    private final int index;
    private final String mes;

    MyEnumTest(int index, String mes) {
        this.index = index;
        this.mes = mes;
    }

    @Override
    public int getIndex() {
        return this.index;
    }

    public String getMes(){
        return this.mes;
    }
}
