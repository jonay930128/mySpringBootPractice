package wrx.xing.domain;

import org.hibernate.validator.constraints.Length;
import wrx.xing.utils.ExcelField;

import javax.validation.constraints.NotNull;

/**
 * Created by Administrator on 2017/3/24.
 */
public class ExampleTestModel {
    @NotNull(message="公司名称不能为空")
    @ExcelField(title="公司名称", align=1, sort=1)
    private String companyName;
    @ExcelField(title="公司id", align=1, sort=2)
//    @Length(min=0, max=2, message="公司id不能为空")
    private String companyId;
    @ExcelField(title="公司地址", align=1, sort=3)
    private String companyAddress;
    @ExcelField(title="公司法人", align=1, sort=4)
    private String leader;
    @ExcelField(title="法人电话", align=1, sort=5)
    private String leaderPhone;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getLeaderPhone() {
        return leaderPhone;
    }

    public void setLeaderPhone(String leaderPhone) {
        this.leaderPhone = leaderPhone;
    }

    @Override
    public String toString() {
        return "ExampleTestModel{" +
                "companyName='" + companyName + '\'' +
                ", companyId='" + companyId + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", leader='" + leader + '\'' +
                ", leaderPhone='" + leaderPhone + '\'' +
                '}';
    }
}
