package wrx.xing.domain;

/**
 * Created by Administrator on 2017/3/24.
 */
public class ExampleTestModel {
    private String companyName;
    private String companyId;
    private String companyAddress;
    private String leader;
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
