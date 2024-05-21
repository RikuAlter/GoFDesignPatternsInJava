package creational.builder;

import java.sql.Timestamp;

public abstract class Builder {
    public abstract Builder id(Long id);
    public abstract Builder name(String name);
    public abstract Builder color(String color);
    public abstract Builder manufactureDate(Timestamp manufactureDate);
    public abstract Builder dealerID(Long dealerId);
}
