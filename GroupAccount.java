import java.sql.Date;

public class GroupAccount {
    Group groupID;
    Account accountID;
    Date joinDate;

    @Override
    public String toString() {
        return "GroupAccount{" +
                "groupID=" + groupID +
                ", accountID=" + accountID +
                ", joinDate=" + joinDate +
                '}';
    }
}
