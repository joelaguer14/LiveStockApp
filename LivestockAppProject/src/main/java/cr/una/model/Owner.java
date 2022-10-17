package cr.una.model;

public class Owner {
    //attributes with annotations for Hibernate
    private String fullName;
    private String Id;
    private String DBId;
    private String propertyName;

    public Owner() {
        this.fullName = "";
        this.Id = "";
        this.DBId = "";
        this.propertyName = "";
    }

    public Owner(String fullName, String id, String DBId, String propertyName) {
        this.fullName = fullName;
        this.Id = id;
        this.DBId = DBId;
        this.propertyName = propertyName;
    }

    public Owner(String fullName, String id, String propertyName) {
        this.fullName = fullName;
        Id = id;
        this.propertyName = propertyName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getDBId() {
        return DBId;
    }

    public void setDBId(String DBId) {
        this.DBId = DBId;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "fullName='" + fullName + '\'' +
                ", Id='" + Id + '\'' +
                ", DBId='" + DBId + '\'' +
                ", propertyName='" + propertyName + '\'' +
                '}';
    }



}
