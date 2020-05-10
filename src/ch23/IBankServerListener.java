package ch23;

/*
*  E23.3 Modify the BankServer program so that it can be terminated more elegantly. 
Provide another socket on port 8889 through which an administrator can log in. 

Support the commands LOGIN password, STATUS, PASSWORD newPassword, LOGOUT, and 
SHUTDOWN. 

The STATUS command should display the total number of clients that have logged 
in since the server started.

*/

public interface IBankServerListener{
    void onShutDown();
    boolean isRunning();
    int getNumberOfClient();
    void clientDisconnect();
}
