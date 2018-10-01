package seedu.address.model.ingredient;

import java.util.Objects;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

/**
 * Represents an ingredient in the restaurant management app.
 * Guarantees: details are present and not null, field values are validated, immutable.
 */
public class Ingredient {

    // Identity fields
    private final IngredientName name;

    /**
     * Every field must be present and not null.
     */
    public Ingredient(IngredientName name) {
        requireAllNonNull(name);
        this.name = name;
    }

    public IngredientName getName() {
        return name;
    }

    @Override
    public int hashCode() {
        // use this method for custom fields hashing instead of implementing your own
        return Objects.hash(name);
    }
}
