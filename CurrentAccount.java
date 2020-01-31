public class CurrentAccount extends Account{

    public double bal;

    public CurrentAccount(int a, double bal){
        super(a);
        this.bal = 0.0;
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
    

    public void Overdrawn(){
        if(bal<-100){
            System.err.println("You cannot overdraw your account over $100!");
        }else{
            System.out.println("==================");
        }
    }

}