private void displayMenu() {
    System.out.println("Welcome to the ATM!");
    System.out.println("1. Withdraw");
    System.out.println("2. Deposit");
    System.out.println("3. Check balance");
    System.out.println("4. Exit");
    System.out.print("Enter your choice: ");
}

private void withdraw(Scanner scanner) {
    System.out.print("Enter amount to withdraw: ");
    double amount = scanner.nextDouble();
    if (account.withdraw(amount)) {
        System.out.println("Withdrawal successful.");
    } else {
        System.out.println("Insufficient balance.");
    }
}

