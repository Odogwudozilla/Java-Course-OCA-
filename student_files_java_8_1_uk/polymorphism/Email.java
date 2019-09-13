class Email extends Message {  

  void send() { 
     System.out.println("email sent");
  }

  String getReplyAddress(){
    return "info@5hart.nl";
  }
}
