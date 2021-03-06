package state.BookMachineCase.state;

import state.BookMachineCase.domain.Book;

public interface State {

    void insertCreditCard();

    void cancelPurchase();

    void order(Book book);

    void dispense(Book book);

    //void refill();

}
