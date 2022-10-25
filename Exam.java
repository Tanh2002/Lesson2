import java.sql.Date;
import java.sql.Time;

public class Exam {
    int examID;
    String code;
    String title;
    CategoryQuestion categoryID;
    Time duration;
    Account creatorID;
    Date createDate;

    @Override
    public String toString() {
        return "Exam{" +
                "examID=" + examID +
                ", code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", categoryID=" + categoryID +
                ", duration=" + duration +
                ", creatorID=" + creatorID +
                ", createDate=" + createDate +
                '}';
    }
}
