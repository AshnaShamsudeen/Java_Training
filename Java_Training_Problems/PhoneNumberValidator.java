import java.util.Scanner;
class PhoneNumber{
    public String getInput(){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the phone number");
    String number=sc.nextLine();
    return number;}
    public Boolean validatePhoneNumber(String number){
    int count=0;
    Boolean result=false;
    for(int i=0;i<number.length();i++)
    {
        if(number.charAt(i)=='-')
        {continue;}
        
        else if(i>=0||i<=9)
        {count++;}
     
        else{
        break;
        }
    }
    if(count==10)
    {
        result=true;
    }
    else
        {
            result=false;
        }
    return result;
    }
    public void displayResult(boolean result){
        if(result==true){
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
    }
}

class PhoneNumberValidator{
    public static void main(String[] args){
    PhoneNumber ph=new PhoneNumber();
    String p1=ph.getInput();
    boolean p2=ph.validatePhoneNumber(p1);
    ph.displayResult(p2);
}
}



    
