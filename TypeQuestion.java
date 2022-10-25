public class TypeQuestion {
    int typeID;
    typeName name;
    enum typeName {Essay, Multiple_Choice};

    @Override
    public String toString() {
        return "TypeQuestion{" +
                "typeID=" + typeID +
                ", name=" + name +
                '}';
    }
}
