package bdl.model;

/**
 * Simple Properties object to store name, type, value.
 */
public class Property {
    private String name;
    private boolean enabled;
    private String type;
    private String defaultValue;
    private String getter;
    private String setter;

    public Property(String name, String enabled, String type, String defaultValue, String getter, String setter) {
        this.name = name;
        this.enabled = Boolean.parseBoolean(enabled);
        this.type = type;
        this.defaultValue = defaultValue;
        this.getter = getter;
        this.setter = setter;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getSetter() {
        return setter;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public String getGetter() {
        return getter;
    }
}