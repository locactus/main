package seedu.address.logic.parser.menu;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CliSyntax.PREFIX_RECIPE;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.menu.RecipeItemCommand;
import seedu.address.logic.parser.ArgumentMultimap;
import seedu.address.logic.parser.ArgumentTokenizer;
import seedu.address.logic.parser.Parser;
import seedu.address.logic.parser.ParserUtil;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.menu.Recipe;

/**
 * Parses input arguments and creates a new RecipeItemCommand object
 */
public class RecipeItemCommandParser implements Parser<RecipeItemCommand> {
    /**
     * Parses the given {@code String} of arguments in the context of the RecipeItemCommand
     * and returns an RecipeItemCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public RecipeItemCommand parse(String args) throws ParseException {
        requireNonNull(args);
        ArgumentMultimap argMultimap =
                ArgumentTokenizer.tokenize(args, PREFIX_RECIPE);

        Index index;

        try {
            index = ParserUtil.parseIndex(argMultimap.getPreamble());
        } catch (ParseException pe) {
            throw new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT,
                    RecipeItemCommand.MESSAGE_USAGE), pe);
        }

        String recipe = argMultimap.getValue(PREFIX_RECIPE).orElse("");
        return new RecipeItemCommand(index, new Recipe(recipe));
    }
}
