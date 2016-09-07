package seedu.addressbook.data.person;

/**
 * Represents a Person's contact in the address book.
 * Abstract class for Phone, Email and Address
 */
public abstract class Contact {
    private final String value = "";
    private boolean isPrivate;


    @Override
    public String toString() {
        return value;
    }

    @Override
    public abstract boolean equals(Object other);

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}