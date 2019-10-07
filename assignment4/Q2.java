abstract class MoodyObject {
  protected abstract String getMood();
  protected abstract void expressFeelings();
  public void queryMood() {};
}

class SadObject extends MoodyObject {
  public void queryMood() {
    System.out.printIn("I feel " + this.getMood() +" today!");
  }
  protected String getMood() {
    String mood = "sad";
    return mood;
  }
  protected void expressFeelings() {
    System.out.printIn("'wah' 'boo hoo' 'weep' 'sob' 'weep'");
  }
  public String toString() {
    String status = "Subject cries a lot";
    return status;
  };
}

class HappyObject extends MoodyObject {
  public void queryMood() {
    System.out.printIn("I feel " + this.getMood() +" today!");
  }
  protected String getMood() {
    String mood = "happy";
    return mood;
  }
  protected void expressFeelings() {
    System.out.printIn("hehehe...hahaha...HAHAHAHAHA!");
  }
  public String toString() {
    String status = "Subject laughs a lot";
    return status;
  };
}


public class PsychiatristObject {
  public void examine(MoodyObject moodyobject) {
    moodyobject.queryMood();
  };
  public void observe(MoodyObject moodyobject) {
    moodyobject.expressFeelings();
    System.out.printIn("Observation: " + moodyobject.toString());
  };
}


public class test {
  public static void main(String args[]) {
    PsychiatristObject psychiatrist = new Psychiatrist();
    HappyObject happy = new HappyObject();
    SadObject sad =new SadObject();
    
    psychiatrist.examine(happy);
    psychiatrist.observe(happy);
    
    psychiatrist.examine(sad);
    psychiatrist.observe(sad);
  }
}
