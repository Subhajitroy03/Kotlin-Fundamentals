class Account(var Accountname: String,var Accountno:String){
    private var balance: Int=0
    fun getbalance(): Int {
        return balance
    }
    fun setbalance(balance:Int){
        this.balance=balance
    }
    fun transfer(money:Int,account:Account){
        if(money<0){
            println("Invalid Money")
            return
        }
        if(balance>=money){
            balance=balance-money
            val primarybalance=account.getbalance()
            account.setbalance(primarybalance+money)

        }else{
            println("Not enough balance to transfer")
        }


    }
    fun deposit(money:Int){
        if(money>0){
            balance+=money
        }else{
            println("Invalid Money")
        }
    }
    fun withdraw(money:Int){
        if(money<0){
            println("Invalid Money")
            return
        }
        if(balance>=money){
            balance=balance-money

        }else{
            println("Not enough balance")
        }


    }
}

fun main(){
    val A1:Account=Account("Subhajit","201547856545")
    val A2:Account=Account("Sukrit","1247895445")
    A1.deposit(1500)
    A1.withdraw(200)
    A1.transfer(1000,A2)
    var balance=A2.getbalance()
    println("Balance of A2: $balance")
    balance=A1.getbalance()
    println("Balance of A1: $balance")
    A1.withdraw(5200)
    A2.withdraw(200)
    A1.deposit(500)
    balance=A2.getbalance()
    println("Balance of A2: $balance")
    balance=A1.getbalance()
    println("Balance of A1: $balance")
  

}
