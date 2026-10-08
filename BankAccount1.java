import java.util.Scanner;
class BankAccount {
String accountNumber;
String accountHolderName;
double balance;
BankAccount(String accNum, String name, double bal) {
accountNumber = accNum;
accountHolderName = name;
balance = bal;}
void deposit(double amount) {
balance = balance + amount;
System.out.println("Amount deposited successfully!");}
void withdraw(double amount) {
if (amount <= balance) {
balance = balance - amount;
System.out.println("Amount withdrawn successfully!");}
else {
System.out.println("Insufficient balance!");}}
double checkBalance() {
return balance;}
void displayAccount() {
System.out.println("Account Number: " + accountNumber);
System.out.println("Account Holder: " + accountHolderName);
System.out.println("Current Balance: " + balance);}}
public class BankAccount1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Account Number: ");
String accNum = sc.nextLine();
System.out.print("Enter Account Holder Name: ");
String name = sc.nextLine();
System.out.print("Enter Initial Balance: ");
double bal = sc.nextDouble();
sc.nextLine(); 
BankAccount account = new BankAccount(accNum, name, bal);
System.out.print("Enter amount to deposit: ");
double depositAmt = sc.nextDouble();
account.deposit(depositAmt);
System.out.print("Enter amount to withdraw: ");
double withdrawAmt = sc.nextDouble();
account.withdraw(withdrawAmt);
System.out.println();
System.out.println("Final Account Details:");
account.displayAccount();
sc.close();}}