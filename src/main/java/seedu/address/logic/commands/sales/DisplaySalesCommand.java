package seedu.address.logic.commands.sales;

import seedu.address.commons.core.EventsCenter;
import seedu.address.commons.events.ui.DisplaySalesReportEvent;
import seedu.address.logic.CommandHistory;
import seedu.address.logic.commands.Command;
import seedu.address.logic.commands.CommandResult;
import seedu.address.model.Model;

/**
 * Display sales report of a specific date
 */
public class DisplaySalesCommand extends Command {
    public static final String COMMAND_WORD = "display-sales";
    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Generate and display the sales report of a specified "
            + "date.\n"
            + "Parameters: DATE (must be in DD-MM-YYYY format)\n"
            + "Example: " + COMMAND_WORD + " 25-09-2018";

    public static final String DISPLAYING_REPORT_MESSAGE = "Displayed sales report dated: %1$s";

    @Override
    public CommandResult execute(Model model, CommandHistory history) {
        EventsCenter.getInstance().post(new DisplaySalesReportEvent());
        return new CommandResult(DISPLAYING_REPORT_MESSAGE);
    }
}
