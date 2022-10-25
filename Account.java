import java.sql.Date;
import java.util.Arrays;

public class Account {
    public Group[] groups;
    public String departmentName;
    int accountID;
    String email;
    String userName;
    String fullName;
    Department departmentID;
    Position positionID;
    Date createDate;

    @Override
    public String toString() {
        return "Account{" +
                "groups=" + Arrays.toString(groups) +
                ", accountID=" + accountID +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", departmentID=" + departmentID +
                ", positionID=" + positionID +
                ", createDate=" + createDate +
                '}';
    }
}
