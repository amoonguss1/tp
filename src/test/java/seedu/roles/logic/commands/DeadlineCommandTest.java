package seedu.roles.logic.commands;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static seedu.roles.commons.core.Messages.MESSAGE_DEADLINE_COMMAND_FORMAT;
import static seedu.roles.logic.commands.CommandTestUtil.assertCommandSuccess;
import static seedu.roles.testutil.TypicalRoles.getTypicalRoleBook;

import org.junit.jupiter.api.Test;

import seedu.roles.logic.parser.OrderParser;
import seedu.roles.model.Model;
import seedu.roles.model.ModelManager;
import seedu.roles.model.UserPrefs;

/**
 * Contains integration tests (interaction with the Model) for {@code NameCommand}.
 */
public class DeadlineCommandTest {
    private Model model = new ModelManager(getTypicalRoleBook(), new UserPrefs());
    private Model expectedModel = new ModelManager(getTypicalRoleBook(), new UserPrefs());

    @Test
    public void equals() {

        OrderParser orderParser1 = new OrderParser("asc");
        OrderParser orderParser2 = new OrderParser("desc");

        DeadlineCommand deadlineFirstCommand = new DeadlineCommand(orderParser1);
        DeadlineCommand deadlineSecondCommand = new DeadlineCommand(orderParser2);

        // different types -> returns false
        assertFalse(deadlineFirstCommand.equals(1));

        // null -> returns false
        assertFalse(deadlineFirstCommand.equals(null));

        // different sorted list -> returns false
        assertFalse(deadlineFirstCommand.equals(deadlineSecondCommand));
    }

    @Test
    public void execute_asecOrder() {
        String expectedMessage = String.format(MESSAGE_DEADLINE_COMMAND_FORMAT, "asc");
        DeadlineCommand command = new DeadlineCommand(new OrderParser("asc"));
        expectedModel.displaySortedDeadlineList(new OrderParser("asc"));
        assertCommandSuccess(command, model, expectedMessage, expectedModel);
    }
}