//by Reference
class User{
  int id;
  String name;
  String emailId;
  public static void main(String []args){
    User user=new User();
    user.id=100;
    user.name="ajit kumar";
    user.emailId="ajit123@gmail.com";
    
    System.out.println("Id is: "+user.id);
    System.out.println("Name is: "+user.name);
    System.out.println("EmailID is: "+user.emailId);
    System.out.println();

    user.id=102;
    user.name="Rohan";
    user.emailId="Rohan123@gmail.com";

    System.out.println("Id is: "+user.id);
    System.out.println("Name is: "+user.name);
    System.out.println("EmailID is: "+user.emailId);

    
  }
}

