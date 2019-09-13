interface Movement {
  default String run(){
    return "runs in big steps";
  }
}

interface Application {
  default String run(){
    return "is working";
  }
}

class Robot implements Movement, Application {
  public String run(){      // override necessary
    return Application.super.run()+": "+Movement.super.run();
  }
}

//  otherwise at compile time:
//  error: class Robot inherits unrelated defaults for run()
//  from types Movement and Application 
