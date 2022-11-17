package Model.Transaction;

import java.util.Objects;

public enum PrePaidStatus {
    YES("بله"),
    NO("خیر");
    private final String name;

    PrePaidStatus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static PrePaidStatus findByName(String name) {
        for (PrePaidStatus item : values()) {
            if (Objects.equals(item.name, name)) return item;
        }
        return null;
    }
}
