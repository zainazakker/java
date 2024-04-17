import java.util.Scanner;
class UsernameException extends Exception
{
public UsernameException(String msg) {
super(msg);
}
}
class PasswordException extends Exception
{
public PasswordException(String msg) {
super(msg);
}
}
class DemoExcp
{
public static void main(String args[])
{
String name="zaina";
String pass="zainazakker";
Scanner s= new Scanner(System.in);
System.out.print("Enter username :: ");
String user=s.nextLine();
System.out.print("Enter password :: ");
String pwd=s.nextLine();
try
{
if(!user.equals(name))
throw new UsernameException("Username incorrect");
else if(!pwd.equals(pass))
throw new PasswordException("Password incorrect");
else
System.out.println("Login Successful !!!");
}
catch(UsernameException u)
{
u.printStackTrace();
}
catch(PasswordException p)
{
p.printStackTrace();
}
}
}

/*mlm@mlm-desktop:~$ javac DemoExcp.java
mlm@mlm-desktop:~$ java DemoExcp
Enter username :: zaina
Enter password :: zainazakker
Login Successful !!!
*/
