class TransactionHistory {
    int transactionID;
    String senderName;
    String receiverName;
    double amount;
    String transactionStatus;
    String transactionDate;

    TransactionHistory(int transactionID, String senderName, String receiverName, double amount, String transactionStatus, String transactionDate) {
        this.transactionID = transactionID;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.amount = amount;
        this.transactionStatus = transactionStatus;
        this.transactionDate = transactionDate;
    }

    void display() {
        System.out.println("Transaction ID: " + transactionID);
        System.out.println("Sender: " + senderName);
        System.out.println("Receiver: " + receiverName);
        System.out.println("Amount: ₹" + amount);
        System.out.println("Status: " + transactionStatus);
        System.out.println("Date: " + transactionDate);
    }
}

public class Main {
    public static void main(String[] args) {
        TransactionHistory history = new TransactionHistory(1, "Alice", "Bob", 5000, "Completed", "2025-05-14 14:30:00");
        history.display();
    }
}
