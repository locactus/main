package guitests.guihandles;

import guitests.guihandles.accounts.UsernameDisplayHandle;
import guitests.guihandles.menu.ItemListPanelHandle;
import javafx.stage.Stage;

/**
 * Provides a handle for {@code MainWindow}.
 */
public class MainWindowHandle extends StageHandle {

    private final ItemListPanelHandle itemListPanel;
    private final ResultDisplayHandle resultDisplay;
    private final CommandBoxHandle commandBox;
    private final StatusBarFooterHandle statusBarFooter;
    private final MainMenuHandle mainMenu;
    private final BrowserPanelHandle browserPanel;
    private final UsernameDisplayHandle usernameDisplay;

    public MainWindowHandle(Stage stage) {
        super(stage);

        itemListPanel = new ItemListPanelHandle(getChildNode(ItemListPanelHandle.ITEM_LIST_VIEW_ID));
        resultDisplay = new ResultDisplayHandle(getChildNode(ResultDisplayHandle.RESULT_DISPLAY_ID));
        commandBox = new CommandBoxHandle(getChildNode(CommandBoxHandle.COMMAND_INPUT_FIELD_ID));
        statusBarFooter = new StatusBarFooterHandle(getChildNode(StatusBarFooterHandle.STATUS_BAR_PLACEHOLDER));
        mainMenu = new MainMenuHandle(getChildNode(MainMenuHandle.MENU_BAR_ID));
        browserPanel = new BrowserPanelHandle(getChildNode(BrowserPanelHandle.BROWSER_ID));
        usernameDisplay = new UsernameDisplayHandle(getChildNode(UsernameDisplayHandle.USERNAME_DISPLAY_ID));
    }

    public ItemListPanelHandle getItemListPanel() {
        return itemListPanel;
    }

    public ResultDisplayHandle getResultDisplay() {
        return resultDisplay;
    }

    public CommandBoxHandle getCommandBox() {
        return commandBox;
    }

    public StatusBarFooterHandle getStatusBarFooter() {
        return statusBarFooter;
    }

    public MainMenuHandle getMainMenu() {
        return mainMenu;
    }

    public BrowserPanelHandle getBrowserPanel() {
        return browserPanel;
    }

    public UsernameDisplayHandle getUsernameDisplay() {
        return usernameDisplay;
    }
}
