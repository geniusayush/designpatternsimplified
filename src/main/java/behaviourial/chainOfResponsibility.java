package behaviourial;

public class chainOfResponsibility {
    /*    Now let's prepare the chain using the links defined above (i.e. Bank, Paypal, Bitcoin)

// Let's prepare a chain like below
//      $bank->$paypal->$bitcoin
//
// First priority bank
//      If bank can't pay then paypal
//      If paypal can't pay then bit coin

        $bank=new Bank(100);          // Bank with balance 100
        $paypal=new Paypal(200);      // Paypal with balance 200
        $bitcoin=new Bitcoin(300);    // Bitcoin with balance 300

        $bank->setNext($paypal);
        $paypal->setNext($bitcoin);

// Let's try to pay using the first priority i.e. bank
        $bank->pay(259);

// Output will be
// ==============
// Cannot pay using bank. Proceeding ..
// Cannot pay using paypal. Proceeding ..:
// Paid 259 using Bitcoin!
    * */
}

abstract class Account {
    Account successor;
    int balance;

    public void setNext(Account $account) {
        successor = $account;
    }

    public void pay(int $amountToPay) throws Exception {
        if (canPay($amountToPay)) {
            System.out.printf("Paid %s using %s", $amountToPay, get_called_class());
        } else if (successor!=null) {
            System.out.printf("Cannot pay using %s. Proceeding ..", get_called_class());
            successor.pay($amountToPay);
        } else {
            throw new Exception("None of the accounts have enough balance");
        }
    }

    protected abstract Object get_called_class();

    public boolean canPay(int amount) {
        return (balance >= amount);
    }
}

class Bank extends Account {


    protected String get_called_class() {
        return "Bank";
    }

    public Bank(int balance) {
        this.balance=balance;
    }
}

class Paypal extends Account {

    protected String get_called_class() {
        return "PayPal";
    }

    public Paypal(int balance) {
        this.balance=balance;
    }
}

class Bitcoin extends Account {
    protected String get_called_class() {
        return "Bank";
    }

    public Bitcoin(int balance) {
        this.balance = balance;
    }
}
