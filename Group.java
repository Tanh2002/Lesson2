import java.sql.Date;

public class Group {
    public boolean accounts;
    int groupID;
    String groupName;
    Account creatorID;
    Date createDate;

    @Override
    public String toString() {
        return "Group{" +
                "groupID=" + groupID +
                ", groupName='" + groupName + '\'' +
                ", creatorID=" + creatorID +
                ", createDate=" + createDate +
                '}';
    }
}
