package seedu.techtrack.logic.parser;

import static seedu.techtrack.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.techtrack.logic.commands.DeadlineCommand;
import seedu.techtrack.logic.commands.exceptions.exceptions.ParseException;

/**
 * Parses input arguments and creates a new SalaryCommand object
 */
public class DeadlineCommandParser implements Parser<DeadlineCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the Deadlineommand
     * and returns a DeadlineCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public DeadlineCommand parse(String args) throws ParseException {
        try {
            OrderParser orderParser = ParserUtil.parseOrder(args);
            return new DeadlineCommand(orderParser);
        } catch (ParseException pe) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, DeadlineCommand.MESSAGE_USAGE), pe);
        }
    }
}