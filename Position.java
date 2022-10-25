public class Position {
    int positionID;
    positionName name;
    enum positionName {Dev, Test, Scrum_Master, PM};

    @Override
    public String toString() {
        return "Position{" +
                "positionID=" + positionID +
                ", name=" + name +
                '}';
    }
}
