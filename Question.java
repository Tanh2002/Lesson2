import java.sql.Date;

public class Question {
    int questionID;
    String content;
    int categoryID;
    TypeQuestion typeID;
    Account creatorID;
    Date createDate;

    @Override
    public String toString() {
        return "Question{" +
                "questionID=" + questionID +
                ", content='" + content + '\'' +
                ", categoryID=" + categoryID +
                ", typeID=" + typeID +
                ", creatorID=" + creatorID +
                ", createDate=" + createDate +
                '}';
    }
}
