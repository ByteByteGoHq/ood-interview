package atm.states;

import atm.ATMMachine;

import java.math.BigDecimal;

/**
 * ATMState is an abstract class that defines the state of the ATM.
 * This abstract class contains the default behavior for each state, which usually
 * renders a message to the display and does not perform any action.
 */
public class ATMState {
    // Displays an invalid action message on the ATM screen
    private static void renderDefaultAction(ATMMachine atmMachine) {
        atmMachine.getDisplay().showMessage("Invalid action, please try again.");
    }

    // Default implementation for card insertion
    public void processCardInsertion(ATMMachine atmMachine, String cardNumber) {
        renderDefaultAction(atmMachine);
    }

    // Default implementation for card ejection
    public void processCardEjection(ATMMachine atmMachine) {
        renderDefaultAction(atmMachine);
    }

    // Default implementation for PIN entry
    public void processPinEntry(ATMMachine atmMachine, String pin) {
        renderDefaultAction(atmMachine);
    }

    // Default implementation for withdrawal request
    public void processWithdrawalRequest(ATMMachine atmMachine) {
        renderDefaultAction(atmMachine);
    }

    // Default implementation for deposit request
    public void processDepositRequest(ATMMachine atmMachine){
        renderDefaultAction(atmMachine);
    }

    // Default implementation for amount entry
    public void processAmountEntry(ATMMachine atmMachine, BigDecimal amount) {
        renderDefaultAction(atmMachine);
    }

    // Default implementation for deposit collection
    public void processDepositCollection(ATMMachine atmMachine, BigDecimal amount) {
        renderDefaultAction(atmMachine);
    }
}
