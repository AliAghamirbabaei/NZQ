package Model.Transaction;

import java.util.Objects;

public enum TransactionType {
    DEBT("بدهکار"),
    CREDIT("بستانکار");

    private final String name;

    TransactionType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static TransactionType findByName(String name) {
        for (TransactionType item : values()) {
            if (Objects.equals(item.name, name)) return item;
        }
        return null;
    }
}
