public class SavingsAccount extends Account {
    private double bal;
    private double interest = 1.01;

    public SavingsAccount( int a, double bal,  double interest) {
        super(a);
        this.interest = interest;
        this.bal = (0.0);
    }

    public void withdraw(double sum){
        if (sum>0){
            bal-=sum;    
        }else if(sum>bal){
            System.err.println("You cannot withdraw more than account balance!");
        }
            System.err.println("Account.withdraw(...): "
                       +"cannot withdraw negative amount.");    
        }

    public double accurInterest(){
        return bal = bal * interest;
    }

}